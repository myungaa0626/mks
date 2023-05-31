package Quiz.BMI;

public class bmi {
	
	protected String name;
	protected double height;
	protected double weight;
	protected int gender;
	protected double bmiNumber;
	protected String bmiStatus;

	// 생성자함수
	public bmi(String name, double height, double weight, int gender, double bmiNumber, String bmiStatus) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.bmiNumber = bmiNumber;
		this.bmiStatus = bmiStatus;
	}

	// getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}
	
	public double getBmiNumber() {
		return bmiNumber;
	}

	public void setBmiNumber(double bmiNumber) {
		this.bmiNumber = bmiNumber;
	}
	
	public String getBmiStatus() {
		return bmiStatus;
	}

	public void setBmiStatus(String bmiStatus) {
		this.bmiStatus = bmiStatus;
	}

	@Override
	public String toString() {
		
		return "[이름: "+name+", 성별= " + gender + ", 키= "+height+ 
				", 몸무게= "+ weight+", BMI= "+bmiNumber+", 상태: "+bmiStatus+" ]";
	}

}
