package Excercise;

import java.util.Arrays;
import java.util.Collections;


public class Excercise003 {
	public static void main(String[] args) {
		int[] arr = {88, 50, 38, 100, 90, 100, 99, 65};

		System.out.print("���� �� ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//����� ���� �޼��带 ����ؼ� ��������
		Arrays.sort(arr);
		
		System.out.print("���� �� ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int j:arr) {
			System.out.print(j + " ");
		}
		
		System.out.println();
		System.out.println("=========================");
		//����� ���� �޼��带 ����ؼ� ��������
		//���������̰ų� ���ϴ´�� ������ ������ ������ ���� �⺻��(Primitive Type) �迭���� ������ �ȵ�. > ���� Ŭ���� > �迭��, Collections.reverseOrder()
		//*����) String�� �⺻�� Ÿ���� �ƴ�^)^
		Integer[] arr2 = {88, 50, 38, 100, 90, 100, 99, 65};
		
		System.out.println("���� �� " + Arrays.toString(arr2));
		
		Arrays.sort(arr2,Collections.reverseOrder());	//Python�̶� ���
		
		System.out.println("���� �� " + Arrays.toString(arr2));
		
		
	}
}
