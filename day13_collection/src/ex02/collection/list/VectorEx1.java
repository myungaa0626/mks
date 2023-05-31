package ex02.collection.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

// List : 순서 있고, 중복허용한다
public class VectorEx1 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		System.out.println("length          /        capacity"  );
		System.out.println(v.size()+"               /          "+v.capacity());
		
		Vector<Integer> v2 = new Vector<>(3, 4); // 초기용량, 증가용량
		v2.add(2);
		v2.add(21);
		v2.add(22);
		v2.add(100);    // 7
		v2.add(5);
		v2.add(89);
		v2.add(3);
		v2.add(333);
		v2.add(3);
		v2.add(3);
		v2.add(21);    //  11
		v2.add(100);
		
		int len = v2.size();
		System.out.println(len+"               /          "+v2.capacity());
		
//		System.out.println(v2);
		System.out.println("-------------iterator( ) method --------------------");
		Iterator it = v2.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+"  ");
			
		}
		System.out.println();
		System.out.println();
		System.out.println("--------------get ( ) method------------------------");
		for(int i =0; i <v2.size(); i++) {
			
			System.out.print(v2.get(i)+"  ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("------------sort ( ) method -----------------------");
		Collections.sort(v2); // 요소 순서대로 정렬
		
		for(int i =0; i <v2.size(); i++) {
			
			System.out.print(v2.get(i)+"  ");
		}
		System.out.println();
		System.out.println();
		
		
		System.out.println("------------elementsAt ( ) method ---------------");
	
		for(int i =0; i <v2.size(); i++) {// vector에 있는 모든 요수에 대해 반복
			
			Integer num = v2.elementAt(i); // 요소 객체 알아내기
			System.out.print(num.toString()+"  "); //System.out.println(num);
		
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("------------trimToSize ( ) method ---------------");
		v2.trimToSize(); // capacity 조정하기
		System.out.println(v2.size()+"                    /                   "+v2.capacity());

	}

}
