package Excercise;

import java.util.Arrays;

public class Excercise002 {
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int max, min;
		
		for (int i =0; i<arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);	//Math.random()�� double Ÿ������ ��ȯ. cast �ʼ�
		}
		
		System.out.println("���� ��� �迭 ==> " + Arrays.toString(arr));
		
		max = arr[0];
		min = arr[0];
		
		for (int j=0; j<arr.length; j++) {
			//�ִ�
			if(max < arr[j]) {
				max = arr[j];
			}
			//�ּڰ�
			if(min > arr[j]) {
				min = arr[j];
			}
		}
		
		System.out.println("arr�� �ִ��� : " + max + "  "+ "arr�� �ּڰ��� : " + min);
		
	}
}
