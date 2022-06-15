package Excercise;

import java.util.Arrays;


public class Excercise004_02 {
	
	public static void printRanking(int[] scores, int[] rank) {
		int sco_len = scores.length;
		//int rank_len = sco_len;
		
		for(int i=0; i<sco_len; i++) {
			System.out.print(scores[i] + "점 => " + rank[i] + "등 ");
		}
	};
	
	public static void main(String[] args) {
		
		int[] scores = {88, 50, 38, 100, 90, 100, 99, 65};
		int[] rank = new int[scores.length];

		System.out.println("===총 8명 학생의 성적과 등수는?");

		//오름차순 정렬
		Arrays.sort(scores);
		
		for(int i=0; i<scores.length; i++) {
			
			rank[i] = 1;	//8등으로 초기화하는 것보다 1등으로 초기화하는 것이 더 효율적임.
			
			for(int j=0; j<scores.length; j++) {
				if(scores[i] < scores[j] )
					rank[i]++;   	
			}
			//System.out.print(scores[i] + "점 => " + rank[i] + "등 ");
		}

		// 출력 메서드 사용
		printRanking(scores, rank);
		
	}

}
