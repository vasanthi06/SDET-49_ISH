package myJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;

public class Fetch_Data {

	public static void main(String[] args) throws SQLException {
		
		Connection con = null;
		try {
		
		Driver	driverRef=new Driver();
	     
		 DriverManager.registerDriver( driverRef);
		 
		 con=DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects","root@%","root");
		 Statement statement = con.createStatement();
		 
		 String Query = "Select * from project";
		 ResultSet result = statement.executeQuery(Query);
		 
		 while(result.next())
		 {
		    String value =result.getString(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4)+" "+result.getString(5)+" "+result.getInt(6);
		    System.out.println(value);
		 }
		 
		}finally
		{
			con.close();
		}
		 

	}

	}

