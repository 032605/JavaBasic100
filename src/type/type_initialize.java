package type;

public class type_initialize {
	public static void main(String[] args) {
		
		int a; int b = 90;
		double c;
		char d;
		String e;
		
		a= 10;
		b = 29;
		c = 10.0;
		d = 'A';	//문자는 ''으로!!
		e = "hello"; 
		
		System.out.println( a );  	
		System.out.println( b );  	
		System.out.println( c );  	
		System.out.println( d );  	
		System.out.println( e );  	

		//==============================================================================
		// 변수 초기화
		
		//int x,y,z = 900;		//z만 초기화되고 x,y는 초기화 안됨.
		int x,y,z; 
		int x2=300, y2=300, z2=400; //Python이랑 다름,, 
		
		x = 900;
		y = 900;
		z = 900;
		
		System.out.println( x + " " + y + " " + z);  	
		System.out.println( x2 + " " + y2 + " " + z2);  	

		//Python : 변수명 = 데이터 
		//Ex) 1. 동일한 값을 여러 변수에 저장 a = b = c = 10
		//2. 다른 값을 여러 변수에 저장. 데이터와 변수의 갯수가 동일해야 함.	name, age = '아무개', 26
		
		String str1, str2, str3;
		str1 = str2 = str3 = "동시 초기화";
		System.out.println( str1 + " " + str2 + " " + str3);  	
		
		//==============================================================================
		// 정수형 변수를 문자형으로 형(Type)변환시켜서 출력 >> ASCII(아스키코드)로 출력
		
		// [1]
		short A1 = 'A';
		System.out.println( A1 ); //65
		
		// [2] short > char
		short Z = 90;
		System.out.println((char)Z);  //Z
		
		// [2-2]
		short B = 66;
		System.out.println((char)B);  //B
				
		// [3] char > short
		char A3 = 'a';
		System.out.println( (short)A3 );  //97
		
	}
}
