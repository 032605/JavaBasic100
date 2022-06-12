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

public class Excercise {
	public static void main(String[] args) {
		
		//Car[] cars = new Car[3];		//객체 배열 선언
		//cars = new Car[] { new Ambulance(), new Tiller(), new SportsCar() };		//cars 배열 초기화
		Car[] cars = { new Ambulance(), new Tiller(), new SportsCar() };
		
		//메서드 호출
		for (int i=0; i<cars.length; i++) {
			cars[i].sound(); 
		}
		
		System.out.println("===============");
		
		//향상된 for문 사용 
		//Car type 변수명:배열명
		for(Car obj:cars) {
			//System.out.println(obj);
			obj.sound();
		}
	}
}
