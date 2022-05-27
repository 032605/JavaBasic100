package function;

public class CallByReference {

	//Call by Reference
	//Wrapper Ŭ������ Integer Ŭ���� Ÿ������ ���� a�� �����ϰ� new ��ü�� �����Ͽ� �ش� �ּ� ���� �޼���� ������. >> ��������θ� ����, ����� �Լ� �����ؼ� �ؾ���
	//Integer a = new Integer(100);
	
	int value;

	CallByReference(int value) {
		this.value = value;
	}

	public static void plus(CallByReference x) {
		//x �� ��� > �ּ� ��
		
		x.value += 30;
		
		System.out.println("plus() : " + x.value);	//50
	}

	public static void main(String[] args) {

		//��ü ���� �����
		CallByReference a = new CallByReference(20);
	
		System.out.println("plus() ȣ�� �� : a = " + a.value);	//20
	
		plus(a);	//�ּҸ� ����
	
		System.out.println("�ּ� �� " + a);	//�ּ� ��
		System.out.println("plus() ȣ�� �� : a = " + a.value);	//50

	}
}