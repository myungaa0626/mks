package Quiz1;

public class Subway extends Trans {

	@Override
	public String start(String name) {
		
		System.out.println(name+" 지하철 출발합니다.");
		return name;
	}
	@Override
	public void stop(String name) {
		
		System.out.println(name+" 지하철 멈춥니다.");
	}
}
