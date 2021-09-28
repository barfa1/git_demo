package database;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DbTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/ecomm";
		String name = "root";
		String password = "root";
		DbConnection dbobj = new DbConnection(url, name, password);
		Statement statement = dbobj.getConnection().createStatement();
//		statement.executeUpdate("insert into eproduct (name,price,date_added) values('Smartwatch',9300,now());");
//		statement.executeUpdate("create database shubh");
//		statement.executeUpdate("drop database shubh");
		statement.executeUpdate("update eproduct set name='Bluetooth Handfree' where id = 3");
		CallableStatement stmt = dbobj.getConnection().prepareCall("{call add_product(?,?)}");
		stmt.setString(1, "Airbuds");
		stmt.setInt(2,5000);
		stmt.executeUpdate();
		ResultSet rst = statement.executeQuery("select * from eproduct");
		while(rst.next()) {
			System.out.println("Id :" + rst.getString("id"));
			System.out.println("Name :" + rst.getString("name"));
			System.out.println("Price :" + rst.getString("price"));
		}
		
		dbobj.closeConnection();
		

	}

}
