package COS;

//한 학급에서 반장 선거를 하는데 3명의 후보자를 두고 7명의 학생이 투표를 하였다.
//1~3번 까지의 후보자들중에서 과반수 이상 득표를 하면 당선이 된다.
//투표 박스는 배열의 리스트로 제공되며 여기에는 1~3번 각 후보자의 번호가 기표되어 있다.

//(1) 각 후보자가 득표한 득표 수를 출력하시오.
//(2) 가장 많은 득표 수와 그때의 후보자 번호를 출력하시오.
//(3) 가장 많이 득표한 후보자의 득표 수가 과반수 이상을 확보하였는지 체크하여 당선 또는 미당선을 출력하시오.


public class Excercise005 {
	public static void main(String[] args) {
		
		int[] vote_box = {1, 1, 3, 3, 2, 2, 3};
		int[] candidate = new int[3];
		
		System.out.println("(1) 각 후보자가 득표한 득표 수를 출력하시오.");
		
		for(int i=0; i<candidate.length; i++) {
			
			for(int j=0; j<vote_box.length; j++) {
				if((i+1)==vote_box[j]) {
					candidate[i]++; 
				}
			}
			System.out.println((i+1) + "번 후보 => " + candidate[i] + "표");
			
		}
		
		System.out.println("(2) 가장 많은 득표 수와 그때의 후보자 번호를 출력하시오.");

		int maxVal = candidate[0];
		int winner = 1;
		
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
