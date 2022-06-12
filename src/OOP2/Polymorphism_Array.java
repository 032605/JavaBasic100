package OOP2;


class Person2{}
class Batman extends Person{}

class Human {}
class Superman extends Human{}

public class Polymorphism_Array {
	public static void main(String[] args) {
		
		// 배열 : 동일한 타입의 데이터를 하나로 묶어서 관리하는 자료구조 : 다형성이 없다면 각 객체별로 관리 필요
		// +) Python은 아님. 다른 타입끼리 List 생성 가능

		//[1] 배열에서 다형성을 사용할 수 없다면 각 개체별로만 관리.
		Person2[] persons = new Person2[10]; //Person 전용
		persons[0] = new Person2();
		
		Batman[] batmans = new Batman[10];	//Batman 전용
		batmans[0] = new Batman();
		
		//[2] 배열에서 다형성 사용 가능.
		Human[] humans = new Human[10];
		humans[0] = new Human();
		humans[1] = new Superman();		//부모 타입의 배열에 자식 클래스 객체 생성 가능
		
		//[3] 매개변수의 다형성 : 함수나 메서드 호출할 때는 적절한 파라미터를 보내줘야함.
		//System.out.println() 메서드의 경우 어떤 타입, 객체를 매개변수로 받더라도 에러없이 해당 객체의 값을 출력 > 다형성을 활용하고 있기 때문.
		//public void println(Object x)로 되어 있기 때문에 어떤 객체 타입이 전달되더라도 에러 없이 출력 (최상위 타입)
		System.out.println(new Person());	//OOP2.Person@3830f1c0
		System.out.println(new Human());
	}
}
