package conditionalStatement;

public class Iteration {
	public static void main(String[] args) {
		
		//for문, while문, do~while, 향상된 for문
		for (int i=0; i<10; i++) {
			System.out.print(i + " ");	//0, 1, 2, 3, 4...,9
		}

		System.out.println(" ");
		
		for (int i=0; i<10; ++i) {
			System.out.print(i + " ");	//0, 1, 2, 3, 4...,9
		}
		
		System.out.println(" ");
		
		// ========================================================================
		//알파벳 26문자를 대문자로 반복문 출력
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
		//홀수, 짝수 구하기 문제를 while 반복문 사용
		int num = 1;
		
		while(num <= 30) {
			if(num%2 == 0)
				System.out.print(num + " ");

			num++;
		}
		
		// ========================================================================

		
		int number = 6;
		
		//while문은 조건식이 참일 때 코드 실행, do while 반복문은 무조건 한번 이상 실행!
		do {
			System.out.println(number);	//7
			number++;
		} while (number <= 5);
		
		System.out.println("do-while " + number);
		
	}
}
