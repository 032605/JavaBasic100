package COS;

//Ȧ��, ¦�� ���ϱ� ������ while �ݺ����� continue�� ����Ͽ� �����غ��ÿ�.
//1~30������ ������ ¦���� ����Ͻÿ�.
//�� ������ while �ݺ����� �� �ȿ��� continue Ű������ ���Ұ� ������ �ƴ��� ���� �����̴�.
//�ڰ��� ���� ���� �̷��� continue Ű���带 ����ϴ� ����� �� �����־� �Ѵ�.

public class Excercise002 {
	public static void main(String[] args) {
		int val = 1;
		
		while(val<=30) {
			
			if(val%2 == 1) {
				val++;
				continue;
			}
			System.out.print(val + " ");
			val++;
		}
	}
}
