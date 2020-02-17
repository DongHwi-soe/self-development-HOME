package javaStudy;

public class MyClass {

	/*public /리턴타입/ /메소드 명/ (매개변수 들) { 구현 }*/
	public void method1() {
		System.out.println("method1이 실행될...");
	}
	
	public void method2(int x) {
		System.out.println(x + "를 이용한 method2 실행.");
	}
	
	public int method3() {
		System.out.println("method3이 실행");
		return 10;
	}
	
	public void method4(int x, int y) {
		System.out.println(x + ", " + y + "를 이용한 method4 실행.");
	}
	
	public int method5(int y) {
		System.out.println(y + "를 이용한 method5 실행");
		
		return y*2;
	}
}
