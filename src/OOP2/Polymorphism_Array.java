package OOP2;


class Person2{}
class Batman extends Person{}

class Human {}
class Superman extends Human{}

public class Polymorphism_Array {
	public static void main(String[] args) {
		
		// �迭 : ������ Ÿ���� �����͸� �ϳ��� ��� �����ϴ� �ڷᱸ�� : �������� ���ٸ� �� ��ü���� ���� �ʿ�
		// +) Python�� �ƴ�. �ٸ� Ÿ�Գ��� List ���� ����

		//[1] �迭���� �������� ����� �� ���ٸ� �� ��ü���θ� ����.
		Person2[] persons = new Person2[10]; //Person ����
		persons[0] = new Person2();
		
		Batman[] batmans = new Batman[10];	//Batman ����
		batmans[0] = new Batman();
		
		//[2] �迭���� ������ ��� ����.
		Human[] humans = new Human[10];
		humans[0] = new Human();
		humans[1] = new Superman();		//�θ� Ÿ���� �迭�� �ڽ� Ŭ���� ��ü ���� ����
		
		//[3] �Ű������� ������ : �Լ��� �޼��� ȣ���� ���� ������ �Ķ���͸� ���������.
		//System.out.println() �޼����� ��� � Ÿ��, ��ü�� �Ű������� �޴��� �������� �ش� ��ü�� ���� ��� > �������� Ȱ���ϰ� �ֱ� ����.
		//public void println(Object x)�� �Ǿ� �ֱ� ������ � ��ü Ÿ���� ���޵Ǵ��� ���� ���� ��� (�ֻ��� Ÿ��)
		System.out.println(new Person());	//OOP2.Person@3830f1c0
		System.out.println(new Human());
	}
}
