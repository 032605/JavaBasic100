package COS;

import java.util.Scanner;

public class Excercise004 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("row 값을 입력 ▼");
		int row = sc.nextInt();
		
		System.out.println("col 값을 입력 ▼");
		int col = sc.nextInt();
		
		char[][] arr = new char[row][col];
		
		for (int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j] = '□';
				
				if(i == (row/2) && j == (col/2))
					arr[i][j] = '★';
					
				System.out.print(arr[i][j] + " ");
				
			}
			System.out.println();
		}
		
		
	}
}
