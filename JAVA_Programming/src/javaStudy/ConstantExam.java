package javaStudy;

public class ConstantExam {

	public static void main(String[] args) {
		int i;
		i = 10;
		i = 5;
		
		System.out.println(i);
		
		final int J; // 상수는 대문자의 명명규칙을 사용한다.
		J = 10;
		
//		J = 5;
		
		System.out.println(J);
		
		double circleArea;
		final double PI = 3.14159;
		circleArea = 3 * 3 * PI;
		
		System.out.println(circleArea);
		
		final int OIL_PRICE = 1450; // 두 개 이상의 단어를 쓸 경우에는 단어 사이에 '_'를 넣는다.
		
		int totalPrice = 50 * OIL_PRICE;
		
		System.out.println(totalPrice);
		
	}
	
}
