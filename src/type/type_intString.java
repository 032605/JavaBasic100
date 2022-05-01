package type;

public class type_intString {
	public static void main(String[] args) {
		
		//int형 숫자의 자릿수 구하기
		int num = 12345;
		String str = "12345";
		
		int one = 1;
		
		System.out.println("[1] --> " + str.length());
		
		//[2] 정수형 > 문자열 변환
		String str2 = String.valueOf(num);
		
		System.out.println("[2] --> " + str2.length());

		//[3] 문자열 + 정수형 
		System.out.println("[3] --> " + (12345 + 1) );		//123456
		System.out.println("[3] --> " + str + 1);			//123451
		
		//[4] 문자열 > 정수형
		
		System.out.println("[4] --> " + (Integer.valueOf(str2) + 1) );
	
		//*valueOf와 parseInt 차이점 : 객체로 사용 or 기본 자료형으로 사용
		//1) valueOf() 메서드는 문자열의 값을 정수형으로 변환한 다음 Integer 객체로 만들어서 반환. => new Integer(Integer.parseInt(s)) 값이 리턴
		//2) parseInt() 메서드는 결과값을 항상 int 형으로 리턴. 리턴 값은 객체가 아닌 기본 자료형(Primitive Type)임
		
		int num1 = Integer.valueOf("100");
		System.out.println("valueOf => " + num1);	//100

		int num2 = Integer.parseInt("100");
		System.out.println("parseInt => " + num2);	//100
		
		
	}
}
