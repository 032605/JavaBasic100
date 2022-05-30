package OOP;

public class Constructor {
	public static void main(String[] args) {
		Person pl = new Person(20,"ȫ�浿");
		Person pl2 = new Person(40,"�ڸ��");
		
		pl.who();
		pl.move();
		
		pl2.who();
		
		
		
	}
}
		//������ (Constructor) : �����ڴ� new Ű����� Ŭ������ ��ü(�Ǵ� �ν��Ͻ�)�� ������ �� ���� ���� �ڵ������� ȣ��Ǵ� Ư���� �޼���.
		// ��ü �ʱ� �� �����ϴ� �뵵�� ���� ����.
		// �����ڴ� Ŭ������� �����ϰ� ����.
		// �����ڴ� ���ϵǴ� ��ȯ ���� ����. > ��ü�� ������ �� ���� ���� ȣ�⸸ �ȴ�.
		// �����ڴ� �����ε��� �����ϴ�.
		// �����ڴ� default �����ڶ�� ���� �ִ� > Ŭ���� �� �����ڰ� ���ٸ� default �����ڰ� �ڵ�ȣ�� > Ŭ������� �����ϰ� �޴� ���ڰ� X
		
		// ������ ��ġ : ���� �Ӽ��� �޼��� ���̿� ���.
		// �����ڵ� �޼����̹Ƿ� �޼��� �׷쿡 ���ϴµ� ���� ���� ��ܿ� ��ġ.
		
class Person {
	
	// Attribute
	int age;
	String name;
	
	// Constructor :: �����ε��� �����ϴ�. (2�� �̻� ���� ����)
	Person(){}
	
	Person(int age, String name){
		this.age = age;
		this.name = name;
		//python self
	}
	
	// Method
	void who() {
		System.out.println("age : " + this.age + ", name : "+ this.name);
	}
	void move() {
		System.out.println("Person is moving.");
	}
}