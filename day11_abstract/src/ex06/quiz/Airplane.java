package ex06.quiz;

public class Airplane extends Trans {

	// 생성자
	Airplane() {
		super.name = "비행기";
	}

	//
	@Override
	public void start() {
		System.out.println(name + "가 이륙합니다.");
	}

	@Override
	public void stop() {
		System.out.println(name + "가 착륙합니다.");
	}

}// Airplane