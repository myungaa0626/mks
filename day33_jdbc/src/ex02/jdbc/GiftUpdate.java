package ex02.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class GiftUpdate {
	public static void main(String[] args) 
			throws ClassNotFoundException, 
								SQLException {
		Scanner sc = new Scanner(System.in);
		// 1. Driver load..... exception
		Class.forName("oracle.jdbc.OracleDriver");

		// 2. Connection & Open
		Connection conn = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:orcl",
				"newsys","kosa1234");
		
		// 3. Update
		System.out.println("Gift Table data input : 상품명 / 최저가 / 최고가 / 상품번호");
		
		String sql = "UPDATE GIFT SET GNAME=?, G_START=?, G_END=? WHERE GNO =?";
		PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, sc.next());
			ps.setInt(2, sc.nextInt());
			ps.setInt(3, sc.nextInt());
			ps.setInt(4, sc.nextInt());
			
			int result = ps.executeUpdate();

		System.out.println(result+ "업데이트 성공함");
		
		
		ps.close(); conn.close();
	}
}
