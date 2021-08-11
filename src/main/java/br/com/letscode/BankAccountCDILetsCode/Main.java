package br.com.letscode.BankAccountCDILetsCode;

import br.com.letscode.BankAccountCDILetsCode.Domain.Account;
import br.com.letscode.BankAccountCDILetsCode.Domain.AccountEnum;
import br.com.letscode.BankAccountCDILetsCode.Domain.User;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        final WeldContainer container = new Weld().initialize();
        final Application application = container.select(Application.class).get();
        init(application);
    }

    private static void init(Application application) {
        int option = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Welcome! Choose an option: \n 1 - Create user \n 2 - Create account \n 0 - Logout");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    application.createUser(scanner);
                    application.getUsers().stream()
                            .map(User::getFilePath).forEach(System.out::println);
                    break;
                case 2:
                    System.out.println("Choose the type of your new account: \n 1 - Savings Account \n 2 - Special Account");
                    int accOption = scanner.nextInt();
                    AccountEnum accountEnum = null;
                        switch (accOption){
                            case 1:
                                accountEnum = AccountEnum.SAVINGS;
                                break;
                            case 2:
                                accountEnum = AccountEnum.SPECIAL;
                                break;
                        }
                        application.createAccount(accountEnum, new Account());
                        break;
                case 0:
                    System.exit(0);
                default:
                    System.err.println("Invalid option.");
            }
        } while (option > 0);
    }
}
