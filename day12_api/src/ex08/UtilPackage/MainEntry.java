package ex08.UtilPackage;
		
import java.sql.Date;
import java.util.Calendar;
		
public class MainEntry {
	public static void main(String[] args) {
		Calendar c =Calendar.getInstance(); // system이 갖고 있는 날짜 불러옴
		
		System.out.println(c.get(Calendar.YEAR)+"년");
		System.out.println(c.get(Calendar.MONTH)+1+"월");
		System.out.println(c.get(Calendar.DATE)+"일");
		
		Date date = new Date(0);
		int h = date.getHours();
		int m = date.getMinutes();
		int s = date.getSeconds();
		System.out.println( h+m+s);
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		c2.set(2018,12,20,0,0);
		
		if(c1.after(c2)) {
		
			System.out.println("현재 시간은 2018년 1월 1일 이후합니다");
		
		} else if (c1.before(c2));
			System.out.println("현재 시간은 2018년 1월 1일 이전입니다");
		}
		
		//System.out.println("현재 시간은 2018년 1월 1일 1입니다");

		//System.out.println();
	}		
}		
