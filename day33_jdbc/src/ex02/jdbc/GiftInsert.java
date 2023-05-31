package ex02.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GiftInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. Driver load..... exception
		Class.forName("oracle.jdbc.OracleDriver");
		
				
				
		// 2. Connection & Open
		Connection conn = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:orcl",
					"newsys","kosa1234");
				
		// 3. 사용 (DML 명령어 - Insert) - Statement / PreparedStatement		
		Statement stmt = conn.createStatement();
		// insert into gift values(11, '종합과자', 1000, 20000);
		// 1) 고정값 레코드 입력
		//    String sql = "INSERT INTO GIFT VALUES(11,'종합과자',1000,20000)"; // 자바는 auto commit 이다.
		// 2) 레코드 값을 입력 받아서 처리 - Scanner, IO, main args
		String sql = "INSERT INTO GIFT VALUES("+args[0]+",'"
											   +args[1]+"',"
										       +args[2]+","
										       +args[3]+")";
//		 System.out.println(sql);
		
		int result = stmt.executeUpdate(sql);
		System.out.println(result+"개 데이터 추가 성공함.");
				
		// 4. 자원반환 (닫기)
				stmt.close(); conn.close();
				
				
				
				

	}

}
