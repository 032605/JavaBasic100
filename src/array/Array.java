package array;

public class Array {
	public static void main(String[] args) {
		
		//�迭 : ������ ������ Ÿ���� ������ �ϳ��� �迭������ �����ų �� �ִ� �ڷᱸ��.
		// ������ ���� ���� �ʿ� X, �ʱ�ȭ �� �ѹ��� ���� 
		// python�� �ٸ� ������ Ÿ�Ե� �迭 ���� ����.
		
		//������Ÿ��[] �迭�� = new ������Ÿ��[�迭ũ��];
		//������Ÿ�� �迭��[] = new ������Ÿ��[�迭ũ��];
		
		//�迭 ���� > �迭 ũ�� ���� > �迭 ���� ���� �ڵ����� �ʱ�ȭ ����(������ : 0, �Ǽ��� : 0.0)
		
		//Q. ��� 100�� ���� ���� �����ϴ� �迭 ���� �� ũ�� ����
		// 1. 
		int[] record = new int[5];
		double record2[] = new double[100];
		
		
		// 2.
		double[] record3;
		record3 = new double[100];
		
		int size = record3.length;	//100
		
		System.out.println("reocrd3�� ������ " + size);
		record[0] = 1;
		
		System.out.println(record[0]);	//1
		System.out.println(record2[0]);	//0.0
		//System.out.println(record3[100]);	//Err
		
		System.out.println(record3[size-1]);	//0.0
		
		//�迭 ������ ������ Ÿ�� > �ش� �޸� ������ ����Ŵ >> �ش� �޸� ������ �ּ� ��(���� ��)�� ����.
		//python�� index -1�� ����
		
	}
}
