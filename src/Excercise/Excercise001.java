package Excercise;


public class Excercise001 {
	public static void main(String[] args) {
		
		int[] arr = {4, 3, 150, 17, -2};
	
		// ������ �̷���� �迭���� ���� ū ���� ���ϴ� �ִ� �˰��� ����
		
		// �迭 �� ù��° ������ ���� ���� ũ�ٰ� �����ϰ� �ʱ�ȭ
		int maxVal = arr[0];
		// int maxVal = Integer.MIN_VALUE; (�̰͵� ����, ���� ������ �ִٸ� 0�� ����)
		
		for (int i=1; i<arr.length; i++)
			if(maxVal < arr[i])
				maxVal = arr[i];
		
		System.out.println("���� �迭�� ���� ū ����? " + maxVal);
		
		System.out.println("====================");
		
		// ������ �̷���� �迭���� ���� ���� ���� ���ϴ� �ּڰ� �˰��� ����
		int minVal = arr[0];
		
		for (int i=1; i<arr.length; i++)
			if(minVal > arr[i])
				minVal = arr[i];
		
		System.out.println("���� �迭�� ���� ���� ����? " + minVal);
		
	}
}
