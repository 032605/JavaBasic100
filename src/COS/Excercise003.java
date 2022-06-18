package COS;

//COS Pro 2급, 1급에서 자주 나오는 패턴인 중첩 반복문 구조
//continue label이란 무엇인지 설명해보고 관련된 예제를 코드로 구현해보시오.

// 4*4로 짝수만 출력

public class Excercise003 {
	public static void main(String[] args) {

		outerloop:
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 10; j++) {

				// 출력 값
				int output = i * 10 + j;

				// 짝수만 출력
				if (output % 2 != 0) {
					if (j == 1) {
						// 해당 lable명이 선언된 곳으로 가서 다시 수행
						System.out.println();
						continue outerloop;
					}
					continue;
				} else
					System.out.print(output + " ");
			}
			System.out.println();
		}

	}
}
