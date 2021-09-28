package DataBase;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String URL ="jdbc:mysql://localhost:3306/ecommerce";
		String UserName ="root";
		String Password ="root";
		
		DBConnection Obj= new DBConnection(URL, UserName, Password);
		

		Statement statement = Obj.getConnection().createStatement();
		
		CallableStatement statement1 = Obj.getConnection().prepareCall("{call add_product(?, ?)}");// STORED PROCEDURE INT THE DATABASE
		
//		statement.executeUpdate("insert into eproduct (name, price, date_added) values ('ipod', 70000.00,\n" + 
//				" now());");
		
//		statement.executeUpdate("create database mydatabase"); //to create database
		
//		statement.executeUpdate("drop database mydatabase");// to remove database
		
//		statement.executeUpdate("update eproduct set ID=5 where name='ipod'");
		
		statement1.setString(1, "Washing Machine");
        statement1.setInt(2, 4000);
        
        statement1.executeUpdate();
		
		
		
		ResultSet result = statement.executeQuery("select * from eproduct");
		
		while(result.next())
		{
			System.out.println("id: "+ result.getInt("ID"));
			System.out.println("Name: "+ result.getString("name"));
		}

	}

}
