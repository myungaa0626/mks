package quiz06.person;

public class Person {
	
	protected int empNum, empPnumber;  // 사번, 사원 연락처
	protected String empName, empDept; // 사원 이름, 사원 부서
	
	protected String studentName;
	protected int kor, eng, com, total;
	protected double avg;
	protected char grade;
	
	
	// 생성자 함수
	
	public Person(int empNum, int empPnumber, String empName, String empDept, String studentName, int kor, int eng,
			int com, int total, double avg, char grade) {
		super();
		this.empNum = empNum;
		this.empPnumber = empPnumber;
		this.empName = empName;
		this.empDept = empDept;
		this.studentName = studentName;
		this.kor = kor;
		this.eng = eng;
		this.com = com;
		this.total = total;
		this.avg = avg;
		this.grade = grade;
	}
	
	
	
	// getter / setter
	public int getEmpNum() {
		return empNum;
	}
	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}
	public int getEmpPnumber() {
		return empPnumber;
	}
	public void setEmpPnumber(int empPnumber) {
		this.empPnumber = empPnumber;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}



	@Override
	public String toString() {
		
		return super.toString();
	}
	

	
	
	
	
	
}
