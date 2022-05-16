package array;

import java.util.Scanner;

public class Array_char {
	public static void main(String[] args) {
		// code by 강의
		// 사용자의 입력을 받아 2차원 배열을 생성하고 값을 입력 > 중첩 반복문 사용 출력
		// 배열 생성시 사용자로부터 입력을 받아서 2차원 배열 만들기
		int row;
		int col;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("행의 갯수를 입력하고 [Enter] 치세요 = ");
		row = scan.nextInt();
		System.out.print("열의 갯수를 입력하고 [Enter] 치세요 = ");
		col = scan.nextInt();
		
		char[][] arr = new char[row][col];
		
		String[] strArr = new String[row];
		
		for (int i=0; i<row; i++) {
			// 값 입력
			System.out.print( (i+1) +"번째 행에 입력할 문자 " + col + "개를 입력하고 [Enter] 치세요 = ");
			strArr[i] = scan.next();
			
			for(int j=0; j<col; j++) {
				// String 배열 한 열의 요소 하나씩 가져와서 char 2차원 배열에 넣기
				arr[i][j] = strArr[i].charAt(j);
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
