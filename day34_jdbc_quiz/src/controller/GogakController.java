package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;
import dbconn.util.CloseHelperGogak;
import dbconn.util.ConnectionSingletonGogak;
import model.GogakVO;
public class GogakController {
	
	
	static Scanner sc = new Scanner(System.in);
	static Statement stmt = null;
	static ResultSet rs = null;
	static PreparedStatement pstmt = null;
	static Connection conn = null;
	public static void connect() {
		try {
			conn = ConnectionSingletonGogak.getConnection("oracle");
			stmt =conn.createStatement();
			conn.setAutoCommit(false); // 자동커밋 끄기, 주석처리를 하면 커밋이 된다. 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//////// close //////////////////////////////////////////
	public static void close() {
		try {
			
			CloseHelperGogak.close(rs); CloseHelperGogak.close(stmt);
			CloseHelperGogak.close(pstmt);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void gogak() throws SQLException{
		
		GogakVO vo = new GogakVO();
		while(true) {
			
			System.out.println();
			ConnectionSingletonGogak.gogak();
			System.out.println();
			System.out.println();
			System.out.println("메뉴 선택하세요.");
			
			switch(sc.nextInt()) {
				case 0 : System.out.println("Commit 하시겠습니까? (Y/N)");
						 System.out.println("안하시려면 Rollback 됩니다.");
						 if(sc.next().equalsIgnoreCase("Y")) {
							 
							 conn.commit(); // 예외발생
							 selectAll();
						 }else {
							 conn.rollback();
							 selectAll();	 
						 }
				case 1: selectAll(); break;		 
				case 2: insert(); break;
				case 3: update(); break;	 
				case 4: delete(); break;
//				case 5: selectByGno(vo.getClassName()); break;
				case 6: close(); System.out.println("프로그램 종료합니다.");
						System.exit(0); break;
				case 9: conn.commit();
						System.out.println("성공적으로 완료 되었습니다.");
			
			}
		}// end while
	}

	//셀렉트올

	public static void selectAll() throws SQLException {
	      rs = stmt.executeQuery("SELECT * FROM gogak");
	      
	      ResultSetMetaData rsmd = rs.getMetaData();
	      int count = rsmd.getColumnCount();
	      
	      while(rs.next()) {
	         for (int i =1; i<=count; i++) {
	            
	            switch(rsmd.getColumnType(i)) {
	               case Types.NUMERIC:
	               case Types.INTEGER:
	                  System.out.println(rsmd.getColumnName(i)+ ":"+rs.getInt(i)+ " ");
	                  break;
	                  
	               case Types.FLOAT:
	                  System.out.println(rsmd.getColumnName(i)+ ":"+rs.getFloat(i)+ " ");
	                  break;
	                  
	               case Types.DOUBLE:
	                  System.out.println(rsmd.getColumnName(i)+ ":"+rs.getDouble(i)+ " ");
	                  break;   
	               
	               case Types.CHAR:
	                  System.out.println(rsmd.getColumnName(i)+ ":"+rs.getString(i)+ " ");
	                  break;   
	                  
	               case Types.DATE:
	                  System.out.println(rsmd.getColumnName(i)+ ":"+rs.getDate(i)+ " ");
	                  break;   
	                  
	                  default :
	                     System.out.println(rsmd.getColumnName(i)+ ":"+rs.getString(i)+ " ");
	                     break;   
	            }
	         }
	         System.out.println();
	         
	      }
	   }
	
	private static void insert() {
//		private String gno, gname,jumin, point;
		
		System.out.print("GNO:"); String gno = sc.next();
		System.out.print("GNAME:"); String gname = sc.next();
		System.out.print("JUMIN:"); String jumin = sc.next();
		System.out.print("point:"); String point = sc.next();
		
		try {
			
			pstmt = conn.prepareStatement("INSERT INTO GOGAK VALUES(?,?,?,?)");
			pstmt.setString(1, gno);
			pstmt.setString(2, gname);
			pstmt.setString(3, jumin);
			pstmt.setString(4, point);
			
			int result = pstmt.executeUpdate(); //
			
			System.out.println(result + "개 데이터가 추가 되었습니다.");
			
		} catch (Exception e) {e.printStackTrace();}
		
	} // end insert
	
	
	private static void delete() throws SQLException {
	      selectAll();
	      System.out.println("삭제할 고객의 번호를 입력하세요.");
	      sc.nextLine();
	      String gno = sc.nextLine();
	      
	      try {
	         pstmt = conn.prepareStatement("DELETE GOGAK WHERE GNO = ?");
	         pstmt.setString(1, gno);;
	         pstmt.executeUpdate();
	         System.out.println(gno + "번 고객의 정보가 삭제 되었습니다.");
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      
	   }
	
	
	public static void update() {
	      System.out.print("수정하실 GNO : "); String gno = sc.next();
	      System.out.print("수정하실 GNAME : "); String gname = sc.next();
	      System.out.print("수정하실 JUMIN : "); String jumin = sc.next();
	      System.out.print("수정하실 POINT : "); String point = sc.next();
	      
	      String sql = "UPDATE GOGAK SET GNAME = ?,JUMIN = ?, "
	            + "POINT = ? where GNO = ?";
	      
	      try {
	         pstmt = conn.prepareStatement(sql);
	         pstmt.setString(1, gname);
	         pstmt.setString(2, jumin);
	         pstmt.setString(3, point);
	         pstmt.setString(4, gno);
	         int result = pstmt.executeUpdate();
	         System.out.println(result + "개 수정 완료!");
	      } catch (Exception e) { e.printStackTrace(); }
	      
	   }
	
	public static void selectByGno() throws SQLException {
	      pstmt = conn.prepareStatement("select * from gogak where gname = ?");
	      System.out.println("검색할 고객의 이름을 입력하세요");
	      pstmt.setString(1, sc.next());
	      rs = pstmt.executeQuery();  // 반환값 있는 경우 
	      
	      ResultSetMetaData rsmd = rs.getMetaData();
	      int count = rsmd.getColumnCount();
	      
	      while( rs.next() ) {
	         for (int i = 1; i <= count; i++) {  // 각 타입별로 출력하기
	            
	            switch (rsmd.getColumnType(i)) {
	               case Types.NUMERIC :
	               case Types.INTEGER :
	                  System.out.println(rsmd.getColumnName(i) + " : " +rs.getInt(i) + "  ");
	                  break;
	               case Types.FLOAT :
	                  System.out.println(rsmd.getColumnName(i) + " : " +rs.getFloat(i) + "  ");
	                  break;
	               case Types.DOUBLE :
	                  System.out.println(rsmd.getColumnName(i) + " : " +rs.getDouble(i) + "  ");
	                  break;
	               case Types.CHAR :
	                  System.out.println(rsmd.getColumnName(i) + " : " +rs.getString(i) + "  ");
	                  break;
	               case Types.DATE :
	                  System.out.println(rsmd.getColumnName(i) + " : " +rs.getDate(i) + "  ");
	                  break;
	               default:
	                  System.out.println(rsmd.getColumnName(i) + " : " +rs.getString(i) + "  ");
	                  break;
	            } // switch end
	         } // end for
	         System.out.println();
	      } // end while
	   }

}

