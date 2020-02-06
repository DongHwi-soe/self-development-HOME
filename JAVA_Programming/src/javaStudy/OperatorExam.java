package javaStudy;

public class OperatorExam {

	public static void main(String[] args) {
		// 부호 연산자 ( +, - )
		int i1 = -5;
		int i2 = +i1;
		int i3 = -i1;
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);

		// 증감 연산자 ( ++, -- )
		int i4 = ++i3; // i3을 출력 후 i3 = i3 + 1;를 연산
		int i5 = i3++; // i3 = i3 + 1;를 먼저 입력하고 출력
		int i6 = --i3; // i3을 출력 후 i3 = i3 - 1;를 연산
		int i7 = i3--; // i3 = i3 - 1;를 먼저 입력하고 출력
		
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);
		System.out.println(i7);
		
		// 피연산자 하나로 연산할 수 없는 연산자 이항 
		int i = 5;
		int j = 2;
		
		// 2개의 변수 이용한 산술 연산자 ( +, -, *, /, % )
		System.out.println(i + j); // 더하기
		System.out.println(i - j); // 빼기
		System.out.println(i * j); // 곱하기
		System.out.println(i / j); // 나누기
		System.out.println(i % j); // 나머지
	}

}
