package array;

import java.util.Scanner;

public class Array_excercise {
	public static void main(String[] args) {
		// code by me
		//������� �Է��� �޾� 2���� �迭�� �����ϰ� ���� �Է� > ��ø �ݺ��� ��� ���
		// �迭 ������ ����ڷκ��� �Է��� �޾Ƽ� 2���� �迭 �����
		int row;
		int col;
		String str;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� ������ �Է��ϰ� [Enter] ġ���� = ");
		row = scan.nextInt();
		System.out.print("���� ������ �Է��ϰ� [Enter] ġ���� = ");
		col = scan.nextInt();
		
		String[][] arr = new String[row][col];
		
		//�迭 ��� �Է�
		for (int i=0; i<arr.length; i++) {
			System.out.print( (i+1) + "��° �࿡ �Է��� ���� " + col + "���� ���ʴ�� �Է��ϰ� [Enter] ġ���� = ");
			str = scan.next();
			
			for (int j=0; j<arr[i].length; j++ ) {
				// ���ڿ��� substring���� �ϳ��� �����ͼ� 2���� �迭�� ����
				arr[i][j] = str.substring(j,j+1);
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