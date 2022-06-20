package COS;

public class Excercise005_Solution {
	//Field

	//Constructor
	
	//Method
	public void solutionMethod(int n, int[] vote_box) {
		
		//���� ���Ǹ� ���Ͽ� �迭 �ε����� �ĺ� ��ȣ�� ��ġ�����ֱ�
		int[] candidate = new int[n+1];
		
		System.out.println("==(1) �� �ĺ��ڰ� ��ǥ�� ��ǥ ���� ����Ͻÿ�.");
		
		for(int i=0; i<vote_box.length; i++) 
			candidate[vote_box[i]]++; 
		
		for(int j=1; j<candidate.length; j++) {
			System.out.println(j + "�� �ĺ� => " + candidate[j] + "ǥ");
		}
		
		System.out.println("==(2) ���� ���� ��ǥ ���� �׶��� �ĺ��� ��ȣ�� ����Ͻÿ�.");

		int maxVal = candidate[0];
		int winner = 0;
		
		for(int k=1; k<candidate.length; k++) {
			if(maxVal < candidate[k]) {
				maxVal = candidate[k];
				winner = k;
			}
		}
		System.out.println("�ִ� ��ǥ : " + winner + "��("+  maxVal + "ǥ)");
		
		System.out.println("==(3) ���� ���� ��ǥ�� �ĺ����� ��ǥ ���� ���ݼ� �̻��� Ȯ���Ͽ����� üũ�Ͽ� �缱 �Ǵ� �̴缱�� ����Ͻÿ�.");

		boolean majority = maxVal > vote_box.length/(double)2;
		
		if(majority)
			System.out.println("�ִ� ��ǥ ���� " + maxVal + "ǥ �̹Ƿ� ���ݼ� �̻��Դϴ�. " + winner + "�� �ĺ��ڴ� �缱�Դϴ�." );
		else
			System.out.println("�ִ� ��ǥ ���� " + maxVal + "ǥ �̹Ƿ� ���ݼ� �̸��Դϴ�. " + winner + "�� �ĺ��ڴ� �̴缱�Դϴ�." );
		
	}
}
