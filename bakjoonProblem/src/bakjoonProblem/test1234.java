package bakjoonProblem;

public class test1234 {

	public static void main(String[] args) {
		
		
		System.out.printf("%dkosa", 1 );
		System.out.println();
		System.out.printf("%s kosa", "num" );
		
		// 수원FC   >>> 8
		// 삼성수원  >>> 12
		// 서울     >>> 6
		
		
		String pname ="나상호"; // 9
		String pname1 ="라스"; //  6
		String pname2 ="유리 조나탄"; // 16  
		String pname3 ="에르난데스";  // 15
		String pname4 ="팔로세비치";  // 15
		String pname5 ="윤빛가람";  // 12
		String pname6 ="하파 실바";  // 13
		System.out.println();
		System.out.println(pname.getBytes().length);
		System.out.println(pname1.getBytes().length);
		System.out.println(pname2.getBytes().length);
		System.out.println(pname3.getBytes().length);
		System.out.println(pname4.getBytes().length);
		System.out.println(pname5.getBytes().length);
		System.out.println(pname6.getBytes().length);
		
		System.out.println();
		System.out.println(12-(pname.getBytes().length-2) / 3);
		System.out.println(12-(pname1.getBytes().length-2) / 3);
		System.out.println(12-(pname2.getBytes().length-2) / 3);
		System.out.println(12-(pname3.getBytes().length-2) / 3);
	}

}
