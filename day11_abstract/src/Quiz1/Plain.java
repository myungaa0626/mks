package Quiz1;

public class Plain extends Trans {
	
	@Override
	public String start(String name) {
		System.out.println(name+ " 비행기 출발합니다.");
		return name;
	}
	@Override
	public void stop(String name) {
		System.out.println(name+ " 비행기 착륙합니다.");	
	}
}
