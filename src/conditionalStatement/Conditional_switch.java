package conditionalStatement;

import java.util.Scanner;

public class Conditional_switch {
	public static void main(String[] args) {
		
		Integer age;
		Scanner scan = new Scanner(System.in);

		System.out.println("연령대를 입력해주세요");
		age = scan.nextInt();

		if(age > 10 && age < 20 ) {
			age = 10;
		} else if (age > 20 && age < 30) {
			age = 20;
		} else if (age > 30 && age < 40) {
			age = 30;
		} else if (age > 40 && age < 50) {
			age = 40;
		} else if (age > 50 && age < 60) {
			age = 50;
		} else if (age < 10 ) {
			System.out.println("10세 이하입니다. 프로그램을 종료합니다.");
			System.exit(0);
			//return;
		}
		
		//System.out.println(age.getClass().getName());
		
		switch( age ) {
			case 10:
				System.out.println(age + "대 입니다. 참고서 코너는 A구역입니다.");
				break;	//break문을 생략하면 다음의 케이스문의 결과가 매칭되지 않더라도 해당 구문이 실행
				
			case 20:
				System.out.println(age + "대 입니다. 과제 코너는 B구역입니다.");
				break;
				
			case 30:
				System.out.println(age + "대 입니다. 자기 계발 코너는 C구역입니다.");
				break;
				
			case 40:
				System.out.println(age + "대 입니다. 재테크 코너는 D구역입니다.");
				break;
				
			case 50:
				System.out.println(age + "대 입니다. 소설 코너는 E구역입니다.");
				break;
				
			default :	//만약 매칭이 되는 케이스문이 없을때 실행되야 할 코드를 지정
				System.out.println("60대 이상입니다. 카운터 직원에게 문의바랍니다.");
				break;
		}
	}
}
