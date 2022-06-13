package Excercise;

import java.util.Arrays;

public class Excercise002 {
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int max, min;
		
		for (int i =0; i<arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);	//Math.random()은 double 타입으로 반환. cast 필수
		}
		
		System.out.println("랜덤 요소 배열 ==> " + Arrays.toString(arr));
		
		max = arr[0];
		min = arr[0];
		
		for (int j=0; j<arr.length; j++) {
			//최댓값
			if(max < arr[j]) {
				max = arr[j];
			}
			//최솟값
			if(min > arr[j]) {
				min = arr[j];
			}
		}
		
		System.out.println("arr의 최댓값은 : " + max + "  "+ "arr의 최솟값은 : " + min);
		
	}
}
