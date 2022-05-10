package array;

import java.util.Arrays;

public class Array3 {
	public static void main(String[] args) {
		//========다중배열
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
		
		//========배열을 복사하는 메서드
		int[] arr = new int[] {1, 2, 3, 4, 5};
		int[] arr_copy = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.arraycopy(arr, 2, arr_copy, 4, 3);		//지정한 배열 요소 덮어쓰기

		System.out.println(Arrays.toString(arr));		//[1, 2, 3, 4, 5]
		System.out.println(Arrays.toString(arr_copy));	//[1, 2, 3, 4, 3, 4, 5, 8, 9, 10]
		
		//얕은 복사(Shallow Copy) : 복사된 배열이나 원본배열이 변경될 때 서로 간의 값이 같이 변경
		//깊은 복사(Deep Copy) : 복사된 배열이나 원본배열이 변경될 때 서로 간의 값은 바뀌지 않음
	}
}
