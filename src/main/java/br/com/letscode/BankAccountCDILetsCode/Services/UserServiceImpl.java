package br.com.letscode.BankAccountCDILetsCode.Services;

import br.com.letscode.BankAccountCDILetsCode.DAO.UserDAO;
import br.com.letscode.BankAccountCDILetsCode.Domain.User;

import javax.inject.Inject;

public class UserServiceImpl implements UserService{

    @Inject
    private UserDAO userDAO;

    @Override
    public User create(User user) {
        return userDAO.create(user);
    }
}
