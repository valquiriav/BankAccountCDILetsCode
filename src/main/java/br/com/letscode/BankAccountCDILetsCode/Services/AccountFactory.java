package br.com.letscode.BankAccountCDILetsCode.Services;

import br.com.letscode.BankAccountCDILetsCode.Domain.AccountEnum;

public class AccountFactory {

    public AccountService createAccount(AccountEnum accountEnum){
        switch (accountEnum){
            case SPECIAL:
                return new SpecialAccServiceImpl();
            case SAVINGS:
                return new SavingsAccServiceImpl();
        }
        return null;
    }
}
