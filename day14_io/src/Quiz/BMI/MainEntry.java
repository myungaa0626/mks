package Quiz.BMI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainEntry {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static ArrayList<bmi> bmi = new ArrayList<bmi>();
	static String name;
	static double height;
	static double weight;
	static int gender;
	static double bmiNumber;  // 계산된 bmi
	static String bmiStatus;  // bmi 상태 (과체중, 저체중,.....)

//	문제] 비만도 측정 프로그램 작성 - collection, file, io 이용하기
		//	추가 / 삭제 / 출력 / 수정 / 저장 처리할것
		//	몸무게, 키를 입력 받아서 BMI 계산하기
		//	BMI = 몸무게 / ((키 / 100.0) * ( 키 / 100.0) );
		//	남 : (신장cm - 100) x 0.9
		//	여 : (신장cm - 100) x 0.85
		//
		//	판정>
		//	18.5 미만 저체중
		//	18.5 ~ 22.9 정상
		//	23.0 ~ 24.9 과체중
		//	25.0 이상 비만
	
	static void genderSelection() { // addCustomerInfo에 넣어주는 성별선택
		
		while(true) {
			switch(gender) {
			case 1: System.out.println("남성을 선택하였습니다.");
					break;
			
			case 2: System.out.println("여성을 선택하였습니다.");
					break;
					
			default:System.out.println("남성(1), 여성(2)에서 선택해주세요.");
					break;
			}break;
		}
	}
	
	static void bmiCalc() { // bmi 계산 함수
		
		bmiNumber = weight /((height/100)*(height/100) );
	}
	
	static void bmiCalcStatus() { // bmi 상태
		
		//	판정>
		//	18.5 미만 저체중
		//	18.5 ~ 22.9 정상
		//	23.0 ~ 24.9 과체중
		//	25.0 이상 비만	
		if(bmiNumber<18.5) {
			
			bmiStatus = "18.5 미만 저체중";
			
		}else if(bmiNumber>=18.5 && bmiNumber<=22.9) {
			
			bmiStatus = "18.5 ~ 22.9 사이 정상";
		}else if(bmiNumber>=23.0 && bmiNumber<=24.9) {
			
			bmiStatus = "23.0 ~ 24.9 사이 과체중";
		}else
			bmiStatus = "25.0 이상 비만";
	}
	
	static void addCustomerInfo() throws IOException {
		System.out.println("추가할 고객의 이름, 성별, 키, 체중을 작성하세요");
		System.out.println("고객 이름: ");
		name = br.readLine();
		System.out.println("고객 성별(남=1, 여=2 입력): ");
		
		gender = Integer.parseInt(br.readLine());
		genderSelection();
		
		System.out.println("고객 키: ");

		height = Double.parseDouble(br.readLine());

		System.out.println("고객 체중: ");
		weight = Double.parseDouble(br.readLine());
		
//		BMI = 몸무게 / ((키 / 100.0) * ( 키 / 100.0) );
		
		bmiCalc();  // bmi 계산 함수
		bmiCalcStatus(); // bmi 상태 함수
		
		System.out.println();

		bmi.add(new bmi(name,height,weight, gender,bmiNumber, bmiStatus));
		
		System.out.println("고객정보가 입력되었습니다.");

	}
	
	static void deleteCustomerInfo() throws IOException {

		System.out.println("삭제할 고객의 이름을 작성하세요");
		System.out.println("이름: ");
		name = br.readLine();
		for(int i = 0; i<bmi.size(); i++) {
			if(name.equals(bmi.get(i).getName())) {
				bmi.remove(i);
				System.out.println("삭제 완료");
				
			}else
			System.out.println("존재하지 않는 회원입니다.");
		}
	}	
		
	static void saveCustomerBmi() throws IOException { // 저장
		
		File f = new File("C:\\Users\\KOSA\\eclipse-workspace\\day14_io\\bmi.txt");
		FileWriter fw = new FileWriter(f, true);
		
		for(bmi b : bmi) {
			
			fw.write("\n "+"이름: "+b.getName()+"\n 키: "+b.getHeight()+"\n 체중: "
					+b.getWeight()
					+"\n BMI 지수: "+b.getBmiNumber()+"\n BMI 상태: "+ b.getBmiStatus()+"\n");

		}
		
		fw.flush();
		fw.close();
		System.out.println("저장했습니다.");
			
	}	

	static void customerBmiUpdate() throws IOException { // 수정
		
		System.out.println("수정할 고객의 이름을 입력하세요.");
		name = br.readLine();
		for(int i=0; i<bmi.size(); i++) {
			if(name.equals(bmi.get(i).getName())) {
				System.out.println("수정할 항목 (1. 키 2. 몸무게)");
				int num = Integer.parseInt(br.readLine());
				switch(num) {
				case 1: 
					System.out.println("키 입력");
					height = Double.parseDouble(br.readLine());
					bmi.get(i).setHeight(height); // set
					
					bmiCalc();
					bmiCalcStatus();
					
					
					bmi.get(i).setBmiNumber(bmiNumber);
					bmi.get(i).setBmiStatus(bmiStatus);
					break;
					
					
				case 2:
					System.out.println("몸무게 입력");
					weight = Double.parseDouble(br.readLine());
					bmi.get(i).setWeight(weight);
					
					bmiCalc();
					bmiCalcStatus();
					
					bmi.get(i).setBmiNumber(bmiNumber);
					bmi.get(i).setBmiStatus(bmiStatus);
					break;
					
				} // switch end
			} // if end
			System.out.println("수정 완료");
		} // for end
	} // end customerBmiUpdate()

	static void customerBmiList() { // bmi 출력값
		
		System.out.println("고객의 bmi 지수를 출력하겠습니다.");
		for(int i = 0; i < bmi.size(); i++) {
			System.out.println(bmi.get(i));
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception{
		
	
		while(true) {
			
			System.out.println("1. 고객정보 추가 2. 삭제 3. 출력 4. 수정 5. 저장");

			int num = Integer.parseInt(br.readLine());
			
			switch(num) {
			
			case 1: addCustomerInfo();   
					break;
			
			case 2: deleteCustomerInfo();
					break;
			
			case 3: customerBmiList();
					break;
					
			case 4: customerBmiUpdate();
					break;
			
			case 5: saveCustomerBmi();
					break;
			
			} // end switch
		} // end while
	} // end method
} // end class
