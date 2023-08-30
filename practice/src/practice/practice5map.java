package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class practice5map {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();

		boolean bool = true;

		while (bool) {
			System.out.println("무엇을 하시겠습니까?");
			System.out.println("1. 사용자 추가");
			System.out.println("2. 사용자 수정");
			System.out.println("3. 사용자 삭제");
			System.out.println("4. 사용자 교체");
			System.out.println("5. 사용자 전체 출력");
			System.out.println("6. 종료");

			int num = sc.nextInt();
			switch (num) {
			case 1:
				addUser(sc, map);
				break;
			case 2:
				modifyUser(sc, map);
				break;
			case 3:
				removeUser(sc, map);
				break;
			case 4:
				replaceUser(sc, map);
				break;
			case 5:
				printAllUsers(map);
				break;
			default:
				bool = false;
			}
		}

		System.out.println("프로그램을 종료합니다.");

	}

	// 사용자 추가
	public static void addUser(Scanner sc, Map<String, String> map) {
		System.out.println("사용자 아이디를 입력하세요.");
		String id = sc.next();

		System.out.println("사용자 이름을 입력하세요.");
		String name = sc.next();

		if (map.containsKey(id)) {
			System.out.println("이미 존재하는 사용자입니다.");
		} else {
			map.put(id, name);
			System.out.println("사용자가 추가되었습니다.");
		}
	}

	// 사용자 수정
	private static void modifyUser(Scanner sc, Map<String, String> map) {
		System.out.println("수정할 사용자 아이디를 입력하세요.");
		String id = sc.next();

		if (map.containsKey(id)) {
			System.out.println("수정할 사용자 이름을 입력하세요.");
			String name = sc.next();
			map.put(id, name);
			System.out.println("사용자 정보가 수정되었습니다.");
		} else {
			System.out.println("존재하지 않는 사용자입니다.");
		}

	}

	// 사용자 삭제
	private static void removeUser(Scanner sc, Map<String, String> map) {
		System.out.println("삭제할 사용자 아이디를 입력하세요.");
		String id = sc.next();

		if (map.containsKey(id)) {
			map.remove(id);
			System.out.println("사용자가 삭제되었습니다.");
		} else {
			System.out.println("존재하지 않는 사용자입니다.");
		}

	}

	// 사용자 교체
	private static void replaceUser(Scanner sc, Map<String, String> map) {
		System.out.println("교체할 사용자 아이디를 입력하세요.");
		String oldId = sc.next();

		if (map.containsKey(oldId)) {
			System.out.println("새로운 사용자 아이디를 입력하세요.");
			String newId = sc.next();

			if (map.containsKey(newId)) {
				System.out.println("이미 존재하는 아이디입니다.");
			} else {
				System.out.println("새로운 사용자 이름을 입력하세요.");
				String name = sc.next();

				map.put(newId, name);
				map.remove(oldId);
				System.out.println("사용자 정보가 교체되었습니다.");
			}
		} else {
			System.out.println("존재하지 않는 사용자입니다.");
		}
	}

	private static void printAllUsers(Map<String, String> map) {
		if (map.isEmpty()) {
			System.out.println("등록된 사용자가 없습니다.");
		} else {
			System.out.println();
			System.out.println("사용자 목록:");

			for (String id : map.keySet()) {
				System.out.println("아이디: " + id + ", 이름: " + map.get(id));
			}
		}
	}
}
