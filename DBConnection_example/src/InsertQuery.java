import java.sql.*;

public class InsertQuery {

 
	
	    public static void main(String args[]) 
	    { 
	    	
	    	   int emp_id = 1001; 
	           String emp_name = "Sai"; 
	           String emp_sal = "50000"; 
	           int emp_deptid = 102; 
	           
	        try
	        { 
	            Class.forName("oracle.jdbc.driver.OracleDriver"); 
	            
	            // Establishing Connection 
	            Connection con = DriverManager.getConnection( 
	             "jdbc:oracle:thin:@localhost:1521:ADMIN", "hr", "hr"); 
	            
	            Statement stmt = con.createStatement();  
	            
	            // SELECT query 
	            String insert_query = "insert into EMP_JAVA values('" +emp_id+ "', '" +emp_name+  
                        "', '" +emp_sal+ "', '" +emp_deptid+ "')";
	            
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
	
	
	
