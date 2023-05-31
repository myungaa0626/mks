package view;

import java.sql.SQLException;

import controller.GiftController;

public class MainEntry {
		
	public static void main(String[] args) throws SQLException {	
		GiftController.connect();
		GiftController.menu();
//		ConnectionHelper.getConnection("oracle","newsys","kosa1234");
	}	
		
}		
