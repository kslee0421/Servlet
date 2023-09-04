package joinjava;

import java.sql.*;

public class dbconfig {
	public static Connection dbinfo() throws Exception{
		String db_driver = "com.mysql.jdbc.Driver";
		String db_url = "jdbc:mysql://localhost:3307/pensonlife";
		String db_user = "penson";
		String db_pass = "pensonlife";
		Class.forName(db_driver);
		Connection con = DriverManager.getConnection(db_url, db_user, db_pass);
		return con;
	}
}