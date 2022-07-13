package array;

import java.util.Scanner;

public class Array_excercise {
	public static void main(String[] args) {
		// code by me
		//사용자의 입력을 받아 2차원 배열을 생성하고 값을 입력 > 중첩 반복문 사용 출력
		// 배열 생성시 사용자로부터 입력을 받아서 2차원 배열 만들기
		int row;
		int col;
		String str;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("행의 갯수를 입력하고 [Enter] 치세요 = ");
		row = scan.nextInt();
		System.out.print("열의 갯수를 입력하고 [Enter] 치세요 = ");
		col = scan.nextInt();
		
		String[][] arr = new String[row][col];
		
		//배열 요소 입력
		for (int i=0; i<arr.length; i++) {
			System.out.print( (i+1) + "번째 행에 입력할 문자 " + col + "개를 차례대로 입력하고 [Enter] 치세요 = ");
			str = scan.next();
			
			for (int j=0; j<arr[i].length; j++ ) {
				// 문자열을 substring으로 하나씩 가져와서 2차원 배열에 넣음
				arr[i][j] = str.substring(j,j+1);
			}
		}
		
		//출력
		for (int a=0; a<arr.length; a++) {
			for (int b=0; b<arr[a].length; b++) {
				System.out.print(arr[a][b]);
			}
			System.out.println();
		}
		
	}
}
