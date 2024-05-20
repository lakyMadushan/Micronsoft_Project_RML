
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB {
    static Connection c;
    public static Connection Createconnection()throws Exception{
        
       Class.forName("com.mysql.cj.jdbc.Driver");
       c = DriverManager.getConnection("jdbc:mysql://localhost:3307/rml?useSSL=false","root","lak170BG@");
       return c;
    }
    
    public static void iud(String sql) throws Exception{
        if(c == null){
            Createconnection();
        }
        c.createStatement().executeUpdate(sql);
    }
    
    public static ResultSet search(String sql) throws Exception{
        if(c == null){
            Createconnection();
        }

        return c.createStatement().executeQuery(sql);
    }
    
}
