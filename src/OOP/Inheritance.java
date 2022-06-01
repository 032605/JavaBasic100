package OOP;

public class Inheritance{
	
	// 상속 : 부모 클래스가 가직 있는 속성(변수)들과 동작/기능(메소드)들을 그대로 물려받아 새로운 클래스를 만드는 것.
	// Parent Class or Super Class or Base Class(기초/기반) ---- Child Class or Sub Class(서브/하위) or Derived Class(파생) 
	
	// 상속의 장점 : 재활용성
	// 부모 클래스에 정의되어져 있는 멤버 필드(변수)나 메서드들을 그대로 상속받아 사용하면 된다.
	// 상속받은 메서드라 해도 필요에 따라 자식 클래스에서 용도를 변경해서 사용하는 것도 가능.
	
	// 상속의 사용 : 기존 부모 클래스를 확장한다는 개념 > extends 키워드 사용
	// 부모 클래스의 멤버 필드, 메서드는 상속이 가능하나 생성자는 상속이 안됨.
	// 부모 클래스의 접근 제한자가 private이 경우에는 자식 클래스가 상속받았다 하더라도 접근 불가능.
	public static void main(String[] args) {
		//객체 생성
		iceCream ic = new iceCream();
		
		ic.melting();
		
		//상속을 통한 초콜릿 아이스크림 객체 생성
		bestMenu choco = new bestMenu(2000, "chocolate");
		 
		System.out.println(choco.price);
		System.out.println(choco.flavor);
		System.out.println(choco.hit);	//부모 클래스 필드(변수)
		System.out.println(choco.part);	//부모 클래스 필드(변수)
		
		choco.melting();	//메서드 오버라이딩
		choco.pop();
		choco.display();
		
		bestMenu greenTea = new bestMenu(3000, "green tea");
		greenTea.hit = 500;
		greenTea.display();
		greenTea.melting();
	}
}

class iceCream {
	int hit;
	String part;
	
	iceCream() {
		this.hit = 10000;
		this.part = "ice cream";
	}

	void melting() {
		System.out.println("10분이 지나면 녹아요");
	}
}

// iceCream class가 먼저 초기화됨.
class bestMenu extends iceCream {
	int price;
	String flavor;
	
	
	bestMenu(int price, String flavor) {
		// 바로 여기에서 부모 필드의 초기화함! (자식 클래스의 필드를 초기화하기 전에 부모 클래스의 생성자를 호출.)
		// 다음과 같이 명시적으로 써주어도 됨. (생략해도 컴파일러가 부모 클래스 생성자 호출함) 
		super();
		
		this.price = price;
		this.flavor = flavor;
	}
	
	//오버라이드(재정의)
	void melting() {
		System.out.println("8분이 지나면 녹아요");
	}
	
	void pop() {
		System.out.println("BEST MENU");
	}
	
	void display() {
		System.out.println("hit : " + this.hit + " . part : " + this.part);
	}
}
