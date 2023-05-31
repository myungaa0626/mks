package ex03.inheritance;

public class Circle extends Point { // sub class
	
	private int r;
	
		public Circle(int x, int y) {
		super(x,y);
		this.r = 55;
		}
		public Circle() {
			this.r =5;
			System.out.println("Circle default constructor");
		}
	
		//output method
		public void disp() {	
			super.disp();
			System.out.println(", "+r);
			
		}
}
