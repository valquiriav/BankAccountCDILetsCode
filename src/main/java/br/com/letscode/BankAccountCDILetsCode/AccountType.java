package br.com.letscode.BankAccountCDILetsCode;

import br.com.letscode.BankAccountCDILetsCode.Domain.AccountEnum;

import javax.inject.Qualifier;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Qualifier
@Target(ElementType.TYPE)
@Retention((RetentionPolicy.RUNTIME))
public @interface AccountType {
    AccountEnum value();
}
