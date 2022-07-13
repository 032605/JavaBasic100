package OOP2;

abstract class Animal {
	// 구체적인 내용은 작성하지 않고 공통적인 특징을 추상적으로 선언 --> return 값도 없이 메서드명만 선언.
	// 자식 클래스를 오버라이딩하도록 하는 강제성이 있음.
	abstract void crying();
	void eat() {System.out.println("먹다");}
}

abstract class Dog extends Animal {
}

class Cat extends Animal {
	void crying() {System.out.println("그릉그릉");}
}

class Animal2 {
	void fly() {System.out.println("날다.");}
	
}
public class Abstract_class {
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
		cat.eat();
		
		//Dog dog = new Dog();
		//dog.crying();
		
		//[3] : Summary
		// 추상 클래스는 다른 클래스들의 공통적인 특징을 변수나 메서드로 정의만 해놓는 것 --> 추상메서드
		// abstract를 앞에 붙이고 클래스 안에 추상 메서드를 포함하고 있다는 것을 제외하면 일반 클래스와 별반 차이 X
		// Field, Constructor, Method(추상 메서드 외 일반 클래스)도 포함할 수 있다.
		// 메서드 선언만 있고 구체적인 내용은 없으므로 객체 생성 불가능
		// 따라서, 부모 클래스로서의 역할은 하지만, 구체적인 사용은 자식 클래스에서 재정의(오버라이딩)하여 사용 -> 강제성
		// 추상 클래스에서 선언만 해놈으로써 이후 새로운(자식) 클래스들이 이를 상속받아 구현하므로 새로운 클래스를 작성할 때 하나의 틀이 됨.
		// 추상 메서드를 포함하고 있다면 곧 추상 클래스여야 함.
		
		// 쓰는 이유 : 재정의에 대한 강제성
		// 재정의하고 싶지 않다면?
		// 자식 클래스에서 상속받은 추상 메서드를 구현하지 않다면 자식 클래스도 abstract를 붙여 추상으로 만들어주면 됨.
		
	}
}
