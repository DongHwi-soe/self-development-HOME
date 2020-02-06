package javaStudy;

public class TypeCastingExam {

	public static void main(String[] args) {
		int x = 50000;
		long y = x;

		long x2 = 5;
//		int y2 = x2; // long 타입을 int 타입으로 변환시키려고 하니깐 오류가 생겼다.
		int y2 = (int) x2; // (int)를 넣어 long을 int로 바꾼 것을 강제 형변환이라고 한다.
	}
	
}
