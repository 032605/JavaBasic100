package conditionalStatement;

public class Iteration {
	public static void main(String[] args) {
		
		//for��, while��, do~while, ���� for��
		for (int i=0; i<10; i++) {
			System.out.print(i + " ");	//0, 1, 2, 3, 4...,9
		}

		System.out.println(" ");
		
		for (int i=0; i<10; ++i) {
			System.out.print(i + " ");	//0, 1, 2, 3, 4...,9
		}
		
		System.out.println(" ");
		
		// ========================================================================
		//���ĺ� 26���ڸ� �빮�ڷ� �ݺ��� ���
		char str = 65;
		
		while(str <= 90) {
			System.out.print(str + " ");
		
			str++;
		}
		
		System.out.println(" ");

		for(int j=65; j<=90; j++) {
			System.out.print((char)j + " ");
		}
		
		System.out.println(" ");

		
		// ========================================================================
		//Ȧ��, ¦�� ���ϱ� ������ while �ݺ��� ���
		int num = 1;
		
		while(num <= 30) {
			if(num%2 == 0)
				System.out.print(num + " ");

			num++;
		}
		
		// ========================================================================

		
		int number = 6;
		
		//while���� ���ǽ��� ���� �� �ڵ� ����, do while �ݺ����� ������ �ѹ� �̻� ����!
		do {
			System.out.println(number);	//7
			number++;
		} while (number <= 5);
		
		System.out.println("do-while " + number);
		
	}
}
