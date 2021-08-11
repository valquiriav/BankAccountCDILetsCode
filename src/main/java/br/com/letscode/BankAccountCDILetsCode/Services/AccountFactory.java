package br.com.letscode.BankAccountCDILetsCode.Services;

import br.com.letscode.BankAccountCDILetsCode.Annotation.AccountAnnotationLiteral;
import br.com.letscode.BankAccountCDILetsCode.Domain.AccountEnum;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;

public class AccountFactory {

    @Inject
    private Instance<AccountService> accountServiceInstance;

    public AccountService createAccount(AccountEnum accountEnum){
        //switch foi substituído
        final AccountAnnotationLiteral literal = new AccountAnnotationLiteral(accountEnum);
        return accountServiceInstance.select(literal).get();
    }
}
