package quiz3;

import java.util.Scanner;

public class PartTimeWageCalc extends PartTime {
	
	//파트타임 시간당 근무 임금 계산기
		private int partTimeWage; // = 근무시간 * 시간당 단가
	
	
	// 생성자 함수
	public PartTimeWageCalc(int empNum, String name, String dept, int pNum, int workDay, int wageHour) {
		super(empNum, name, dept, pNum, workDay, wageHour);
		// TODO Auto-generated constructor stub
	}

	// getter / setter
	
	public int getPartTimeWage() {
		return partTimeWage;
	}

	public void setPartTimeWage(int partTimeWage) {
		this.partTimeWage = partTimeWage;
	}
	
	public void Calc(int workDay, int wageHour) {
		
		Scanner sc = new Scanner(System.in);
		workDay= sc.nextInt();
		wageHour = sc.nextInt();
		
		partTimeWage = workDay * wageHour;
		
	}
	// output
	public void disp() {
		
						 // 사번, 이름, 부서, 급여, 커미션, 연락처
		System.out.println("파트타임| "+"사번: "+empNum + " 이름: "+ name+ " 부서: "+dept + " 연락처: "+pNum+" 근무일수: "+workDay+" 시간당 단가: "+wageHour+"   파트타임 급여: "+ (workDay*wageHour));
		System.out.println();
		System.out.println("==============================================================================");
		
	}
	
	
}
