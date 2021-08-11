package br.com.letscode.BankAccountCDILetsCode.Annotation;

import br.com.letscode.BankAccountCDILetsCode.AccountType;
import br.com.letscode.BankAccountCDILetsCode.Domain.AccountEnum;

import javax.enterprise.util.AnnotationLiteral;

public class AccountAnnotationLiteral extends AnnotationLiteral<AccountType> implements AccountType{

    private final AccountEnum accountEnum;

    public AccountAnnotationLiteral(AccountEnum accountEnum) {
        this.accountEnum = accountEnum;
    }

    @Override
    public AccountEnum value() {
        return AccountEnum.SPECIAL;
    }
}
