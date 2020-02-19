package javaStudy;

public class Bus extends Car { // public class 클래스명 extends 부모클래스명
	public void run() {
		super.run();
		System.out.println("Bus의 run 메소드");
	}
}
