package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GiftInsert2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. Driver load..... exception
		Class.forName("oracle.jdbc.OracleDriver");
		
		
		// 2. Connection & Open
		Connection conn = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:orcl",
					"newsys","kosa1234");
				
		// 3. 사용 (DML 명령어 - Insert) - Statement / PreparedStatement		
		String sql = "INSERT INTO GIFT VALUES(?,?,?,?)";
										  //  1 2 3 4
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, 20);
		ps.setString(2, "초콜렛");
		ps.setInt(3, 3000);
		ps.setInt(4, 9999);
		
//		ps.executeUpdate();
		
		int result = ps.executeUpdate(); // 반환값이 없는 경우 - insert, update, delete


		System.out.println(result+"개 데이터 추가 성공함.");
				
		// 4. 자원반환 (닫기)
				ps.close(); conn.close();

	}

}
