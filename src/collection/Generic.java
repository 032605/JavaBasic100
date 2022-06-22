package collection;

//제네릭(Generic)의 개념과 필요성에 대해서 예제 코드로 설명해보시오.
//이 문제는 자바 문법중 제네릭에 대한 개념과 필요성에 대해서 알고 있는지를 묻는 문제이다.
//모든 타입을 다 받는 클래스를 만들어보시오.

class Sample {
	//Field
	private Object a;
	
	//Constructor
	Sample(Object x) {
		this.a = x;
	}
	
	//Method
	public Object getA() {
		return a;
	}
	
	void printInfo() {
		System.out.println(a.getClass().getName());	//객체가 속하는 클래스의 정보를 출력하는 메서드
	}
}

public class Generic {
	public static void main(String[] args) {

		//[1] 객체 생성 --> 문자열
		Sample s1 = new Sample("안녕하세요");
		System.out.println(s1.getA());
		s1.printInfo();
		
		//[2] 객체 생성 --> 숫자
		Sample s2 = new Sample(100);
		System.out.println(s2.getA());
		s2.printInfo();
		
		//[3] 객체 생성 --> Object
		Sample s3 = new Sample(new Object());	
		System.out.println(s3.getA());			//객체의 주소 값 출력
		s3.printInfo();
		
		//[4] 위와 같이 사용 시 단점 => 형 변환 필요
		
		// s1 (문자열) -> length 리턴 X 
		//String str = s1.getA(); 	//Err 
		String str = (String) s1.getA();
		Object strObj = s1.getA();		//Return 시 반환 타입이 Object

		System.out.println(str.length());
		System.out.println(strObj.toString().length());
		
		// s2 (숫자) -> 연산 불가
		//int num = s2.getA();	//Err
		int num = (int) s2.getA();
		Object intObj = s2.getA();
		
		System.out.println(num + 100);
		//System.out.println(intObj + 110); //Err
	}
}
