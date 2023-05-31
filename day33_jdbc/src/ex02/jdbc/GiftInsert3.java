package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class GiftInsert3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Scanner sc = new Scanner(System.in);
		// 1. Driver load..... exception
		Class.forName("oracle.jdbc.OracleDriver");
		
		
		// 2. Connection & Open
		Connection conn = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:orcl",
					"newsys","kosa1234");
				
		// 3. 사용 (DML 명령어 - Insert) - Statement / PreparedStatement		
		System.out.println("Gift Table data input : 상품번호 / 상품명 / 최저가 / 최고가 = ");
		String sql = "INSERT INTO GIFT VALUES(?,?,?,?)";
										  //  1 2 3 4
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, sc.nextInt());
		ps.setString(2, sc.next());
		ps.setInt(3, sc.nextInt());
		ps.setInt(4, sc.nextInt());

		int result = ps.executeUpdate(); // 반환값이 없는 경우 - insert, update, delete

		System.out.println(result+"개 데이터 추가 성공함.");
				
		// 4. 자원반환 (닫기)
				ps.close(); conn.close();
	}
}











