package pacakge;

import java.util.ArrayList;

// 1���� 10 ������ ���ڰ� �������� 10�� ���
public class MathRandom {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			int num = (int) (Math.random() * 10) + 1;
			list.add(num);
		}
		
		for(Integer j:list)
			System.out.print(j + "  ");
		System.out.println();
			
	}
}
