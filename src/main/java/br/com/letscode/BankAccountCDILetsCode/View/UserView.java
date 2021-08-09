package br.com.letscode.BankAccountCDILetsCode.View;

import br.com.letscode.BankAccountCDILetsCode.Domain.User;

import java.util.Scanner;

public interface UserView {

    public void createUser(Scanner scanner);
    public User getUser(String name);
}
