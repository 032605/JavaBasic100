package COS;

//�� �б޿��� ���� ���Ÿ� �ϴµ� 3���� �ĺ��ڸ� �ΰ� 7���� �л��� ��ǥ�� �Ͽ���.
//1~3�� ������ �ĺ��ڵ��߿��� ���ݼ� �̻� ��ǥ�� �ϸ� �缱�� �ȴ�.
//��ǥ �ڽ��� �迭�� ����Ʈ�� �����Ǹ� ���⿡�� 1~3�� �� �ĺ����� ��ȣ�� ��ǥ�Ǿ� �ִ�.

//(1) �� �ĺ��ڰ� ��ǥ�� ��ǥ ���� ����Ͻÿ�.
//(2) ���� ���� ��ǥ ���� �׶��� �ĺ��� ��ȣ�� ����Ͻÿ�.
//(3) ���� ���� ��ǥ�� �ĺ����� ��ǥ ���� ���ݼ� �̻��� Ȯ���Ͽ����� üũ�Ͽ� �缱 �Ǵ� �̴缱�� ����Ͻÿ�.


public class Excercise005 {
	public static void main(String[] args) {
		
		int[] vote_box = {1, 1, 3, 3, 2, 2, 3};
		int[] candidate = new int[3];
		
		System.out.println("(1) �� �ĺ��ڰ� ��ǥ�� ��ǥ ���� ����Ͻÿ�.");
		
		for(int i=0; i<candidate.length; i++) {
			
			for(int j=0; j<vote_box.length; j++) {
				if((i+1)==vote_box[j]) {
					candidate[i]++; 
				}
			}
			System.out.println((i+1) + "�� �ĺ� => " + candidate[i] + "ǥ");
			
		}
		
		System.out.println("(2) ���� ���� ��ǥ ���� �׶��� �ĺ��� ��ȣ�� ����Ͻÿ�.");

		int maxVal = candidate[0];
		int winner = 1;
		
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
