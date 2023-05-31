package Quiz;

public class Sawon {

	private int sawonNum; // 사번
	private String name; // 이름
	private String pos; // 직급
	private String dept; // 부서
	private int Income; // 급여
	private int phone; // 연락처
	
	
	public Sawon() {
		sawonNum=1;
		name="객체지향";
		pos= "대리";
		dept ="개발팀";
		Income=100;
		phone=010123456;
		
	}
	
	
	

	public Sawon(int sawonNum, String name) {
		this.sawonNum = sawonNum;
		this.name = name;
	}




	public Sawon(int sawonNum, String name, String pos) {
		this.sawonNum = sawonNum;
		this.name = name;
		this.pos = pos;
	}




	public Sawon(int sawonNum, String name, String pos, String dept) {
		this.sawonNum = sawonNum;
		this.name = name;
		this.pos = pos;
		this.dept = dept;
	}




	public Sawon(int sawonNum, String name, String pos, String dept, int income) {
		this.sawonNum = sawonNum;
		this.name = name;
		this.pos = pos;
		this.dept = dept;
		Income = income;
	}




	public Sawon(int sawonNum, String name, String pos, String dept, int income, int phone) {
		this.sawonNum = sawonNum;
		this.name = name;
		this.pos = pos;
		this.dept = dept;
		Income = income;
		this.phone = phone;
	}





	public int getSawonNum() {
		return sawonNum;
	}
	public void setSawonNum(int sawonNum) {
		this.sawonNum = sawonNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getIncome() {
		return Income;
	}
	public void setIncome(int income) {
		Income = income;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	
	
	public void disp() {
		
		//sawonNum, name, pos, dept, income, phone
		System.out.println("==============================================================");
		System.out.println("사번: "+sawonNum+" 이름: "+name+" 직급: "+pos+" 부서: "+dept+" 급여: "+Income+" 연락처: "+phone);
		System.out.println();
		
		
	}
	
	
	
	
	
}
