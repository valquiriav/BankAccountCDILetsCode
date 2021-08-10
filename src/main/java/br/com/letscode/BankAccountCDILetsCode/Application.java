package br.com.letscode.BankAccountCDILetsCode;

import br.com.letscode.BankAccountCDILetsCode.View.UserView;

import javax.inject.Inject;

public class Application {
    @Inject
    private UserView userView;

    public UserView getUserView(){
        return userView;
    }
}
