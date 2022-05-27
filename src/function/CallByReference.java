package function;

public class CallByReference {
	int value;

	//Call by Reference
	//Wrapper Ŭ������ Integer Ŭ���� Ÿ������ ���� a�� �����ϰ� new ��ü�� �����Ͽ� �ش� �ּ� ���� �޼���� ������. >> ��������θ� ����, ����� �Լ� �����ؼ� �ؾ���
	//Integer a = new Integer(100);

	CallByReference(int value) {
		this.value = value;
	}

	public static void plus(CallByReference x) {
		x.value += 30;
		
		System.out.println(x.value);	//40
	}

	public static void main(String[] args) {

		CallByReference a = new CallByReference(20);
	
		System.out.println("plus() ȣ�� �� : a = " + a.value);
	
		plus(a);
	
		System.out.println(a);	//�ּ� ��
		System.out.println("plus() ȣ�� �� : a = " + a.value);

	}
}
