package br.com.letscode.BankAccountCDILetsCode;

import br.com.letscode.BankAccountCDILetsCode.Domain.Account;
import br.com.letscode.BankAccountCDILetsCode.Domain.AccountEnum;
import br.com.letscode.BankAccountCDILetsCode.Domain.User;
import br.com.letscode.BankAccountCDILetsCode.Services.AccountFactory;
import br.com.letscode.BankAccountCDILetsCode.View.UserView;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    private List<User> users;

    @Inject
    private UserView userView;

    @Inject
    private AccountFactory accountFactory;

    @PostConstruct
    public void init(){
        System.out.println("Getting started...");
        users = new ArrayList<>();
    }

    public void createUser(Scanner scanner) {
        getUsers().add(userView.create(scanner));
    }

    public Account createAccount(AccountEnum accountEnum, Account account){
        return accountFactory.createAccount(accountEnum).createAccount(account);
    }

    public List<User> getUsers() {return users;}
}