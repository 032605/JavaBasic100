package conditionalStatement;

import java.util.Scanner;

public class Ternaryoperator {
	public static void main(String[] args) {
		int hour;
		
		Scanner scan = new Scanner(System.in);
		hour = scan.nextInt();
		
		//���׿����� 10���ϸ� 100 ����
		int test = hour<=10?hour*100:hour; 
		System.out.println("[2] " + test );
		
		//���׿����ڸ� �̿��Ͽ� 12�� �����̸� ����, ���ĸ� ���ĸ� ���
		String ampm = hour<12?"����":"����";
		System.out.println("[3] " + ampm);
	}
}
