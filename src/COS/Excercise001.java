package COS;

import java.util.Arrays;

public class Excercise001 {
	// �迭�� ���ڵ��� �� �� ���� ����ϴ� �ڵ带 �����Ͻÿ�.
	// [ 1, 3, 2, 2, 1, 3, 1, 1 ] �� ���ں� �� ����?
	// 1 --> 4ȸ, 2 --> 2ȸ, 3 --> 2ȸ
	// �� ������ �ڰ��� ���� �ڵ� �������� ���� ������ ������ �������ν� �ڰ��� �ܿ����� ���� ���̴� �����̴�.
	// ������ ���� ������ �ܰ� �����̹Ƿ� �� �����ϰ� ������ Ÿ���� ġ�鼭 �ݺ� ������ �ؾ߸� �Ѵ�.
	// ������ "���� ������ ��ǥ ��" ������ �����⵵ �Ѵ�. --> �ᱹ �� �� ���� �����̴�.
	
	public static void main(String[] args) {
		
		int[] target = {1, 3, 0, 2, 1, 3, 1, 1};
		
		int[] arr = new int[4];
		
		for (int i=0; i<target.length; i++)
			arr[target[i]]++;
		
		System.out.println(Arrays.toString(arr));
		
		for (int j=0; j<arr.length; j++) 
			System.out.println(j + "==>" + arr[j] + "ȸ");
	}
	
}
