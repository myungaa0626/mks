package ex03.multiImplements;

import ex02.Interface.IDraw;
import ex02_Abstract.Shape;

public class MainEntry {

	public static void main(String[] args) {
		//1. 자기자신~
//		MultiClass mc = new MultiClass();
//		mc.view();
//		mc.testView();
//		mc.draw();
//		mc.display();
//		System.out.println(mc.su);
//		System.out.println("----------------------");
		
		//2. 부모로 객체 생성
		Shape s = new MultiClass();
		s.show("도형이야");
		s.view();
		System.out.println("----------------------");
		Test t = new MultiClass();
		t.testView();
		System.out.println(t.str);
		System.out.println("----------------------");
		IDraw d = new MultiClass();
		d.draw();
		System.out.println(d.su);

	}

}
