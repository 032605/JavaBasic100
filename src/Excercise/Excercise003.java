package Excercise;

import java.util.Arrays;
import java.util.Collections;


public class Excercise003 {
	public static void main(String[] args) {
		int[] arr = {88, 50, 38, 100, 90, 100, 99, 65};

		System.out.print("정렬 전 ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//내장된 정렬 메서드를 사용해서 오름차순
		Arrays.sort(arr);
		
		System.out.print("정렬 후 ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int j:arr) {
			System.out.print(j + " ");
		}
		
		System.out.println();
		System.out.println("=========================");
		//내장된 정렬 메서드를 사용해서 내림차순
		//내림차순이거나 원하는대로 정렬의 조건을 설정할 때는 기본형(Primitive Type) 배열에는 적용이 안됨. > 래퍼 클래스 > 배열명, Collections.reverseOrder()
		//*참고) String은 기본형 타입이 아님^)^
		Integer[] arr2 = {88, 50, 38, 100, 90, 100, 99, 65};
		
		System.out.println("정렬 전 " + Arrays.toString(arr2));
		
		Arrays.sort(arr2,Collections.reverseOrder());	//Python이랑 비슷
		
		System.out.println("정렬 후 " + Arrays.toString(arr2));
		
		
	}
}
