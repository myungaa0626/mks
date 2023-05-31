package quiz3;

public class MainEntry {

	public static void main(String[] args) {
		
		
		// empNum name+  부서:  "+pNum
//		Employee emp = new Employee(1, "윤윤윤", "마켓팅", 01012345);
//		
//		emp.disp();
//		
//		Regular r = new Regular(2, "이이이", "경영지원", 0102325, 100000000);
//		
//		r.disp();
		
		Sales s = new Sales(3, "박박박", "영업부", 01023234, 20000000, 300000);
		
		s.disp();
		
		
		PartTime pt = new PartTime(4, "김김김", "경영지원", 34534, 15, 10000);
		
		pt.disp();

		PartTimeWageCalc ptwc = new PartTimeWageCalc(5, "최최최","개발",42534,20, 15000);
		
		ptwc.disp();

	}

}
