package ex05.constructor;

public class TV {
	
	private String color;
	private int channer;
	
	public TV() {
		channer = 17;
		color = "black";
		
	}
	
	
	public TV(String color, int channer) {// 매개변수 1개 생성자 함수
		this.color = color;
		this.channer = channer;
		
		
	}
	
	public TV(String color) {// 매개변수 1개 생성자 함수
		this.color = color;
		
		
	}
	
	
	public TV(int channer) {// 매개변수 1개 생성자 함수
		this.channer = channer;
		color = "red";
		
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getChanner() {
		return channer;
	}
	public void setChanner(int channer) {
		this.channer = channer;
	}

	public void disp() {
		
		System.out.println("티비 색상: "+ color + "  티비 채널 번호: "+channer);
	}	
}
