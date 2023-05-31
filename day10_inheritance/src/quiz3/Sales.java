package quiz3;

public class Sales extends Regular {
	
	
	// 커미션
	private int com;
	
	public Sales(int empNum, String name, String dept, int pNum, int income, int com) {
		super(empNum, name, dept, pNum, income);
		this.com = com;
	}

	// getter / setter
	
	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	//output
	public void disp() {
		
	
		System.out.println("사번: "+empNum + " 이름: "+ name+ " 부서: "+dept + " 연락처: "+pNum+" 급여: "+ income + " 커미션: "+ com);
		System.out.println();
		System.out.println("==============================================================================");
		
	}	
}
