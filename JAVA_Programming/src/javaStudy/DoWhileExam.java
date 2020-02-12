package javaStudy;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		int value = 0;
		Scanner scan = new Scanner(System.in/*System.in은 키보드*/);
		
		do {
			// 반복할 문장들
			System.out.print("숫자를 입력 : ");
			value = scan.nextInt();
			System.out.println("입력받은 값 : " + value);
		} while(value != 10/*조건문*/);
		
		System.out.println("반복문 종료!!");
		
	}

}
