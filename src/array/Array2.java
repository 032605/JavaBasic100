package array;

import java.util.Arrays;

public class Array2 {
	public static void main(String[] args) {
		//========배열 요소에 데이터 값 넣기
		int[] array = new int[5];
		
		array[0] = 3;
		array[1] = 11;
		array[2] = 22;
		array[3] = 33;
		array[4] = 44;

		System.out.println(array[0]);	//3
		System.out.println(array[1]);	//11
		System.out.println(array[2]);	//22
		System.out.println(array[3]);	//33
		System.out.println(array[4]);	//44
		
		System.out.println(array.length);			//5
		System.out.println(array[array.length-1]);	//44
		
		//========선언 및 초기화
		int[] rows =  {1, 2, 3, 4, 5, 6};
		int[] rows2 = new int[] {7, 8, 9}; //1번 방식보다 불편. 
		
		int[] err;
		//err = {10, 11, 12);				//Err
		
		//new 연산자에 의해 메모리 주소 값을 return
		err = new int[] {10, 11, 12};
		
		System.out.println(rows[1]);	//2
		System.out.println(rows2[1]);	//5
		System.out.println(err[1]);		//8
		
		//========반복문 사용
		System.out.println("반복문");
		for (int i=0; i<rows.length; i++) {
			System.out.print(rows[i] + " ");
		}
		
		//========향상된 for문 사용
		System.out.println("");
		System.out.println("향상된 for문");
		for (int rowfor:rows) {
			System.out.print(rowfor + " ");
		}
			
		//========반복문 사용하지 않고 배열 값 출력 : Arrays.toString()
		System.out.println("");
		System.out.println(Arrays.toString(rows));	//[1, 2, 3, 4, 5, 6]
	
	}
}
