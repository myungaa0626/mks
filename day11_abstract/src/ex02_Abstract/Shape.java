package ex02_Abstract;




public abstract class Shape {  // Super class

	double result = 0;
	
	public abstract double calc(double x); // abstract method
	public abstract void show(String name); 
	public void view() {
		System.out.println("Super class Shape 3333");
		
	}
	
	
	
}
