package javaStudy;

public class BusExam {
	
	public static void main(String[] args) {
		Car c = new Bus();
		c.run();
//		c.ppangppang(); // �θ� Ÿ������ �ڽ��� ����ų �� �ִ� �� ��� �θ� ������ �ִ� ���븸 ��� ����
		
		Bus bus = (Bus)c;
		bus.run();
		bus.ppangppang();
	}
	
}
