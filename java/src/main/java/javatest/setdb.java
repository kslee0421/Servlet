package javatest;

import java.sql.*;

//java17에 활용
public interface setdb {
	//해당 필드에 사용되는 변수는 final형태로 상수화 되어버리는 상황
	public void dbconnect(String user, String passwd, String db) throws Exception;
	public void select(String table, String dataid);
/*	public void delete(int idx);
	public void update(String dataid, int idx);
	public void insert(String[] a) ;
	*/
	 public static Connection info(String user, String passwd, String db) throws Exception{
		 String db_driver = "com.mysql.jdbc.Driver";
		 String db_url = "jdbc:mysql://localhost:3307/"+db; //web:데이터 베이스명
		 String db_user = user;
		 String db_pass = passwd;
		 System.out.println(user);
		 Class.forName(db_driver);
		 Connection con = DriverManager.getConnection(db_url,db_user,db_pass);
		 return con;
	 }
}

