package javaStudy;

public class MyClass {

	/*public /����Ÿ��/ /�޼ҵ� ��/ (�Ű����� ��) { ���� }*/
	public void method1() {
		System.out.println("method1�� �����...");
	}
	
	public void method2(int x) {
		System.out.println(x + "�� �̿��� method2 ����.");
	}
	
	public int method3() {
		System.out.println("method3�� ����");
		return 10;
	}
	
	public void method4(int x, int y) {
		System.out.println(x + ", " + y + "�� �̿��� method4 ����.");
	}
	
	public int method5(int y) {
		System.out.println(y + "�� �̿��� method5 ����");
		
		return y*2;
	}
}
