package type;

public class Type_value {
	// [1] : 기본형 타입(Primitive Data Type) --> 디폴트 값이 존재, NULL이 존재하지 않음(사용하고 싶을 땐 Wrapper 클래스 사용)
	
	// 정수형 --> byte(1byte), short(2), int(4), long(8)
	// *일반적으로 int를 쓰는 이유?
	// JVM의 피연산자 스택이 피연산자를 4 Byte단위로 저장함 > byte(1)나 short(2)의 값을 계산할 때는 4Byte로 변환하여 연산 후 수행 >> int가 가장 효율적
	// 효율적인 CPU 실행보다 메모리를 절약하려면 byte, short 사용
	
	// 실수형 --> float(4), double(8)

	// 문자형 --> char(2byte) --> 문자 한개 --> 참고로, 문자열을 다루는 타입은 없다.
	// *Java는 유니코드 사용
	
	// 부울형(논리형 : 참 or 거짓) --> boolean(1byte) --> true, false

	// [2] : 참조형 타입(Reference Data Type) --> 위 기본형에 속하지 않는 데이터형들.
	// 대표적인 것들 --> 클래스(class), 배열(array), 인터페이스(interface), 문자열(String/immutable)
	// 참조형 변수의 특징 --> 데이터가 저장된 메모리의 주소 값을 저장하는 변수이다. 

	// 자바의 Primitive Data Type의 바이트 크기와 비트 크기를 출력하는 코드를 구현하시오.
	// 정수형 타입과 문자형 타입에 대해서만 구현한다.
	// 이때, 각 타입의 최소최대 과 최솟값도 같이 구하여 출력하시오.
	public static void main(String[] args) {
		
		System.out.println("Byte");
		System.out.println("바이트 크기" + Byte.BYTES + " 비트 크기" + Byte.SIZE + " 최소최대 " + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		
		System.out.println("Short");
		System.out.println("바이트 크기" + Short.BYTES + " 비트 크기" + Short.SIZE + " 최소최대 " + Short.MIN_VALUE + "~" + Byte.MAX_VALUE);
		
		System.out.println("int");
		System.out.println("바이트 크기" + Integer.BYTES + " 비트 크기" + Integer.SIZE + " 최소최대 " + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		
		System.out.println("Long");
		System.out.println("바이트 크기" + Long.BYTES + " 비트 크기" + Long.SIZE + " 최소최대 " + Long.MIN_VALUE + "~" + Long.MAX_VALUE);

		//문자형은 최솟값 및 최소최대  출력 시 int 형변환 필요
		System.out.println("Character");
		System.out.println("바이트 크기" + Character.BYTES + " 비트 크기" + Character.SIZE + " 최소최대 " + (int) Character.MIN_VALUE + "~" + (int) Character.MAX_VALUE);
		
		/*
		 * Byte 바이트 크기1 비트 크기8 최소최대 -128~127 
		 * Short 바이트 크기2 비트 크기16 최소최대 -32768~127 
		 * int 바이트 크기4 비트 크기32 최소최대 -2147483648~2147483647 
		 * Long 바이트 크기8 비트 크기64 최소최대 -9223372036854775808~9223372036854775807 
		 * Character 바이트 크기2 비트 크기16 최소최대 0~65535
		 */
		
		
		byte b = 10;
		short s = 32767;		//32768로 하면 Err. (32767이 최댓값)
		int i = 2100000000;
		long l = 7000000000L;	//접미사 붙여주기 l OR L
		float f = 9.8F;			//접미사 붙여주기 f OR F
		double d = 3.14;
		char c = 'A';
		boolean bl = false;		//0(X) 1(X) False(X) True(X) true(O)
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(b + " " + s + " " + i + " " + l + " " + f + " " + d + " " + c + " " + bl);
		
		System.out.print("안녕하세요");
		System.out.print("갓생,,");
		
		//printf() > 지시자를 사용 (%d 정수, %f 소수점 형식, %c 문자, %s 문자열, %b 부울, %n 줄바꿈 %o 8진수 %x 16진수)
		System.out.printf("%d번째 하이 %n 형식 바꿈 -- > %.1f %f %n %b", b, f, f, bl); // 소수점 세팅
		
		System.out.printf("10의 8진수는 %o이고 16진수는 %x이다.",b, b);		//12 , a
		System.out.printf("%x %x",15, 9);	//f , 9
	
	}
}
