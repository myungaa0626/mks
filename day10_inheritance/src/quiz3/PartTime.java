package quiz3;

public class PartTime extends Employee {

	protected int workDay;  // 근무일수
	protected int wageHour; // 시간당 단가
	

	// 생성자 함수
	
	public PartTime(int empNum, String name, String dept, int pNum, int workDay, int wageHour) {
		super(empNum, name, dept, pNum);
		this.workDay = workDay;
		this.wageHour = wageHour;
	}
	
	
	// getter / setter
	public int getWorkDay() {
		return workDay;
	}
	public void setWorkDay(int workDay) {
		this.workDay = workDay;
	}
	public int getWageHour() {
		return wageHour;
	}
	public void setWageHour(int wageHour) {
		this.wageHour = wageHour;
	}
	
	
	// output
	
	public void disp() {
		
		//		empNum, pNum, income, com;       // 사번, 연락처, 급여, 커미션
		//		name, dept;           		   // 이름, 부서
		
						 // 사번, 이름, 부서, 급여, 커미션, 연락처
		System.out.println("파트타임| "+"사번: "+empNum + " 이름: "+ name+ " 부서: "+dept + " 연락처: "+pNum+" 근무일수: "+workDay+" 시간당 단가: "+wageHour);
		System.out.println();
		System.out.println("==============================================================================");
		
	}
	
	//int empNum, String name, String dept, int pNum, int workDay, int wageHour
	// int workDay, int wageHour
	
	
}
