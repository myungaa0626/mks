package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class GiftDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		// 1. Driver load..... exception
				Class.forName("oracle.jdbc.OracleDriver");

		// 2. Connection & Open
		Connection conn = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:orcl",
						"newsys","kosa1234");
		
		// 3. delete
		String sql = "DELETE GIFT WHERE GNAME = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, sc.next());
		int result = ps.executeUpdate();
		System.out.println(result+"개 데이터 삭제됨.");
		
		// 4. 자원반환 (닫기)
		ps.close(); conn.close(); sc.close();

	}
}


