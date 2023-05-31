package Quiz;

public class MainEntry {

	public static void main(String[] args) {
		
		
		
		Sawon s = new Sawon();

		s.disp();

		Sawon s2 = new Sawon(2,"oop","과장","마켓팅팀",200);
		
		s2.disp();
		
		
		Sawon s3 = new Sawon(2,"캡슐화","부장");
		
		s3.disp();

	}

}
