package web;

import java.sql.*;
public class dbconfig {
	public static Connection dbinfo() throws Exception{
		String db_driver = "com.mysql.jdbc.Driver";
		String db_url = "jdbc:mysql://localhost:3307/web";
		String db_user = "hong";
		String db_pass = "a123456";
		Class.forName(db_driver);
		Connection con = DriverManager.getConnection(db_url, db_user, db_pass);
		return con;
	}
}
