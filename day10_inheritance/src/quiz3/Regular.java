package quiz3;

public class Regular extends Employee {

	protected int income;     // 급여

	
	
	// 생성자 함수
	
	
	public Regular(int empNum, String name, String dept, int pNum, int income) {
		super(empNum, name, dept, pNum);
		this.income = income;
	}
	
	
	// getter / setter
	public int getIncome() {
		return income;
	}


	public void setIncome(int income) {
		this.income = income;
	}
	
	//output
	
	public void disp() {
		
		//		empNum, pNum, income, com;       // 사번, 연락처, 급여, 커미션
		//		name, dept;           		   // 이름, 부서
		
						 // 사번, 이름, 부서, 급여, 커미션, 연락처
		System.out.println("사번: "+empNum + " 이름: "+ name+ " 부서: "+dept + " 연락처: "+pNum+" 급여: "+ income);
		System.out.println();
		System.out.println("==============================================================================");
		
	}
	
}
