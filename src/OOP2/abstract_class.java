package OOP2;

abstract class Animal {
	// ��ü���� ������ �ۼ����� �ʰ� �������� Ư¡�� �߻������� ���� --> return ���� ���� �޼���� ����.
	abstract void crying();
}

class Dog extends Animal {
	void crying() {System.out.println("����");}
}

class Cat extends Animal {
	void crying() {System.out.println("�׸��׸�");}
}

class Animal2 {
	void fly() {System.out.println("����.");}
	
}
public class abstract_class {
	public static void main(String[] args) {
		//[1] : �߻� Ŭ������ ��ü���� ������ ���� ������ ��ü�� ������ �� ����.
		//Animal dog = new Animal(); //Err
		
		// �Ϲ� Ŭ���� 
		//Animal2 dragon = new Animal2();
		//dragon.fly();
		
		//[2] : �߻� Ŭ������ ��� : ��� �޾� ���
		// �߻�(�θ�) Ŭ������ ��ӹ��� �ڽ� Ŭ�������� �ش� �޼��带 �������̵��Ͽ� �������� �� ���.
		Cat cat = new Cat();
		cat.crying();
		
	}
}
