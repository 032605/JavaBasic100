package Excercise;

//학생들의 성적을 1등 부터 순위를 매겨서 출력해보시오.
//이 문제는 순위(Ranking) 알고리즘에 대해서 알고 있는지를 묻는 문제이다

public class Excercise004 {
	public static void main(String[] args) {
		
		int[] arr = {88, 50, 38, 100, 90, 100, 99, 65};
		
		System.out.println("총 8명 학생의 성적과 등수는?");
		
		for (int k=0; k<arr.length; k++) {
			
			int rank = 8;
			
			for(int i=0; i<arr.length; i++) {
				if(arr[k] >= arr[i] && (k != i) ) {
					rank = rank - 1;
				}
			}
			System.out.print(arr[k] + "점 -> " + rank + "등 ");
		}

	}
}
