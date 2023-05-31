package ex03.multiImplements;

import ex02.Interface.IDraw;
import ex02_Abstract.Shape;

public class MultiClass extends Shape 
						implements Test, IDraw {

	private int num ; 
	public void display() {
		System.out.println("MultiClass method!!");
	}
	@Override
	public void draw() { // IDraw
		num = 88;
		System.out.println("IDraw interface"+ num);
	}
	@Override
	public double calc(double x) {
		System.out.println("Shape abstract class");
		return 0;
	}
	@Override
	public void show(String name) {
		System.out.println("Shape abstract class");
	}
	@Override
	public void testView() {
		System.out.println("Test interface");
	}
}
