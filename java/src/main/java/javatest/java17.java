package javatest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.ExecutionException;


//interface 활용
public class java17 {

	public static void main(String[] args) {
		try {
			//new 인스턴스활용이 필요함 
			/*각각의 별도로 적용되는 인스턴스
			 * new box7().dbconnect("hong","a123456","web");
			 * new box7().select("shop", "kslee");
			 * */
			box7 bx =new box7();
			bx.dbconnect("hong","a123456","web");
			bx.select("shop", "kslee");
			//new box7().dbconnect("park","p1234","shop");
		}
		catch(Exception e) {
			System.out.println("DB 정보가 올바르지 않습니다.");
		}
	}
}
//class 일때 new 인스턴스 활용, 단,interface일 떄는 interface 명으로 활용
class box7 implements setdb{
	Connection con = null;
	PreparedStatement ps = null;
	@Override
		public void select(String table, String dataid) {
		try {
			//System.out.println(con);
			
			String sql = "select * from " +table+ " where sid=?";
			this.ps = this.con.prepareStatement(sql);
			this.ps.setString(1,dataid);
			
			ResultSet rs = this.ps.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString("sname"));
				System.out.println(rs.getString("scom"));
				System.out.println(rs.getString("stel"));
				System.out.println(rs.getString("semail"));
			}
			this.ps.close();
			this.con.close();
			}
		catch (Exception e){
			System.out.println("SQL 문법 및 컬럼 확인");
		}
			
}
@Override
	public void dbconnect(String user, String passwd, String db) throws Exception {
		this.con = setdb.info(user,passwd,db);

	}
}


