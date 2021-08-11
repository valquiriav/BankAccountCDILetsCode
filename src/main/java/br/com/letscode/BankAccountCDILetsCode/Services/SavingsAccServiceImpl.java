package br.com.letscode.BankAccountCDILetsCode.Services;

import br.com.letscode.BankAccountCDILetsCode.AccountType;
import br.com.letscode.BankAccountCDILetsCode.Domain.Account;
import br.com.letscode.BankAccountCDILetsCode.Domain.AccountEnum;

@AccountType(value = AccountEnum.SAVINGS)
public class SavingsAccServiceImpl implements AccountService{

    @Override
    public Account createAccount(Account account) {
        System.out.println("Creating Savings Account");
        return null;
    }
}
