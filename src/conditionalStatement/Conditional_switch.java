package conditionalStatement;

import java.util.Scanner;

public class Conditional_switch {
	public static void main(String[] args) {
		
		Integer age;
		Scanner scan = new Scanner(System.in);

		System.out.println("���ɴ븦 �Է����ּ���");
		age = scan.nextInt();

		if(age > 10 && age < 20 ) {
			age = 10;
		} else if (age > 20 && age < 30) {
			age = 20;
		} else if (age > 30 && age < 40) {
			age = 30;
		} else if (age > 40 && age < 50) {
			age = 40;
		} else if (age > 50 && age < 60) {
			age = 50;
		} else if (age < 10 ) {
			System.out.println("10�� �����Դϴ�. ���α׷��� �����մϴ�.");
			System.exit(0);
			//return;
		}
		
		//System.out.println(age.getClass().getName());
		
		switch( age ) {
			case 10:
				System.out.println(age + "�� �Դϴ�. ���� �ڳʴ� A�����Դϴ�.");
				break;	//break���� �����ϸ� ������ ���̽����� ����� ��Ī���� �ʴ��� �ش� ������ ����
				
			case 20:
				System.out.println(age + "�� �Դϴ�. ���� �ڳʴ� B�����Դϴ�.");
				break;
				
			case 30:
				System.out.println(age + "�� �Դϴ�. �ڱ� ��� �ڳʴ� C�����Դϴ�.");
				break;
				
			case 40:
				System.out.println(age + "�� �Դϴ�. ����ũ �ڳʴ� D�����Դϴ�.");
				break;
				
			case 50:
				System.out.println(age + "�� �Դϴ�. �Ҽ� �ڳʴ� E�����Դϴ�.");
				break;
				
			default :	//���� ��Ī�� �Ǵ� ���̽����� ������ ����Ǿ� �� �ڵ带 ����
				System.out.println("60�� �̻��Դϴ�. ī���� �������� ���ǹٶ��ϴ�.");
				break;
		}
	}
}
