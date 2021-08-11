package br.com.letscode.BankAccountCDILetsCode.View;

import br.com.letscode.BankAccountCDILetsCode.Domain.User;

import java.util.Scanner;

public interface UserView {

    public User create(Scanner scanner);
    public User authenticate(Scanner scanner);
}
