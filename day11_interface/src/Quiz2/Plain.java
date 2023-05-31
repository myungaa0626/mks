package Quiz2;

public class Plain implements Trans {

	@Override
	public void start(String name) {
		System.out.println("비행기 출발합니다");	
	}
	@Override
	public void stop(String name) {
		System.out.println("비행기 멈춥니다");	
	}
	public void show(String name) {
		System.out.println("비행기 출발합니다");	
		System.out.println("비행기 멈춥니다");	
	}
}
