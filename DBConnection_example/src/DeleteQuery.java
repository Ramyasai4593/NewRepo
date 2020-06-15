import java.sql.*;

public class DeleteQuery {

 
	
	    public static void main(String args[]) 
	    { 
	        try
	        { 
	            Class.forName("oracle.jdbc.driver.OracleDriver"); 
	            
	            // Establishing Connection 
	            Connection con = DriverManager.getConnection( 
	             "jdbc:oracle:thin:@localhost:1521:ADMIN", "hr", "hr"); 
	            
	            Statement stmt = con.createStatement();  
	            
	          
	         // DELETE query 
	            String insert_query = "DELETE from EMP_JAVA where emp_id=";
	            
	            int x = stmt.executeUpdate(insert_query); 
	            
	     
	            if (x > 0) 
	            { 
	                System.out.println("Insertion success"); 
	            
	            } 
	            else
	            { 
	                System.out.println("Insertion Failed"); 
	            } 
	            con.close(); 
	        } 
	        catch(Exception e) 
	        { 
	            System.out.println(e); 
	        } 
	    } 
	} 
	
	
	
