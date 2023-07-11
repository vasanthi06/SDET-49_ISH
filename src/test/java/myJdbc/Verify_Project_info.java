package myJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;



public class Verify_Project_info {

	public static void main(String[] args) throws SQLException {
		
		 
		 Connection con = null;
		 String Project_Name = "RARE";
			try {
				
			
		     Driver	driverRef=new Driver();
		     
			 DriverManager.registerDriver(driverRef);
			 
			 con=DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects","root@%","root");
			 Statement statement = con.createStatement();
			 
			 String Query = "select * from project";
			 ResultSet result=statement.executeQuery(Query);
			 boolean flag=false;
			 while(result.next())
			 {
				 
			 String value =result.getString(4);
			 if(value.equalsIgnoreCase(Project_Name))
			 {
				 System.out.println("projected is created");
				 flag = true;
				 break;
			 }
			 }
			 if(!flag) 
			 {
				 System.out.println("project  not created");
			 }
			}
			finally {
				con.close();
			}
	        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
