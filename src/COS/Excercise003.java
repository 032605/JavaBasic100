package COS;	

//COS Pro 2급, 1급에서 자주 나오는 패턴인 중첩 반복문 구조
//continue label이란 무엇인지 설명해보고 관련된 예제를 코드로 구현해보시오.

// 4*4로 짝수만 출력

public class Excercise003 {
	public static void main(String[] args) {
		
		 for(int i=0; i<4; i++) {
			 
			 for(int j=0; j<10; j++) {
				 
				 int output = i*10 + j;
				 
				 if(output%2==0)
					 System.out.print(output + " ");
			 }
			 System.out.println();
		 }
		 
		
	}
}
