package collection;

// ������ �ܰ迡���� ������ �ȳ��� ���� �ܰ迡�� ClassCast ���� �߻� > ���׸��� �ʿ伺

class Person {
	public Object obj;
	
	Person (Object obj) {this.obj = obj;}
	
}

class Student {
	public int grade;
	
	Student(int grade) {this.grade = grade;}
}

class Teacher {}

public class Generic002 {
	public static void main(String[] args) {
		
		//[1] ��ü ����
		Person p1 = new Person("ȫ�浿");
		System.out.println(p1.obj);
		
		Person p2 = new Person(new Student(2));
		Student s1 = (Student) p2.obj;			//��CAST
		//Teacher t1 = (Teacher) p2.obj;		//��Ÿ�� ���� (String Ÿ���� int Ÿ������ ����ȯ�ϴ� ��)			
		System.out.println(s1);

		Person p3 = new Person("hey");
		
		String str = (String) p3.obj;
		System.out.println(str.length());
	}
}
