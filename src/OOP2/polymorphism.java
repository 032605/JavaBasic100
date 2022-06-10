package OOP2;

// [1] 다형성 : 다양한 형태 또는 특성을 가진다는 의미.
// 자바와 같은 객체 지향 언어에서의 의미는 부모 클래스를 상속받은 자식 클래스의 인스턴스(객체)가 부모의 객체로도 사용되고, 자식 클래스의 객체로도 사용.

// [2]하위 클래스의 인스턴스는 보다 위인 상위 클래스의 인스턴스로도 사용될 수 있다.
// 예시 : Student st = new Student(); (O) / Person st = new Student(); (O) / Student st = new Person(); (X) 

class Bird{
	String str1 = "부모 클래스";
	
	void method1() {System.out.println("부모 AAA");}
	void bbb() {System.out.println("bird");}
}

class Parrot extends Bird {
	String str2 = "자식 클래스";
	
	void method1() {System.out.println("오버라이딩 - AAA");}
	void ppp() {System.out.println("parrot");}
	void x() {
		super.method1();
	}
}

public class polymorphism {
	public static void main(String[] args) {
		
		// [1] 부모 + 자식 클래스의 모든 자원을 다 쓸 수 있다.
		Parrot pa = new Parrot();
		System.out.println(pa.str1);
		System.out.println(pa.str2);
		pa.method1();	//오버라이딩 - AAA
		pa.ppp();
		pa.bbb();
		
		// [!] 자식 클래스에서 오버라이딩된 부모 클래스의 원본 메서드를 호출하고 싶다면? super 사용.
		pa.x();
		
		System.out.println("=============");
		
		// [2] 부모의 자원만 쓸 수 있다.
		Bird pa1 = new Parrot(); //하위 클래스로 객체 생성하면서 타입은 상위 타입 쓰는 것이 가능 > 다형성 
		System.out.println(pa1.str1);	//pa1.str2(Err)
		pa1.bbb();	
		pa1.method1();	//오버라이딩 - AAA (오버라이딩한 것은 자식의 메서드로 호출됨)
		
		// [!] 자식의 메서드를 바로 호출하고 싶다면? CAST 필요
		((Parrot) pa1).ppp();
		
		System.out.println("=============");
		//Parrot pa2 = new Bird(); // 상위 클래스 인스턴스는 하위 클래스의 인스턴스로 사용될 수 없음. Err.
		
	}
}
