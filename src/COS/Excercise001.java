package COS;

import java.util.Arrays;

public class Excercise001 {
	// 배열내 숫자들의 각 빈도 수를 출력하는 코드를 구현하시오.
	// [ 1, 3, 2, 2, 1, 3, 1, 1 ] 각 숫자별 빈도 수는?
	// 1 --> 4회, 2 --> 2회, 3 --> 2회
	// 이 문제는 자격증 관련 코딩 문제에서 많이 나오는 유형의 패턴으로써 자격증 외에서도 많이 쓰이는 패턴이다.
	// 굉장히 많이 나오는 단골 패턴이므로 잘 숙지하고 여러번 타이핑 치면서 반복 연습을 해야만 한다.
	// 문제가 "반장 선거의 득표 수" 등으로 나오기도 한다. --> 결국 빈도 수 묻는 패턴이다.
	
	public static void main(String[] args) {
		
		int[] target = {1, 3, 0, 2, 1, 3, 1, 1};
		
		int[] arr = new int[4];
		
		for (int i=0; i<target.length; i++)
			arr[target[i]]++;
		
		System.out.println(Arrays.toString(arr));
		
		for (int j=0; j<arr.length; j++) 
			System.out.println(j + "==>" + arr[j] + "회");
	}
	
}
