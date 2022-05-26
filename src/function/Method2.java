package function;

public class Method2 {

	//Call by Value
	//메서드로 인자 값을 넘길 때 해당 값을 복사하여 넘기는 방식
	public static void sum(int a) {
		a += 400;
		
		System.out.println(a);
	}
		
	public static void main(String[] args) {
		int a = 100;
		
		//Call by Reference
		//Wrapper 클래스의 Integer 클래스 타입으로 변수 a를 선언하고 new 객체를 생성하여 해당 주소 값을 메서드로 보낸다. >> 기능적으로만 정답, 사용자 함수 생성해서 해야함
		//Integer a = new Integer(100);
		
		sum(a);
		System.out.println(a);
		
	}
}
