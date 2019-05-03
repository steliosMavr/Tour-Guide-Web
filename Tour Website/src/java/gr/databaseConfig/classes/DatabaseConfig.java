package gr.databaseConfig.classes;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.sql.DataSource;

public class DatabaseConfig implements ServletContextListener {

    private static final String url = "java:/comp/env/";
    private static DataSource dataSource;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Context initContext;
        try {
            initContext = new InitialContext();
            Context envContext = (Context) initContext.lookup(url);
            dataSource = (DataSource) envContext.lookup("jdbc/worldDB");
            DataAccessObject.setDataSource(dataSource);
        } catch (NamingException ex) {
            Logger.getLogger(DatabaseConfig.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
      
    }

}
