package javaStudy;

public class VariableExam {
	
	public static void main(String[] args) {
		int count; // int : Ÿ��(������), count : �̸�
		
		count = 10;
		
		count = 20;
		
		System.out.println(count); // �������� ��� ���� ���´�.
		
//		count = 11.1; int���� double���� ��Ƽ� �����Ͽ��� �߻�.
		
		double avg = 11.1;
		
		String name = "carami";
		
		int totalCount = count; // �� �� �̻��� �ܾ ������ �ι�° �̻���� ù��° �ܾ� ���ڸ��� �빮�ڷ�
		
		System.out.println(avg);
		System.out.println(name);
		System.out.println(totalCount);
	}
	
}