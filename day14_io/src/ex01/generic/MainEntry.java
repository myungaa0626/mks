package ex01.generic;

import java.util.Date;

public class MainEntry {

	public static void main(String[] args) {
		
		GenericEx<String> t1 = new GenericEx<>();
		String[] str = {"abc","kbs", "dirotor"};
		t1.set(str); t1.print();
		System.out.println("===================");
		
		
		GenericEx<Integer> t2 = new GenericEx<>();
		Integer[] num = {1,2,3,4,5,6,7,8};
		t2.set(num); t2.print();
		System.out.println("===================");
		
		
		GenericEx<Double> t3 = new GenericEx<>();
		Double[] num1 = {1.23,2.34,3.45,4.56,5.67,6.78,7.89,8.98};
		t3.set(num1); t3.print();
		System.out.println("===================");
		
		
		GenericEx<Object> t4 = new GenericEx<>();
		Object[] obj = {"12.34",new Date(),47.2, 5.5, "text"};
		t4.set(obj); t4.print();
		System.out.println("===================");

	}

}


