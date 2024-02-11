package Project;
import java.sql.*;
public class ConnectionProvider{
	
	public static Connection getCon() 
	{
		String url = "jdbc:mysql://localhost:3306/bloodbank";
		String user = "root";
		String pass = "Nisu@123";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank","root","Nisu@123");
			Connection con=DriverManager.getConnection(url,user,pass);
			return con;
		}
		catch(Exception e)
		{
			System.out.print(e);
			return null;
		}
	}
		
	

}
