package OOP2;

abstract class Animal {
	// 구체적인 내용은 작성하지 않고 공통적인 특징을 추상적으로 선언 --> return 값도 없이 메서드명만 선언.
	abstract void crying();
}

class Dog extends Animal {
	void crying() {System.out.println("월월");}
}

class Cat extends Animal {
	void crying() {System.out.println("그릉그릉");}
}

class Animal2 {
	void fly() {System.out.println("날다.");}
	
}
public class abstract_class {
	public static void main(String[] args) {
		//[1] : 추상 클래스는 구체적인 내용이 없기 때문에 객체를 생성할 수 없음.
		//Animal dog = new Animal(); //Err
		
		// 일반 클래스 
		//Animal2 dragon = new Animal2();
		//dragon.fly();
		
		//[2] : 추상 클래스의 사용 : 상속 받아 사용
		// 추상(부모) 클래스를 상속받은 자식 클래스에서 해당 메서드를 오버라이딩하여 재정의한 후 사용.
		Cat cat = new Cat();
		cat.crying();
		
	}
}
