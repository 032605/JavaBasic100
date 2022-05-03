package conditionalStatement;

import java.util.Scanner;

public class Ternaryoperator {
	public static void main(String[] args) {
		int hour;
		
		Scanner scan = new Scanner(System.in);
		hour = scan.nextInt();
		
		//삼항연산자 10이하면 100 곱셈
		int test = hour<=10?hour*100:hour; 
		System.out.println("[2] " + test );
		
		//삼항연산자를 이용하여 12시 이전이면 오전, 이후면 오후를 출력
		String ampm = hour<12?"오전":"오후";
		System.out.println("[3] " + ampm);
	}
}
