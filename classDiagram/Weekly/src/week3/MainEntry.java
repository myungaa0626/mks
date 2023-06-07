package week3;

import java.util.*;
import java.io.*;
public class MainEntry {
	public static int customerNum, vipNum, orderNum, itemNum;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String s;
		int i;
		OrderCreaterUI oc = new OrderCreaterUI();
		
		while (true) {
			try {
			System.out.println("0. 고객관리\t1. 창고관리\n2. 상품관리\t3. 주문관리\tq - 종료");
			s = br.readLine();
			if (s.toLowerCase().equals("q")) break;
			switch (Integer.parseInt(s)) {
				case 0:
					// 고객 관리
					System.out.println("0. 고객추가\t1. 고객목록\n2. 회원추가\t3. 회원목록");
					s = br.readLine();
					switch (Integer.parseInt(s)) {
						case 0: 
							// 고객 추가
							System.out.println("이름 주소 전화번호 순서로 입력해주세요");
							st = new StringTokenizer(br.readLine());
							oc.addCustomer(customerNum++, st.nextToken(), st.nextToken(), st.nextToken());
							break;
						case 1:
							// 고객 목록
							oc.showCustomers();
							break;
						case 2:
							// 회원 추가
							System.out.println("이름 주소 전화번호 순서로 입력해주세요");
							st = new StringTokenizer(br.readLine());
							oc.addVip(customerNum++, vipNum++, st.nextToken(), st.nextToken(), st.nextToken());
							break;
						case 3:
							// 회원목록
							oc.showVip();
							break;
						default:
							break;
					}
					break;
				case 1:
					// 창고 관리
					System.out.println("0. 창고추가\t1. 창고목록");
					s = br.readLine();
					switch (Integer.parseInt(s)) {
					case 0: 
						// 창고 추가
						System.out.println("이름 주소 전화번호 순서로 입력해주세요.");
						st = new StringTokenizer(br.readLine());
						oc.addStorage(st.nextToken(), st.nextToken(), st.nextToken());
						break;
					case 1:
						// 창고 목록 보기
						oc.showStorages();
						break;
					default:
						break;
				}
					break;
				case 2:
					// 상품 관리
					oc.showStorages();
					System.out.print("창고를 선택하세요 : ");
					i = Integer.parseInt(br.readLine());
					if (i >= oc.getStorageList().size()) {
						System.out.println("없는 창고입니다");
						break;
					}
					
					oc.showItems(i);
					System.out.println("0. 상품추가\t1. 뒤로");
					if (Integer.parseInt(br.readLine()) == 1) break;
					
					System.out.println("상품명 가격 수량 순서로 입력해주세요");
					st = new StringTokenizer(br.readLine());
					oc.addItem(itemNum++, i, st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
					break;
				case 3:
					// 주문 관리
					System.out.println("0. 추문추가\t1. 주문취소\n2. 주문목록\t3. 주문명세");
					s = br.readLine();
					switch (Integer.parseInt(s)) {
					case 0: 
						// 주문 추가
						oc.showCustomers();
						
						System.out.println("주문고객번호를 입력해주세요");
						i = Integer.parseInt(br.readLine());
						
						if (oc.inputOrder(orderNum, i)) orderNum++;
						
						oc.showStorages();
						System.out.print("창고를 선택하세요 : ");
						i = Integer.parseInt(br.readLine());
						if (i >= oc.getStorageList().size()) {
							System.out.println("없는 창고입니다");
							break;
						}
						oc.enrollOrder(i);
						
						break;
					case 1:
						// 주문 취소(삭제)
						oc.showOrder();
						i = oc.findOrder(Integer.parseInt(br.readLine()));
						oc.cancelOrder(i);
						
						break;
					case 2:
						// 주문 목록 보기
						oc.showOrder();
						break;
					case 3:
						// 주문 세부사항 보기
						oc.showOrder();
						System.out.println("명세를 볼 주문의 번호를 입력해주세요");
						i = Integer.parseInt(br.readLine());
						oc.showOrderDetails(i);
					default:
						break;
					}
					break;
				default:
					break;
			}
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다\n");
			}
		}
	}
}
