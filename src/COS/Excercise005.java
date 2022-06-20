package COS;

class Solution {
	//Method
	public void solutionMethod(int n, int[] vote_box) {
		
		int[] candidate = new int[n];
		
		System.out.println("(1) 각 후보자가 득표한 득표 수를 출력하시오.");
		
		for(int i=0; i<candidate.length; i++) {
				
			for(int j=0; j<vote_box.length; j++) {
				if((i+1)==vote_box[j]) 
					candidate[i]++; 
			}
			System.out.println((i+1) + "번 후보 => " + candidate[i] + "표");
		}
		
		System.out.println("(2) 가장 많은 득표 수와 그때의 후보자 번호를 출력하시오.");

		int maxVal = candidate[0];
		int winner = 0;
		
		for(int k=1; k<candidate.length; k++) {
			if(candidate[k-1] < candidate[k]) {
				maxVal = candidate[k];
				winner = k+1;
			}
		}
		System.out.println("최다 득표 : " + winner + "번("+  maxVal + "표)");
		
		System.out.println("(3) 가장 많이 득표한 후보자의 득표 수가 과반수 이상을 확보하였는지 체크하여 당선 또는 미당선을 출력하시오.");

		if(maxVal > (vote_box.length/2)) {
			System.out.println("최다 득표 수는 " + maxVal + "표 이므로 과반수 이상입니다. " + winner + "번 후보자는 당선입니다." );
		} else {
			System.out.println("최다 득표 수는 " + maxVal + "표 이므로 과반수 미만입니다. " + winner + "번 후보자는 미당선입니다." );
		}
		
	}
	
}
public class Excercise005 {
	public static void main(String[] args) {

		// [1] 객체 생성
		Solution s1 = new Solution();
		
		//[2] 배열 선언
		int[] vote_box = {2, 3, 2, 2, 2, 2, 2};
		
		//[3] SolutionMethod 호출
		//s1.solutionMethod(3, vote_box);
		
		Excercise005_Solution s2 = new Excercise005_Solution();
		s2.solutionMethod(3, vote_box);
	}

}
