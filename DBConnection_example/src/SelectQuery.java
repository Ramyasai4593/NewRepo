import java.sql.*;

public class SelectQuery {

 
	
	    public static void main(String args[]) 
	    { 
	        try
	        { 
	            Class.forName("oracle.jdbc.driver.OracleDriver"); 
	            
	            // Establishing Connection 
	            Connection con = DriverManager.getConnection( 
	             "jdbc:oracle:thin:@localhost:1521:ADMIN", "hr", "hr"); 
	            
	            Statement stmt = con.createStatement();  
	            
	            // SELECT query 
	            String q1 = "SELECT * from EMP_JAVA" ;
	            ResultSet rs = stmt.executeQuery(q1); 
	            if (rs.next()) 
	            { 
	                System.out.println("Emp-Id : " + rs.getString(1)); 
	                System.out.println("Emp_Name :" + rs.getString(2)); 
	                System.out.println("Emp_Sal :" + rs.getString(3)); 
	                System.out.println("Emp_dept :" + rs.getString(4)); 
	            } 
	            else
	            { 
	                System.out.println("No such emp id is already registered"); 
	            } 
	            con.close(); 
	        } 
	        catch(Exception e) 
	        { 
	            System.out.println(e); 
	        } 
	    } 
	} 
	
	
	
