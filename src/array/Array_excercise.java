package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_excercise {
	public static void main(String[] args) {
		//������� �Է��� �޾� 2���� �迭�� �����ϰ� ���� �Է� > ��ø �ݺ��� ��� ���
		// �迭 ������ ����ڷκ��� �Է��� �޾Ƽ� 2���� �迭 �����
		int row;
		int col;
		String str;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� ������ �Է��ϰ� [Enter] ġ���� = ");
		row = scan.nextInt();
		System.out.println("���� ������ �Է��ϰ� [Enter] ġ���� = ");
		col = scan.nextInt();
		
		String[][] arr = new String[row][col];

		for (int i=0; i<arr.length; i++) {
			
			System.out.println( (i+1) + "��° �࿡ �Է��� ���� " + col + "���� ���ʴ�� �Է��ϰ� [Enter] ġ���� = ");
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
