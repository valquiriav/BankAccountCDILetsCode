package br.com.letscode.BankAccountCDILetsCode.View;

import br.com.letscode.BankAccountCDILetsCode.Domain.User;
import br.com.letscode.BankAccountCDILetsCode.Services.UserService;

import javax.inject.Inject;
import java.util.Random;
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
        Random rand = new Random();
        user.setCode(rand.nextInt(99999));
        userService.create(user);
        System.out.printf("User %s was successfully created.\n Your authentication code is:\n %d \n Don't loose it! This will be the key to access your account.", user.getName(), user.getCode());
        return user;
    }

    @Override
    public User authenticate(Scanner scanner) {
        System.out.println("PLease inform your authentication code:");

        return null;
    }
}
