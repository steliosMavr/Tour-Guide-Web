

package gr.databaseConfig.classes;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;


public class DataAccessObject {
     private static DataSource dataSource;

    public static void setDataSource(DataSource dataSource){
         DataAccessObject.dataSource = dataSource;
    }
    
     
     protected static Connection getConnection() 
   {
      try {
         return dataSource.getConnection();
      } catch (SQLException e) {
         throw new RuntimeException(e);
      }
   }

  
    
}
