package ex01.collection.set;

import java.util.HashSet;
import java.util.Set;


public class HashSetEx {
	public static void main(String[] args) { //자료형이 다르면 중복 가능
		Object[] objArr = {"1", new Integer(1),"2","3","3","4","4","4"};
		
		Set set = new HashSet();

		for( int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]);			
		}
		
		System.out.println(set);
	}

}
