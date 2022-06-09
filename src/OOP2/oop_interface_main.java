package OOP2;

//Person Ŭ����(S) / A �������̽�(S) / B �������̽�(S) / Student Ŭ����(C) / Main Ŭ����(���� �޼��尡 ����, ��ü ����)
class Person {

	String name;
	int age;
	int weight;
	
	Person(){}
	
	Person(String name, int age, int weight){
		//�������̽� ������ ����. ���ǻ� getter, setter �Ⱦ�
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	void wash() { System.out.println("�Ĵ�"); }

	void study() { System.out.println("�����ϴ�"); }

	void play() { System.out.println("���"); }

}

interface Allowance {
	// (����) gillog : [Java] Interface (2020.11.27)

	// ����X ��� ����! : public static final (�̰͵� �ٲ���� Ȯ���غ���)
	// �������̽� �� ��� ��� �ʵ�(����)�� public static final�̿��� �� (���� ����, �������� �ڵ����� �ٿ���)
	public static final String aaa = "��� ���";
	int bbb =100;
	
	void in(String name, int price);
	void out(String name, int price);
	
	//JAVA8 �������� Interface���� constant(���), public abstract method(�߻� �޼ҵ�)�� ������ �����߾���. (�������� ���ߴ�)
	//JAVA8���� default method, static method�� ���� ����(default method, static method)
	static void play() { System.out.println("���"); }
}

interface Action {
	void train(String name, int training_pay);
}

class student extends Person implements Allowance, Action{
	String name;
	int age;
	int weight;
	
	student() {}
	student(String name, int age, int weight) {
		super(name, age, weight);
	}

	@Override
	public void in(String name, int price) {
		System.out.println(name + "���Լ� " + price + "���� �޾ҽ��ϴ�.");
	}

	@Override
	public void out(String name, int price) {
		System.out.println(price + "���� �����߽��ϴ�. ���� �뵵 : [" + name + "]");
	}
	
	@Override
	public void train(String name, int training_pay) {
		System.out.println("[�Ա�] " + name + " | "+ training_pay + "��");
	}

}

public class oop_interface_main {
	public static void main(String[] args) {
		// ��ü ����
		student ppl = new student("������", 22, 46);
		
		// Ŭ���� �� �������̽� �޼��� ȣ��
		ppl.wash();
		ppl.study();
		ppl.play();
		ppl.in("�ƺ�", 10000);
		ppl.out("GS25", 1000);
		ppl.train("����", 5000000);
		
		// interface �� static method ȣ��
		Allowance.play();
		
		// ��� �ʵ� ��� (��ü ���� or �������̽� �� ��� �ٷ�)
		System.out.println(ppl.aaa);
		System.out.println(Allowance.bbb);
	}
}


