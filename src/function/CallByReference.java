package function;

public class CallByReference {
	int value;

	//Call by Reference
	//Wrapper 클래스의 Integer 클래스 타입으로 변수 a를 선언하고 new 객체를 생성하여 해당 주소 값을 메서드로 보낸다. >> 기능적으로만 정답, 사용자 함수 생성해서 해야함
	//Integer a = new Integer(100);

	CallByReference(int value) {
		this.value = value;
	}

	public static void plus(CallByReference x) {
		x.value += 30;
		
		System.out.println(x.value);	//40
	}

	public static void main(String[] args) {

		CallByReference a = new CallByReference(20);
	
		System.out.println("plus() 호출 전 : a = " + a.value);
	
		plus(a);
	
		System.out.println(a);	//주소 값
		System.out.println("plus() 호출 후 : a = " + a.value);

	}
}
