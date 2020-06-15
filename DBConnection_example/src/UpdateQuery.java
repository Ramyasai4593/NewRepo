
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
 
public class UpdateQuery {
 
    public static void main(String[] args) {
         
        Connection con = null;
        Statement stmt = null;
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.
                    getConnection("jdbc:oracle:thin:@localhost:1521:ADMIN", "hr", "hr");
            stmt = con.createStatement();
            String query = "update EMP_JAVA set emp_sal=100000 where emp_id=1000";
            
            //count will give you how many records got updated
            int count = stmt.executeUpdate(query);
            
            System.out.println("Updated queries: "+count);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try{
                if(stmt != null) stmt.close();
                if(con != null) con.close();
            } catch(Exception ex){}
        }
    }
}
