package Excercise;

//�л����� ������ 1�� ���� ������ �Űܼ� ����غ��ÿ�.
//�� ������ ����(Ranking) �˰��� ���ؼ� �˰� �ִ����� ���� �����̴�

public class Excercise004 {
	public static void main(String[] args) {
		
		int[] arr = {88, 50, 38, 100, 90, 100, 99, 65};
		
		System.out.println("�� 8�� �л��� ������ �����?");
		
		for (int k=0; k<arr.length; k++) {
			
			int rank = 8;
			
			for(int i=0; i<arr.length; i++) {
				if(arr[k] >= arr[i] && (k != i) ) {
					rank = rank - 1;
				}
			}
			System.out.print(arr[k] + "�� -> " + rank + "�� ");
		}

	}
}
