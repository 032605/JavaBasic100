package OOP;

public class Constructor {
	public static void main(String[] args) {
		Person pl = new Person(20,"홍길동");
		Person pl2 = new Person(40,"박명수");
		
		pl.who();
		pl.move();
		
		pl2.who();
		
		
		
	}
}
		//생성자 (Constructor) : 생성자는 new 키워드로 클래스의 객체(또는 인스턴스)가 생성될 때 제일 먼저 자동적으로 호출되는 특별한 메서드.
		// 객체 초기 값 설정하는 용도로 많이 사용됨.
		// 생성자는 클래스명과 동일하게 만듦.
		// 생성자는 리턴되는 반환 값이 없다. > 객체가 생성될 때 제일 먼저 호출만 된다.
		// 생성자는 오버로딩이 가능하다.
		// 생성자는 default 생성자라는 것이 있다 > 클래스 내 생성자가 없다면 default 생성자가 자동호출 > 클래스명과 동일하고 받는 인자값 X
		
		// 생성자 위치 : 보통 속성과 메서드 사이에 기술.
		// 생성자도 메서드이므로 메서드 그룹에 속하는데 보통 제일 상단에 위치.
		
class Person {
	
	// Attribute
	int age;
	String name;
	
	// Constructor :: 오버로딩이 가능하다. (2개 이상 생성 가능)
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