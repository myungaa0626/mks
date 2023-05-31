package quiz3;

public class Employee {
	
	// 멤버변수
	protected int empNum, pNum;       // 사번, 연락처
	protected String name, dept;      // 이름, 부서
	
	// 사번, 이름, 부서, 연락처  
	// 생성자 함수
	public Employee(int empNum, String name, String dept, int pNum) {
		super();
		this.empNum = empNum;
		this.name = name;
		this.dept = dept;
		this.pNum = pNum;
	}
	// getter / setter
	public int getEmpNum() {
		return empNum;
	}
	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public int getpNum() {
		return pNum;
	}
	public void setpNum(int pNum) {
		this.pNum = pNum;
	}
	
	//output
	public void disp() {
		
//		empNum, pNum, income, com;       // 사번, 연락처, 급여, 커미션
//		name, dept;           		   // 이름, 부서
		
						 // 사번, 이름, 부서, 급여, 커미션, 연락처
		System.out.println("사번: "+empNum + " 이름: "+ name+ " 부서: "+dept + " 연락처: "+pNum);
		System.out.println();
		System.out.println("==============================================================================");
		
	}
}
