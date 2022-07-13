package OOP;

class FarmMachine {
	//Attribute
	int price;
	int yr;
	String color;
	
	//Method
	void move() {
		System.out.println("Farm Machine is MOVING");
	}
	
	void dig() {
		System.out.println("Farm Machine is DIGGING");
	}
	
	void grind() {		
		System.out.println("Farm Machine is GRINDING");
	}
}
public class Class_oop {

	//python은 class 파트에 들어가야지 작성하지만, java는 class 무족권
	
	//[1] 클래스란? 
	// 클래스란 객체(또는 인스턴스)를 생성하는 하나의 공장(=틀, 프레임, 템플릿, 판형 등)이다.
	// 햄버거 가게(class)에서 고객이 주문을 넣으면 햄버거가 만들어져 나옴 >> 이게 바로 객체. 
	
	// [2] 클래스는 만들고자 하는 객체의 특징과 동작을 설계
	
	// [3] 
	// 객체의 특징 > 속성(Attribute)
	// 객체의 동작 > 메서드(Method) --> 함수와 거의 동일
	// *Python에는 일반적으로 함수라는 표현을 쓰지만, 클래스 내에서의 함수는 메서드라고 부른다. 거의 함수와 동일함.

	// [4] why 클래스는 왜 나왔을까
	
	// 클래스 없어도 객체의 특징(속성)들을 변수로 정의 가능, 동작은 함수로 정의 가능
	// 그러나 프로그램 규모가 커지고 협업 과정에서 체게적이고 분업화 시스템으로 개발하고 확장 필요성이 있음
	// 그런 일련의 과정에서 OOP(객체 지향 프로그래밍)이 만들어지고 발전.

	// 하나의 파일에 2개 이상의 클래스 작성 가능 (O) 
	// 모두 public 키워드를 붙일 수 있다. (X) // 모두 안 붙일 수 있으며, 아무 클래스 중 아무거나 파일명이 될 수 있음. (O)
	public static void main(String[] args) {
		
		// 객체 생성 
		FarmMachine fm = new FarmMachine();
	
		System.out.println(fm);
		
		// 생성된 객체에 속성 값 입력
		fm.price = 1000000;
		fm.yr = 2022;
		fm.color = "green";
	
		// 속성 값 출력
		
		//천 단위 콤마 붙이기
		String fm_price = String.format("%,d", fm.price);
		//DecimalFormat df = new DecimalFormat("###,###");  이 방법도 있음
		
		System.out.println(fm_price + " " + fm.yr  + " " + fm.color);
		
		// call method 
		fm.move();
		fm.dig();
		fm.grind();
		
	}
}
