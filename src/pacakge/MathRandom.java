package pacakge;

import java.util.ArrayList;

// 1부터 10 사이의 숫자가 무작위로 10개 출력
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
