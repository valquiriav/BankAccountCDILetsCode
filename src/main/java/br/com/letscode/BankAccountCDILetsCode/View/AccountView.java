package br.com.letscode.BankAccountCDILetsCode.View;

import br.com.letscode.BankAccountCDILetsCode.Domain.Account;
import br.com.letscode.BankAccountCDILetsCode.Domain.User;

import java.math.BigDecimal;

public interface AccountView {
    public Account createAcc(User user);
    public void deposit(User user, BigDecimal value);
    public void withdraw(User user, BigDecimal value);
    public void balance(User user, Account account);
}
