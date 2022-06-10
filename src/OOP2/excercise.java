package OOP2;

// 추상 클래스와 상속을 사용하여 다형성 예제 구현

abstract class Car {
	abstract void sound();
}

class Ambulance extends Car {
	void sound() {
		System.out.println("삐용삐용");
	}
}

class Tiller extends Car {
	void sound() {
		System.out.println("덜컹덜컹");
	}
}

class SportsCar extends Car {
	void sound() {
		System.out.println("씽");
	}
}

public class excercise {
	public static void main(String[] args) {
		
		//객체 생성
		Car ambulance = new Ambulance();		
		Car tiller = new Tiller();
		Car sportsCar = new SportsCar();
		
		//메서드 호출
		ambulance.sound();
		tiller.sound();
		sportsCar.sound();
	}
}
