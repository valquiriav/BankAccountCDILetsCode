package br.com.letscode.BankAccountCDILetsCode.DAO;

import br.com.letscode.BankAccountCDILetsCode.Domain.User;

public class UserDAOImpl implements UserDAO{

    @Override
    public User create(User user) {
        //TODO salvar e resgatar o caminho do arquivo
        user.setPath("User path");
        return user;
    }
}
