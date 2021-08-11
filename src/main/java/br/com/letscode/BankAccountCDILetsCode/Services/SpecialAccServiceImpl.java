package br.com.letscode.BankAccountCDILetsCode.Services;

import br.com.letscode.BankAccountCDILetsCode.AccountType;
import br.com.letscode.BankAccountCDILetsCode.Domain.Account;
import br.com.letscode.BankAccountCDILetsCode.Domain.AccountEnum;

//substitui o switch!
@AccountType(value = AccountEnum.SPECIAL)
public class SpecialAccServiceImpl implements AccountService{

    @Override
    public Account createAccount(Account account) {
        System.out.println("Creating Special Account");
        return null;
    }
}
