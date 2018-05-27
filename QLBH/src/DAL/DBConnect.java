package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author My PC
 */
public class DBConnect {
    static String urlCon = "jdbc:mysql://localhost:8888/qlbh;root;2464";
    static Connection conn = null;
    public static Connection MoKetNoi() {
      try{
          conn = DriverManager.getConnection("jdbc:mysql://localhost:8888/qlbh","root","2464");
          return conn;
      }  catch (SQLException ex){
          return null;
      }
    }
}
