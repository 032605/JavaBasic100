package OOP;

public class Inheritance{
	
	// ��� : �θ� Ŭ������ ���� �ִ� �Ӽ�(����)��� ����/���(�޼ҵ�)���� �״�� �����޾� ���ο� Ŭ������ ����� ��.
	// Parent Class or Super Class or Base Class(����/���) ---- Child Class or Sub Class(����/����) or Derived Class(�Ļ�) 
	
	// ����� ���� : ��Ȱ�뼺
	// �θ� Ŭ������ ���ǵǾ��� �ִ� ��� �ʵ�(����)�� �޼������ �״�� ��ӹ޾� ����ϸ� �ȴ�.
	// ��ӹ��� �޼���� �ص� �ʿ信 ���� �ڽ� Ŭ�������� �뵵�� �����ؼ� ����ϴ� �͵� ����.
	
	// ����� ��� : ���� �θ� Ŭ������ Ȯ���Ѵٴ� ���� > extends Ű���� ���
	// �θ� Ŭ������ ��� �ʵ�, �޼���� ����� �����ϳ� �����ڴ� ����� �ȵ�.
	// �θ� Ŭ������ ���� �����ڰ� private�� ��쿡�� �ڽ� Ŭ������ ��ӹ޾Ҵ� �ϴ��� ���� �Ұ���.
	public static void main(String[] args) {
		iceCream ic = new iceCream();
		
		ic.melting();
		
		bestMenu choco = new bestMenu(2000, "chocolate");
		 
		choco.melting();
		System.out.println(choco.price);
		System.out.println(choco.flavor);
		System.out.println(choco.hit);	//�θ� Ŭ���� �ʵ�(����)
		System.out.println(choco.part);	//�θ� Ŭ���� �ʵ�(����)
	}
}

class iceCream {
	int hit;
	String part;
	
	iceCream() {
		this.hit = 10000;
		this.part = "ice cream";
	}

	void melting() {
		System.out.println("10���� ������ ��ƿ�");
	}
}

// iceCream class�� ���� �ʱ�ȭ��.
class bestMenu extends iceCream {
	int price;
	String flavor;
	
	
	bestMenu(int price, String flavor) {
		this.price = price;
		this.flavor = flavor;
	}
	
	//�������̵�(������)
	void melting() {
		System.out.println("8���� ������ ��ƿ�");
	}
	
	void pop() {
		System.out.println("BEST MENU");
	}
	
	void display() {
		System.out.println("flavor : " + this.flavor + " . price : " + this.price);
	}
}
