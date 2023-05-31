package controller;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

import dbConn.util.CloseHelper;
import dbConn.util.ConnectionHelper;
import model.GiftVO;

public class GiftController { // controller
	
	// 연결, 삽입, 삭제, 수정, 검색,.....
	static Scanner sc = new Scanner(System.in);
	static Statement stmt = null;
	static ResultSet rs = null;
	static PreparedStatement pstmt = null;
	static Connection conn = null;
	
	// connect
	public static void connect() {
		
		try {
			conn = ConnectionHelper.getConnection("oracle");
			stmt =conn.createStatement();
			conn.setAutoCommit(false); // 자동커밋 끄기, 주석처리를 하면 커밋이 된다. 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// close
	public static void close() {
		try {
			
			CloseHelper.close(rs); CloseHelper.close(stmt);
			CloseHelper.close(pstmt);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// menu
	public static void menu() throws SQLException{ // 예외처리 위임
		
		GiftVO vo = new GiftVO();
//		System.out.println("메뉴 선택하세요.0,1,2 ");
		
		while(true) {
			
			System.out.println();
			ConnectionHelper.menu();
			System.out.println();
			System.out.println();
			System.out.println("메뉴 선택하세요.");
			
			switch(sc.nextInt()) {
				case 0 : System.out.println("Commit 하시겠습니까? (Y/N)");
						 System.out.println("안하시려면 Rollback 됩니다.");
						 if(sc.next().equalsIgnoreCase("Y")) {
							 
							 conn.commit(); // 예외발생
							 selectAll(vo.getClassName());
						 }else {
							 conn.rollback();
							 selectAll(vo.getClassName());	 
						 }
						 
				case 1: selectAll(vo.getClassName()); break;		 
				case 2: insert(); break;
				case 3: update(); break;	 
				case 4: delete(vo.getClassName()); break;
//				case 5: selectByGno(vo.getClassName()); break;
				case 6: close(); System.out.println("프로그램 종료합니다.");
						System.exit(0); break;
				case 9: conn.commit();
						System.out.println("성공적으로 완료 되었습니다.");
			
			}
		}// end while
	}// end menu()	
		
	
	// selectAll
	private static void selectAll(String className) throws SQLException{
		
		rs = stmt.executeQuery("select * from " + className); // 반환값 있는 경우
		
		ResultSetMetaData rsmd = rs.getMetaData(); // 해당 테이블에 대한 정보
		int count = rsmd.getColumnCount(); 
		
		while(rs.next()) {
			for(int i = 1; i < count; i++) { // 각 타입별로 출력하기
				
				switch(rsmd.getColumnType(i)) {
					case Types.NUMERIC:
					case Types.INTEGER:
						System.out.println(rsmd.getColumnName(i)+ ":"+rs.getInt(i)+" ");
						break;
						
					case Types.FLOAT:
						System.out.println(rsmd.getColumnName(i)+ ":"+rs.getFloat(i)+" ");
						break;	
					
					case Types.DOUBLE:
						System.out.println(rsmd.getColumnName(i)+ ":"+rs.getDouble(i)+" ");
						break;	
						
					case Types.CHAR:
						System.out.println(rsmd.getColumnName(i)+ ":"+rs.getString(i)+" ");
						break;
						
					case Types.DATE:
						System.out.println(rsmd.getColumnName(i)+ ":"+rs.getDate(i)+" ");
						break;
						
					default:
						System.out.println(rsmd.getColumnName(i)+ ":"+rs.getString(i)+" ");
						break;
					
				} // switch end
			} // for end
			System.out.println();
		} // end while
	}// end select all

	// insert
	public static void insert() {
		
		System.out.print("GNO:"); String gno = sc.next();
		System.out.print("GNAME:"); String gname = sc.next();
		System.out.print("G_START:"); String g_start = sc.next();
		System.out.print("G_END:"); String g_end = sc.next();

		try {
			
			pstmt = conn.prepareStatement("INSERT INTO GIFT VALUES(?,?,?,?)");
			pstmt.setString(1, gno);
			pstmt.setString(2, gname);
			pstmt.setString(3, g_start);
			pstmt.setString(4, g_end);
			
			int result = pstmt.executeUpdate(); //
			
			System.out.println(result + "개 데이터가 추가 되었습니다.");
			
			
		} catch (Exception e) {e.printStackTrace();}
	}// end insert	
	
	public static void update() {
	      System.out.println("상품번호를 입력하시오."); String gno = sc.next();
	      System.out.println("상품이름을 입력하시오."); String gname = sc.next();
	      System.out.println("상품최저가를 입력하시오."); String g_start = sc.next();
	      System.out.println("상품최고가를 입력하시오."); String g_end = sc.next();
	      
	      try {
	         pstmt = conn.prepareStatement("update gift set gname=?, g_start = ?, g_end=? where gno=?");
	         pstmt.setString(4, gno);  pstmt.setString(4, gno);
	         pstmt.setString(1, gname);pstmt.setString(1, gname);
	         pstmt.setString(2, g_start); pstmt.setString(2, g_start);
	         pstmt.setString(3, g_end); pstmt.setString(3, g_end);
	         
	         int result = pstmt.executeUpdate();
	         System.out.println(result + "데이터가 변경 되었습니다.");
	      }catch(Exception e) {
	         e.printStackTrace();
	      }
	      
	   }
	
	
	
//	System.out.println("Gift Table data input : 상품명 / 최저가 / 최고가 / 상품번호");
//	
//	String sql = "UPDATE GIFT SET GNAME=?, G_START=?, G_END=? WHERE GNO =?";
//	PreparedStatement ps = conn.prepareStatement(sql);
//
//		ps.setString(1, sc.next());
//		ps.setInt(2, sc.nextInt());
//		ps.setInt(3, sc.nextInt());
//		ps.setInt(4, sc.nextInt());
//		
//		int result = ps.executeUpdate();
//
//	System.out.println(result+ "업데이트 성공함");
	
	
	private static void delete(String className) throws SQLException {
		
		selectAll(className);
		System.out.println("삭제할 품목은? ");
		String sql = "DELETE GIFT WHERE GNAME = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, sc.next());
		int result = ps.executeUpdate();
		System.out.println(result+"개 데이터 삭제됨.");
	}
	
//	// 3. delete
//			String sql = "DELETE GIFT WHERE GNAME = ?";
//			PreparedStatement ps = conn.prepareStatement(sql);
//			ps.setString(1, sc.next());
//			int result = ps.executeUpdate();
//			System.out.println(result+"개 데이터 삭제됨.");
	

}	

