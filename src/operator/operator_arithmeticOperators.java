package operator;

public class operator_arithmeticOperators {
	public static void main(String[] args) {
		int a, b, c, d, rst;
		double rst2, rst3, rst4, rst5;
		double avg;
		
		a=60; b=8; c=300; d=400;
		rst = a/b;
		rst2 = a/b;
		rst3 = a/(double)b;		//�� ū type���� ����ϹǷ� double type���� �����
		rst4 = 100/3;			//������ ���
		rst5 = 100.0/3.0;		// --> (double)100/3�� ����
		avg = 250/3.0;
		
		System.out.println(a + b);						//68
		System.out.println("a + b = " + a + b  );		//608
		System.out.println("a + b = " + (a + b)  );		//68
		System.out.println("a - b = " + (a - b)  );		//72
		System.out.println("a * b = " + (a * b)  );		//720
		
		System.out.println("a / b = " + (a / b)  );		//7
		System.out.println("a / b = " + (double) rst);	//7.0
		System.out.println("a / b = " + rst2);			//7.0 (���� �Ȱ���. ���Ϲ޴� ������ �Ǽ������� �ϴ��� int�� ����)
		System.out.println("a / b = " + rst3);			//7.5 
		System.out.println("a / b = " + rst4);			//33.0
		System.out.println("a / b = " + rst5);			//33.333333333333336
		System.out.printf("�� ������ ����� %.2f�Դϴ�. %n", avg);
		
		System.out.println("a % b = " + (a % b)  );		//4

		// ���� ���� 
		int e=0, f=100;
		
		e= e + 1;
		e+= 1;
		System.out.println(e);	//2
		
		e-= 1;
		System.out.println(e);	//1
		
		f++;
		System.out.println(f);	//101
		
		f--;
		System.out.println(f);	//101
		
	}
}
