package br.com.letscode.BankAccountCDILetsCode.View;

import br.com.letscode.BankAccountCDILetsCode.Domain.User;
import br.com.letscode.BankAccountCDILetsCode.Services.UserService;

import javax.inject.Inject;
import java.util.Scanner;

public class UserViewImpl implements UserView{

    @Inject
    private UserService userService;

    @Override
    public User create(Scanner scanner){
        User user = new User();
        System.out.println("Please inform your name:");
        user.setName(scanner.next());
        System.out.println("Please inform your tax number:");
        user.setTaxNumber(scanner.nextLong());
        return user;
    }
}
