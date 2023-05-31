package ex01.collection.set;

import java.util.HashSet;
import java.util.Iterator;

// Set : 순서없고, 중복 허용 X
public class MainEntry {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("키보드");		
		hs.add("마우스");	
		hs.add("컵");	
		hs.add("볼펜");	
		hs.add("키보드"); // 위에 키보드가 이미 있기 때문에 
		
		System.out.println("요소 개수 : "+ hs.size()); // 중복 허용안됨
		System.out.println(hs); // 출력된 값을 보면 위에 적혀진 순서와 다르다 (순서없음)
		
		HashSet<Integer> hs2 = new HashSet<>(); // primitive 데이터 받을수 없다, reference 데이터만 받을수 있음
		hs2.add(100);
		hs2.add(3);
		hs2.add(1000);
//		hs2.add("string"); // 에러 뜸 타입이 스트링이라 위에와 달라서 안됨
		
		HashSet hs3 = new HashSet<>(); // 데이터 제한 안했기때문에 아래에 다양한 데이터 형태들이 에러 발생안함
		hs3.add(10.0);
		hs3.add(3);
		hs3.add(1000);
		hs3.add("string");
		
		
		Iterator it = hs.iterator();
		while( it.hasNext()) { // 다음 요소가 있다면,...
			System.out.println(it.next()); // 요소를 꺼내와서 출력함
		}
		System.out.println();
		
		it = hs3.iterator();
		while( it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
