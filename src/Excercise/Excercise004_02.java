package Excercise;

import java.util.Arrays;


public class Excercise004_02 {
	
	public static void printRanking(int[] scores, int[] rank) {
		int sco_len = scores.length;
		//int rank_len = sco_len;
		
		for(int i=0; i<sco_len; i++) {
			System.out.print(scores[i] + "�� => " + rank[i] + "�� ");
		}
	};
	
	public static void main(String[] args) {
		
		int[] scores = {88, 50, 38, 100, 90, 100, 99, 65};
		int[] rank = new int[scores.length];

		System.out.println("===�� 8�� �л��� ������ �����?");

		//�������� ����
		Arrays.sort(scores);
		
		for(int i=0; i<scores.length; i++) {
			
			rank[i] = 1;	//8������ �ʱ�ȭ�ϴ� �ͺ��� 1������ �ʱ�ȭ�ϴ� ���� �� ȿ������.
			
			for(int j=0; j<scores.length; j++) {
				if(scores[i] < scores[j] )
					rank[i]++;   	
			}
			//System.out.print(scores[i] + "�� => " + rank[i] + "�� ");
		}

		// ��� �޼��� ���
		printRanking(scores, rank);
		
	}

}
