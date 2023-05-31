package ex01.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import dbConn.util.CloseHelper;
import dbConn.util.ConnectionHelper;

public class MainEntry {

	public static void main(String[] args) {
		Connection conn = ConnectionHelper.getConnection("oracle");
		Statement stmt = null;
		ResultSet rs = null;
		
		
		try {
			
			stmt = conn.createStatement();
			// SQL 구문, HTML Tag는 java/jsp/sevlet에서 문자열 취급한다.
//			String sql = "create table KOSADB(NAME VARCHAR2(20), AGE NUMBER)";
//			System.out.println(sql.toString());
			StringBuffer sb = new StringBuffer();
			sb.append("if exists table drop ");
			sb.append("CREATE TABLE KOSADB(NAME VARCHAR2(20), AGE NUMBER)");
			
			System.out.println(sb.toString());
			stmt.executeUpdate(sb.toString());// 반환값이 없는 경우
			
			String sql = "INSERT INTO KOSADB VALUES('YUNA',33)"; // 여러개 레코드 추가 가능
			int result = stmt.executeUpdate(sb.toString());
			
			sql = "SELECT * FROM KOSADB";
			rs = stmt.executeQuery(sb.toString()); //반환값이 있는 경우
			
			System.out.println(result + " 개 추가됨.");
					
			
			while(rs.next()) {
				System.out.println("name: "+rs.getString(1)+"\t");
				System.out.println("age: "+rs.getInt("age"));

			}
			
// conn.commit();
			
			sql ="drop table kosadb";
			result = stmt.executeUpdate(sql);
			System.out.println("drop table:" +sql);
			
			
		}catch (Exception e) {

		}finally {
			CloseHelper.close(rs); CloseHelper.close(stmt); CloseHelper.close(conn);	
		}
	}
}
