package collection;

// 컴파일 단계에서는 에러가 안나고 실행 단계에서 ClassCast 오류 발생 > 제네릭의 필요성

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
		
		//[1] 객체 생성
		Person p1 = new Person("홍길동");
		System.out.println(p1.obj);
		
		Person p2 = new Person(new Student(2));
		Student s1 = (Student) p2.obj;			//★CAST
		//Teacher t1 = (Teacher) p2.obj;		//형타입 오류 (String 타입을 int 타입으로 형변환하는 격)			
		System.out.println(s1);

		Person p3 = new Person("hey");
		
		String str = (String) p3.obj;
		System.out.println(str.length());
	}
}
