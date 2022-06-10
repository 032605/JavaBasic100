package OOP2;

// [1] ������ : �پ��� ���� �Ǵ� Ư���� �����ٴ� �ǹ�.
// �ڹٿ� ���� ��ü ���� ������ �ǹ̴� �θ� Ŭ������ ��ӹ��� �ڽ� Ŭ������ �ν��Ͻ�(��ü)�� �θ��� ��ü�ε� ���ǰ�, �ڽ� Ŭ������ ��ü�ε� ���.

// [2]���� Ŭ������ �ν��Ͻ��� ���� ���� ���� Ŭ������ �ν��Ͻ��ε� ���� �� �ִ�.
// ���� : Student st = new Student(); (O) / Person st = new Student(); (O) / Student st = new Person(); (X) 

class Bird{
	String str1 = "�θ� Ŭ����";
	
	void method1() {System.out.println("�θ� AAA");}
	void bbb() {System.out.println("bird");}
}

class Parrot extends Bird {
	String str2 = "�ڽ� Ŭ����";
	
	void method1() {System.out.println("�������̵� - AAA");}
	void ppp() {System.out.println("parrot");}
	void x() {
		super.method1();
	}
}

public class polymorphism {
	public static void main(String[] args) {
		
		// [1] �θ� + �ڽ� Ŭ������ ��� �ڿ��� �� �� �� �ִ�.
		Parrot pa = new Parrot();
		System.out.println(pa.str1);
		System.out.println(pa.str2);
		pa.method1();	//�������̵� - AAA
		pa.ppp();
		pa.bbb();
		
		// [!] �ڽ� Ŭ�������� �������̵��� �θ� Ŭ������ ���� �޼��带 ȣ���ϰ� �ʹٸ�? super ���.
		pa.x();
		
		System.out.println("=============");
		
		// [2] �θ��� �ڿ��� �� �� �ִ�.
		Bird pa1 = new Parrot(); //���� Ŭ������ ��ü �����ϸ鼭 Ÿ���� ���� Ÿ�� ���� ���� ���� > ������ 
		System.out.println(pa1.str1);	//pa1.str2(Err)
		pa1.bbb();	
		pa1.method1();	//�������̵� - AAA (�������̵��� ���� �ڽ��� �޼���� ȣ���)
		
		// [!] �ڽ��� �޼��带 �ٷ� ȣ���ϰ� �ʹٸ�? CAST �ʿ�
		((Parrot) pa1).ppp();
		
		System.out.println("=============");
		//Parrot pa2 = new Bird(); // ���� Ŭ���� �ν��Ͻ��� ���� Ŭ������ �ν��Ͻ��� ���� �� ����. Err.
		
	}
}
