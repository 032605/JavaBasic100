package function;

public class Method {
	
	// 메서드 : 다른 언어에서의 함수와 마찬가지로 어떤 특정한 동작이나 처리를 하도록 만들어진 코드 단위. > 재사용성
	// 결과 반환할 수도/안할 수도, 인자 값 넘길 수도/안 넘길 수도
	
	//1) 반환값 X		받는 인자값 X
	//2) 반환값 X		받는 인자값 O
	//3) 반환값 O		받는 인자값 X
	//4) 반환값 O		받는 인자값 O
	
	
	// ============ 1) 반환값 X		받는 인자값 X
	
	//static > 클래스명.메서드명(); 호출
	public static void showMenu() {
		System.out.println("showMenu() 메서드 호출");
	}
	
	// ============ 2) 반환값 X		받는 인자값 O
	
	public static void plus(int a, int b) {
		
		System.out.println(a + b);
	
	}
	
	// ============ 3) 반환값 O		받는 인자값 X
	
	public static String third() {
		
		return "hit"; 
	
	}
	
	// ============ 4) 반환값 O		받는 인자값 O
	
	public static String convertCapital(String str) {
		
		String rs = str.toUpperCase();
		
		return rs;
	}
	
	public static void main(String[] args) {
	
		// main method에 static 선언 > static method만 호출 가능.
		
		//[1]
		showMenu();
		
		//[2]
		int a = 5;
		int b = 6;
		plus(a,b);
		
		//[3]
		String third = third();
		
		System.out.println(third);
		
		//[4]
		//Scanner sc = new Scanner(System.in);
		
		//System.out.print("소문자를 입력하세요. ===>");
		//String str = sc.next();
		
		//String rs = convertCapital(str);
		String rs = convertCapital("korea");
		System.out.println("입력한 소문자의 대문자는 = " + rs);
	
	}
	
	
}
