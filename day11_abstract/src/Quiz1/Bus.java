package Quiz1;

public class Bus extends Trans {

	String result = " ";
	@Override
	public String start(String name) {
		System.out.println(name + " 버스 출발합니다.");
		return name;
	}
	@Override
	public void stop(String name) {
		
		System.out.println(name + " 버스 멈춥니다.");
	}
}
