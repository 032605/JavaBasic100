package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_excercise {
	public static void main(String[] args) {
		//사용자의 입력을 받아 2차원 배열을 생성하고 값을 입력 > 중첩 반복문 사용 출력
		// 배열 생성시 사용자로부터 입력을 받아서 2차원 배열 만들기
		int row;
		int col;
		String str;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("행의 갯수를 입력하고 [Enter] 치세요 = ");
		row = scan.nextInt();
		System.out.println("열의 갯수를 입력하고 [Enter] 치세요 = ");
		col = scan.nextInt();
		
		String[][] arr = new String[row][col];

		for (int i=0; i<arr.length; i++) {
			
			System.out.println( (i+1) + "번째 행에 입력할 문자 " + col + "개를 차례대로 입력하고 [Enter] 치세요 = ");
			str = scan.next();
			
			for (int j=0; j<arr[i].length; j++ ) {			
				arr[i][j] = str.substring(j,j+1);
			}
		}
		
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		
	}
}
