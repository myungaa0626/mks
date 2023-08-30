package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class practice6ArrayList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<User> list = new ArrayList<>();

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
				addUser(sc, list);
				break;
			case 2:
				modifyUser(sc, list);
				break;
			case 3:
				removeUser(sc, list);
				break;
			case 4:
				replaceUser(sc, list);
				break;
			case 5:
				printAllUsers(list);
				break;
			default:
				bool = false;
			}
		}

		System.out.println("프로그램을 종료합니다.");
	}

	// 사용자 정의 클래스
	static class User {
		String id;
		String name;

		User(String id, String name) {
			this.id = id;
			this.name = name;
		}
	}

	// 사용자 추가
	public static void addUser(Scanner sc, ArrayList<User> list) {

		if (list.size() >= 5) {
			System.out.println("5개가 마감되었습니다.\n");

			return;
		}
		System.out.println("계속 진행하시겠습니까? (y/n)");
		String proceed = sc.next();

		if ("y".equalsIgnoreCase(proceed)) {
			System.out.println("사용자 아이디를 입력하세요.");
			String id = sc.next();

			System.out.println("사용자 이름을 입력하세요.");
			String name = sc.next();

			User newUser = new User(id, name);
			list.add(newUser);

			System.out.println("사용자가 추가되었습니다.");
		} else {
			System.out.println("사용자 추가를 취소했습니다.");
		}
	}

	// 사용자 수정
	public static void modifyUser(Scanner sc, ArrayList<User> list) {
		System.out.println("수정할 사용자 아이디를 입력하세요.");
		String id = sc.next();

		User targetUser = null;
		for (User user : list) {
			if (user.id.equals(id)) {
				targetUser = user;
				break;
			}
		}

		if (targetUser != null) {
			System.out.println("수정할 사용자 이름을 입력하세요.");
			String name = sc.next();
			targetUser.name = name;
			System.out.println("사용자 정보가 수정되었습니다.");
		} else {
			System.out.println("존재하지 않는 사용자입니다.");
		}
	}

	// 사용자 삭제
	public static void removeUser(Scanner sc, ArrayList<User> list) {
		System.out.println("삭제할 사용자 아이디를 입력하세요.");
		String id = sc.next();

		User targetUser = null;
		for (User user : list) {
			if (user.id.equals(id)) {
				targetUser = user;
				break;
			}
		}

		if (targetUser != null) {
			list.remove(targetUser);
			System.out.println("사용자가 삭제되었습니다.");
		} else {
			System.out.println("존재하지 않는 사용자입니다.");
		}
	}

	// 사용자 교체
	public static void replaceUser(Scanner sc, ArrayList<User> list) {
		System.out.println("교체할 사용자 아이디를 입력하세요.");
		String oldId = sc.next();

		User targetUser = null;
		for (User user : list) {
			if (user.id.equals(oldId)) {
				targetUser = user;
				break;
			}
		}

		if (targetUser != null) {
			System.out.println("새로운 사용자 아이디를 입력하세요.");
			String newId = sc.next();

			System.out.println("새로운 사용자 이름을 입력하세요.");
			String newName = sc.next();

			User newUser = new User(newId, newName);
			list.remove(targetUser);
			list.add(newUser);

			System.out.println("사용자 정보가 교체되었습니다.");
		} else {
			System.out.println("존재하지 않는 사용자입니다.");
		}
	}

	// 사용자 전체 출력
	public static void printAllUsers(ArrayList<User> list) {
		if (list.isEmpty()) {
			System.out.println("출력할 데이터가 없습니다!");
		} else {
			System.out.println("사용자 목록:");
			for (User user : list) {
				System.out.println("아이디: " + user.id + ", 이름: " + user.name);
			}
		}
	}

}
