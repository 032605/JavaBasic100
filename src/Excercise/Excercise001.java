package Excercise;


public class Excercise001 {
	public static void main(String[] args) {
		
		int[] arr = {4, 3, 150, 17, -2};
	
		// 정수로 이루어진 배열에서 가장 큰 값을 구하는 최댓값 알고리즘 구현
		
		// 배열 내 첫번째 원소의 값이 제일 크다고 가정하고 초기화
		int maxVal = arr[0];
		// int maxVal = Integer.MIN_VALUE; (이것도 가능, 양의 정수만 있다면 0도 가능)
		
		for (int i=1; i<arr.length; i++)
			if(maxVal < arr[i])
				maxVal = arr[i];
		
		System.out.println("현재 배열내 가장 큰 값은? " + maxVal);
		
		System.out.println("====================");
		
		// 정수로 이루어진 배열에서 가장 작은 값을 구하는 최솟값 알고리즘 구현
		int minVal = arr[0];
		
		for (int i=1; i<arr.length; i++)
			if(minVal > arr[i])
				minVal = arr[i];
		
		System.out.println("현재 배열내 가장 작은 값은? " + minVal);
		
	}
}
