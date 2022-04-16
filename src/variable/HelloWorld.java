package variable;

import java.util.Scanner;

//자바 기본 코드 작성 규칙
public class HelloWorld {
		public static void main(String[] args) {
			System.out.println( "JAVA 문제풀이" );
			
			Scanner boongubbangMachine = new Scanner(System.in);
			System.out.println("재료를 입력하세요");
			String a = (String) boongubbangMachine.next();
			
			System.out.println("추가할 재료를 입력하세요. 없으면 결제 입력.");
			String b = (String) boongubbangMachine.next();
			
			if(b.equals("결제")) {
				System.out.println("처음 넣은 재료로 붕어빵을 만듭니다.");
				System.out.println(a + " 붕어빵이 완성되었습니다.");
				
				int price = (int) HelloWorld.payment(b);
				
				System.out.println(price + "원을 주세요.");
			} else {
				System.out.println(a + b + " 붕어빵이 완성되었습니다.");
				HelloWorld.payment(b);
				
				int price = (int) HelloWorld.payment(a);
				
				System.out.println(price + "원을 주세요.");
			}
			
		}

		private static int payment(String menu) {
			
			int price = 0;
			
			if (menu.equals("결제")) {
				price = 1500;
			} else {
				price = 2500; 
			}
			
			return price;
		}


/*
 * 
 * 접근제한자 클래스선언 클래스이름 {
	접근제한자 static 반환타입 메인메서드(문자열 배열 변수명) {
		// 구현할 코드 작성
	}
 }
 * 
 * (1) 접근제한자 --> public, private, protected, default(아무것도 명시안할 때)
 * 			   --> 클래스나 메서드에 접근할 수 있는 범위를 지정 --> 접근제한자, 접근제어자 
 * 			   --> private > protected > public 
 * (2) 클래스선언 --> class
 * 			   --> 객체를 생성하는 틀, 프레임, 공장, 템플릿 
 * (3) 클래스이름 --> 카멜케이스(단어와 단어 사이의 구분 --> 대문자) 
 * (4) 메서드이름 --> 메서드란? --> 함수 --> 어떤 특정한 동작이나 작업, 행위 등을 수행하는 것.
 *				--> main() 다르게 작성할 시, 기본 메서드를 찾을 수 없다. 라고 에러 발생
 *				--> 자바 실행되면 제일 먼저 메인 메서드 찾아서 실행.
 *				--> 길게 작성된 소스에서 시작이 어딘지 알 수 없으면 안되므로 시작점을 알려주는 용도. --> entry point --> main()
 * 			   
 * (5) 파라미터  --> 메서드(함수) 호출 시 하나 이상의 파라미터 값을 넣어서 호출.
 * 				--> 인수(파라미터)들의 값을 저장할 변수들을 명시함.
 * 				--> args는 하나의 변수명임. 임의 변수명 가능
 * (6) 리턴 타입 --> void
 * (7) static --> static으로 선언된 함수(메서드)나 변수는 JVM에서 인스턴스 객체의 생성없이 호출 가능.
 * 				--> 객체 생성없이 해당 함수(메서드)를 호출해서 사용할 수 있다.
 * 				정적(static) 변수와 메소드 + 싱글톤 패턴 https://wikidocs.net/228
 * 
 * 자바 실행, static 메서드를 찾아서 먼저 메모리에 할당시킴.
 * static 메서드가 여러개인 경우, 객체 생성과 상관없이 모두 메모리에 할당.
 * 그 중에 main 메서드를 가장 먼저 시작점의 메서드로써 호출. 
 */


}



