package array;

import java.util.Scanner;

public class Array_char {
	public static void main(String[] args) {
		// code by ����
		// ������� �Է��� �޾� 2���� �迭�� �����ϰ� ���� �Է� > ��ø �ݺ��� ��� ���
		// �迭 ������ ����ڷκ��� �Է��� �޾Ƽ� 2���� �迭 �����
		int row;
		int col;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� ������ �Է��ϰ� [Enter] ġ���� = ");
		row = scan.nextInt();
		System.out.print("���� ������ �Է��ϰ� [Enter] ġ���� = ");
		col = scan.nextInt();
		
		char[][] arr = new char[row][col];
		
		String[] strArr = new String[row];
		
		for (int i=0; i<row; i++) {
			// �� �Է�
			System.out.print( (i+1) +"��° �࿡ �Է��� ���� " + col + "���� �Է��ϰ� [Enter] ġ���� = ");
			strArr[i] = scan.next();
			
			for(int j=0; j<col; j++) {
				// String �迭 �� ���� ��� �ϳ��� �����ͼ� char 2���� �迭�� �ֱ�
				arr[i][j] = strArr[i].charAt(j);
			}
		}
		
		//���
		for (int a=0; a<arr.length; a++) {
			for (int b=0; b<arr[a].length; b++) {
				System.out.print(arr[a][b]);
			}
			System.out.println();
		}
	}
}
