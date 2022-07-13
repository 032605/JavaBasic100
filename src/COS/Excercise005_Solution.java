package COS;

import java.util.Arrays;

public class Excercise005_Solution {
	//Field

	//Constructor
	
	//Method
	public void solutionMethod(int n, int[] vote_box) {
		
		//개발 편의를 위하여 배열 인덱스와 후보 번호를 일치시켜주기
		int[] candidate = new int[n+1];
		
		System.out.println("==(1) 각 후보자가 득표한 득표 수를 출력하시오.");
		
		for(int i=0; i<vote_box.length; i++) 
			candidate[vote_box[i]]++; 
		
		for(int j=1; j<candidate.length; j++) {
			System.out.println(j + "번 후보 => " + candidate[j] + "표");
		}
		
		System.out.println("==(2) 가장 많은 득표 수와 그때의 후보자 번호를 출력하시오.");

		int maxVal = candidate[0];
		int winner = 0;
		
		for(int k=1; k<candidate.length; k++) {
			if(maxVal < candidate[k]) {
				maxVal = candidate[k];
				winner = k;
			}
		}
		System.out.println("최다 득표 : " + winner + "번("+  maxVal + "표)");
		
		System.out.println("==(3) 가장 많이 득표한 후보자의 득표 수가 과반수 이상을 확보하였는지 체크하여 당선 또는 미당선을 출력하시오.");

		boolean majority = maxVal > vote_box.length/(double)2;
		
		if(majority)
			System.out.println("최다 득표 수는 " + maxVal + "표 이므로 과반수 이상입니다. " + winner + "번 후보자는 당선입니다." );
		else
			System.out.println("최다 득표 수는 " + maxVal + "표 이므로 과반수 미만입니다. " + winner + "번 후보자는 미당선입니다." );
		
		
		//배열에서 가장 큰 값인 최댓값을 반복문 사용없이 찾아보시오
		System.out.println(Arrays.toString(candidate));
		Arrays.sort(candidate);
		System.out.println(Arrays.toString(candidate));
		
		System.out.println("가장 적은 득표 수(최솟값)는 = " + candidate[1]);
		System.out.println("가장 많은 득표 수(최댓값)는 = " + candidate[candidate.length-1]);
		
	}
}
