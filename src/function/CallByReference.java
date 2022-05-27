package function;

public class CallByReference {

	//Call by Reference
	//Wrapper 클래스의 Integer 클래스 타입으로 변수 a를 선언하고 new 객체를 생성하여 해당 주소 값을 메서드로 보낸다. >> 기능적으로만 정답, 사용자 함수 생성해서 해야함
	//Integer a = new Integer(100);
	
	int value;

	CallByReference(int value) {
		this.value = value;
	}

	public static void plus(CallByReference x) {
		//x 값 출력 > 주소 값
		
		x.value += 30;
		
		System.out.println("plus() : " + x.value);	//50
	}

	public static void main(String[] args) {

		//객체 변수 선언★
		CallByReference a = new CallByReference(20);
	
		System.out.println("plus() 호출 전 : a = " + a.value);	//20
	
		plus(a);	//주소를 전달
	
		System.out.println("주소 값 " + a);	//주소 값
		System.out.println("plus() 호출 후 : a = " + a.value);	//50

	}
}