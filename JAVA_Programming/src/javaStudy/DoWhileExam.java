package javaStudy;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		int value = 0;
		Scanner scan = new Scanner(System.in/*System.in�� Ű����*/);
		
		do {
			// �ݺ��� �����
			System.out.print("���ڸ� �Է� : ");
			value = scan.nextInt();
			System.out.println("�Է¹��� �� : " + value);
		} while(value != 10/*���ǹ�*/);
		
		System.out.println("�ݺ��� ����!!");
		
	}

}
