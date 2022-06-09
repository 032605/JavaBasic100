package OOP2;

//Person 클래스(S) / A 인터페이스(S) / B 인터페이스(S) / Student 클래스(C) / Main 클래스(메인 메서드가 포함, 객체 생성)
class Person {

	String name;
	int age;
	int weight;
	
	Person(){}
	
	Person(String name, int age, int weight){
		//인터페이스 구현에 초점. 편의상 getter, setter 안씀
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	void wash() { System.out.println("씻다"); }

	void study() { System.out.println("공부하다"); }

	void play() { System.out.println("놀다"); }

}

interface Allowance {
	// (참고) gillog : [Java] Interface (2020.11.27)

	// 변수X 상수 지정! : public static final (이것도 바뀐건지 확인해보기)
	// 인터페이스 내 모든 멤버 필드(변수)는 public static final이여야 함 (생략 가능, 컴파일이 자동으로 붙여줌)
	public static final String aaa = "상수 출력";
	int bbb =100;
	
	void in(String name, int price);
	void out(String name, int price);
	
	//JAVA8 이전에는 Interface에서 constant(상수), public abstract method(추상 메소드)만 선언이 가능했었음. (강제성이 강했다)
	//JAVA8부터 default method, static method도 선언 가능(default method, static method)
	static void play() { System.out.println("놀다"); }
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
		System.out.println(name + "에게서 " + price + "원을 받았습니다.");
	}

	@Override
	public void out(String name, int price) {
		System.out.println(price + "원을 지출했습니다. 지출 용도 : [" + name + "]");
	}
	
	@Override
	public void train(String name, int training_pay) {
		System.out.println("[입금] " + name + " | "+ training_pay + "원");
	}

}

public class oop_interface_main {
	public static void main(String[] args) {
		// 객체 생성
		student ppl = new student("김피자", 22, 46);
		
		// 클래스 및 인터페이스 메서드 호출
		ppl.wash();
		ppl.study();
		ppl.play();
		ppl.in("아빠", 10000);
		ppl.out("GS25", 1000);
		ppl.train("월급", 5000000);
		
		// interface 내 static method 호출
		Allowance.play();
		
		// 상수 필드 사용 (객체 생성 or 인터페이스 내 상수 바로)
		System.out.println(ppl.aaa);
		System.out.println(Allowance.bbb);
	}
}


