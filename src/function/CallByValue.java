package function;

public class CallByValue {

	//Call By Value
	//�޼���� ���� ���� �ѱ� �� �ش� ���� �����Ͽ� �ѱ�� ���
	public static void sum(int a) {
		a += 400;
		
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		int a = 100;
		
		sum(a);
		System.out.println(a);

	}
}
