package br.com.letscode.BankAccountCDILetsCode;

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
            System.out.println("Welcome! Choose an option: \n 1 - Authenticate user \n 2 - Create user \n 0 - Logout");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    application.getUserView().authenticate(scanner);
                    break;
                case 2:
                    application.getUserView().create(scanner);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.err.println("Invalid option.");
            }
        } while (option > 0);
    }
}
