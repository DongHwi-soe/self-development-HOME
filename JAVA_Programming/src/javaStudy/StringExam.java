package javaStudy;

public class StringExam {

	public static void main(String[] args) {
		// String은 new 연산자를 이용하지 않고 인스턴스를 만들 수 있다.
		String str1 = "Hello";
		String str2 = "Hello";
		// str1과 str2는 같은 인스턴스를 가리키고 있다.
		
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		// str3과 str4는 각각 인스턴스를 가리키고 있다.
		
		if(str1 == str2) {
			System.out.println("str1과 str2는 같은 래퍼런스입니다.");
		}
		
		if(str1 == str3) {
			System.out.println("str1과 str3은 같은 래퍼런스입니다.");
		}
		
		if(str3 == str4) {
			System.out.println("str3과 str4는 같은 래퍼런스입니다.");
		}
		
		System.out.println(str1);
		
		System.out.println(str1.substring(3));
		
		System.out.println(str1);
		
	}

}
