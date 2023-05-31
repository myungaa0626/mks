package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.sql.SQLException;

public class GiftCRUD {
	
	static Scanner sc = new Scanner(System.in);
	
//	static void connectEMP() throws ClassNotFoundException, SQLException{
//		// 1. Driver load..... exception
//
//				Class.forName("oracle.jdbc.OracleDriver");
//				System.out.println("driver load success!!!");
//		
//	
//			// 2. Connection & Open
//
//				Connection conn = DriverManager.getConnection
//						("jdbc:oracle:thin:@localhost:1521:orcl",
//								"newsys","kosa1234");
//				System.out.println("connection success!!!");
//			
//	}
	
	// selectByNo()
	
	// selectAll()
	
	// insert 4팀
	
	// update
	
	// delete
	
	// 종료
	
	// menu()

	
	public static void insertEMP() throws SQLException, ClassNotFoundException {
		
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		
		// 2. Connection & Open
		Connection conn = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:orcl",
					"newsys","kosa1234");
		
		
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println("입력 (insert)");
		System.out.println("EMPNO / ENAME / JOB / MGR / HIREDATE (자동) / SAL / COMM / DEPTNO");
							
		String sql = "INSERT INTO EMP VALUES(?,?,?,?,?,?,?,?)";
		
		System.out.println(date);
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
//		EMPNO       NUMBER(4)    
//		ENAME       VARCHAR2(10) 
//		JOB         VARCHAR2(9)  
//		MGR         NUMBER(4)    
//		HIREDATE    DATE         
//		SAL         NUMBER(7,2)  
//		COMM        NUMBER(7,2)  
//		DEPTNO      NUMBER(2)  
		
//		1980-12-17 00:00:00
		
//		Date nowDate = new Date(0);
		Date today = new Date();
		
//		System.out.println(today);
		System.out.println(date.format(today));
		
		
		pstmt.setInt(1, sc.nextInt());
		pstmt.setString(2, sc.next());
		pstmt.setString(3, sc.next());
		pstmt.setInt(4, sc.nextInt());
		pstmt.setString(5, date.format(today));     // hiredate
		pstmt.setInt(6, sc.nextInt());
		pstmt.setInt(7, sc.nextInt());
		pstmt.setInt(8, sc.nextInt());
		
		pstmt.executeUpdate();
		
		System.out.println(" 추가 되었습니다.");
		
		pstmt.close();
		conn.close();

	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		insertEMP();
		
	}		
}	

