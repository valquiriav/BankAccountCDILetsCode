package br.com.letscode.BankAccountCDILetsCode;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Main {

    public static void main(String[] args){
        final WeldContainer container = new Weld().initialize();
        final Application application = container.select(Application.class).get();
        init(application);
    }

    private static void init(Application application) {

    }
}
