package function;

public class Method2 {

	//Call by Value
	//�޼���� ���� ���� �ѱ� �� �ش� ���� �����Ͽ� �ѱ�� ���
	public static void sum(int a) {
		a += 400;
		
		System.out.println(a);
	}
		
	public static void main(String[] args) {
		int a = 100;
		
		//Call by Reference
		//Wrapper Ŭ������ Integer Ŭ���� Ÿ������ ���� a�� �����ϰ� new ��ü�� �����Ͽ� �ش� �ּ� ���� �޼���� ������. >> ��������θ� ����, ����� �Լ� �����ؼ� �ؾ���
		//Integer a = new Integer(100);
		
		sum(a);
		System.out.println(a);
		
	}
}
