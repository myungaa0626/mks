package Quiz1;

public class Bicycle extends Trans {
	
	@Override
	public String start(String name) {
		
		System.out.println(name+ " 자전거 출발합니다.");
		return name;
	}

	@Override
	public void stop(String name) {
		System.out.println(name+ " 자전거 출발합니다.");
	}

}
