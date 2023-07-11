package myJdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;



public class Insesrt_data {

	public static void main(String[] args) throws SQLException {
		  
		
		 Connection con = null;
		
		try
		{
		 //STEP 1: REGISTER /LOAD THE MYSQL DATABASE
	     Driver	driverRef=new Driver();
	     
	     
	     //STEP 2:REGISTER TO DATA BASE 
		 DriverManager.registerDriver( driverRef);
		 
		 //STEP 3:CONNECT TO DB
		 con=DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects","root@%","root");
		 Statement statement = con.createStatement();
		 
		 //STEP 4:INSERT THE DATA INTO THE DATA BASE
		 String q = "insert into project values('TY_PROJ_1426','Nihar','30/06/2023','RARE','Completed','6')";
		 
		 int result = statement.executeUpdate(q);
		 
		 //int result = statement.executeUpdate(q);
		 
		 //STEP 5:CONFORMATION FOR DATA ADDED R NOT
		 if(result==1)
		 {
			 System.out.println("data created");
		 }
		 else {
			 System.out.println("data not created");
		 }
		}
		finally {
			
			con.close();
		}
		
        
	}

}
