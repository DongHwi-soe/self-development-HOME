package javaStudy;

public class StringExam {

	public static void main(String[] args) {
		// String�� new �����ڸ� �̿����� �ʰ� �ν��Ͻ��� ���� �� �ִ�.
		String str1 = "Hello";
		String str2 = "Hello";
		// str1�� str2�� ���� �ν��Ͻ��� ����Ű�� �ִ�.
		
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		// str3�� str4�� ���� �ν��Ͻ��� ����Ű�� �ִ�.
		
		if(str1 == str2) {
			System.out.println("str1�� str2�� ���� ���۷����Դϴ�.");
		}
		
		if(str1 == str3) {
			System.out.println("str1�� str3�� ���� ���۷����Դϴ�.");
		}
		
		if(str3 == str4) {
			System.out.println("str3�� str4�� ���� ���۷����Դϴ�.");
		}
		
		System.out.println(str1);
		
		System.out.println(str1.substring(3));
		
		System.out.println(str1);
		
	}

}
