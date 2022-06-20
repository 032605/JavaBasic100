package COS;

class Solution {
	//Method
	public void solutionMethod(int n, int[] vote_box) {
		
		int[] candidate = new int[n];
		
		System.out.println("(1) �� �ĺ��ڰ� ��ǥ�� ��ǥ ���� ����Ͻÿ�.");
		
		for(int i=0; i<candidate.length; i++) {
				
			for(int j=0; j<vote_box.length; j++) {
				if((i+1)==vote_box[j]) 
					candidate[i]++; 
			}
			System.out.println((i+1) + "�� �ĺ� => " + candidate[i] + "ǥ");
		}
		
		System.out.println("(2) ���� ���� ��ǥ ���� �׶��� �ĺ��� ��ȣ�� ����Ͻÿ�.");

		int maxVal = candidate[0];
		int winner = 0;
		
		for(int k=1; k<candidate.length; k++) {
			if(candidate[k-1] < candidate[k]) {
				maxVal = candidate[k];
				winner = k+1;
			}
		}
		System.out.println("�ִ� ��ǥ : " + winner + "��("+  maxVal + "ǥ)");
		
		System.out.println("(3) ���� ���� ��ǥ�� �ĺ����� ��ǥ ���� ���ݼ� �̻��� Ȯ���Ͽ����� üũ�Ͽ� �缱 �Ǵ� �̴缱�� ����Ͻÿ�.");

		if(maxVal > (vote_box.length/2)) {
			System.out.println("�ִ� ��ǥ ���� " + maxVal + "ǥ �̹Ƿ� ���ݼ� �̻��Դϴ�. " + winner + "�� �ĺ��ڴ� �缱�Դϴ�." );
		} else {
			System.out.println("�ִ� ��ǥ ���� " + maxVal + "ǥ �̹Ƿ� ���ݼ� �̸��Դϴ�. " + winner + "�� �ĺ��ڴ� �̴缱�Դϴ�." );
		}
		
	}
	
}
public class Excercise005 {
	public static void main(String[] args) {

		// [1] ��ü ����
		Solution s1 = new Solution();
		
		//[2] �迭 ����
		int[] vote_box = {2, 3, 2, 2, 2, 2, 2};
		
		//[3] SolutionMethod ȣ��
		//s1.solutionMethod(3, vote_box);
		
		Excercise005_Solution s2 = new Excercise005_Solution();
		s2.solutionMethod(3, vote_box);
	}

}
