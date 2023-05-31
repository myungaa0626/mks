package ex03.collection.map;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashMapEx1 {
	public static void main(String[] args) { // Map : key / value 한쌍으로 처리. (set + list)
		Map map = new HashMap();
		map.put("kosa", "1234"); // 키 값은 유일성을 가짐 (index)
		map.put("deabo", "1004");
		map.put("doyeon", "7895");
		map.put("kosa1", "1234"); // 
		
		System.out.println("요소 개수 : "+ map.size());
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.println("id : ");
			String id = sc.nextLine().trim();
			System.out.println("pwd : ");
			String pwd = sc.nextLine().trim();
			System.out.println();
			
			if( !map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			}else {
				if( !map.get(id).equals(pwd)) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				}else {
					System.out.println("id와 pwd가 일치합니다.");
					break;
				}
			}
		} // end while
	}
}