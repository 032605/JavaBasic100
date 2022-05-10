package array;

import java.util.Arrays;

public class Array3 {
	public static void main(String[] args) {
		//========���߹迭
		int[] a,b,c;
		
		int d[], e[], f[];
		int g[], h;
		
		a = new int[3];
		b = new int[3];
		c = new int[3];

		d = new int[6];
		e = new int[6];
		f = new int[6];

		g = new int[9];
		h = 10;
		
		System.out.println(Arrays.toString(a));	//[0, 0, 0]
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		
		System.out.println(Arrays.toString(d));	//[0, 0, 0, 0, 0, 0]
		System.out.println(Arrays.toString(e));
		System.out.println(Arrays.toString(f));
		
		System.out.println(Arrays.toString(g));	//[0, 0, 0, 0, 0, 0, 0, 0, 0]
		System.out.println(h);					//10
		
		//========�迭�� �����ϴ� �޼���
		int[] arr = new int[] {1, 2, 3, 4, 5};
		int[] arr_copy = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.arraycopy(arr, 2, arr_copy, 4, 3);		//������ �迭 ��� �����

		System.out.println(Arrays.toString(arr));		//[1, 2, 3, 4, 5]
		System.out.println(Arrays.toString(arr_copy));	//[1, 2, 3, 4, 3, 4, 5, 8, 9, 10]
		
		//���� ����(Shallow Copy) : ����� �迭�̳� �����迭�� ����� �� ���� ���� ���� ���� ����
		//���� ����(Deep Copy) : ����� �迭�̳� �����迭�� ����� �� ���� ���� ���� �ٲ��� ����
	}
}
