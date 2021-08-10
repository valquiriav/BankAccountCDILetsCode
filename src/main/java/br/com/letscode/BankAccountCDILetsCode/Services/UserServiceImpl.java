package br.com.letscode.BankAccountCDILetsCode.Services;

import br.com.letscode.BankAccountCDILetsCode.Domain.User;

public class UserServiceImpl implements UserService{
    @Override
    public User create(User user) {
        return user;
    }
}
