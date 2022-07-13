package operator;

public class Operator_arithmeticOperators {
	public static void main(String[] args) {
		int a, b, c, d, rst;
		double rst2, rst3, rst4, rst5;
		double avg;
		
		a=60; b=8; c=300; d=400;
		rst = a/b;
		rst2 = a/b;
		rst3 = a/(double)b;		//더 큰 type으로 계산하므로 double type으로 연산됨
		rst4 = 100/3;			//정수로 계산
		rst5 = 100.0/3.0;		// --> (double)100/3과 동일
		avg = 250/3.0;
		
		System.out.println(a + b);						//68
		System.out.println("a + b = " + a + b  );		//608
		System.out.println("a + b = " + (a + b)  );		//68
		System.out.println("a - b = " + (a - b)  );		//72
		System.out.println("a * b = " + (a * b)  );		//720
		
		System.out.println("a / b = " + (a / b)  );		//7
		System.out.println("a / b = " + (double) rst);	//7.0
		System.out.println("a / b = " + rst2);			//7.0 (위랑 똑같음. 리턴받는 변수를 실수형으로 하더라도 int로 연산)
		System.out.println("a / b = " + rst3);			//7.5 
		System.out.println("a / b = " + rst4);			//33.0
		System.out.println("a / b = " + rst5);			//33.333333333333336
		System.out.printf("세 과목의 평균은 %.2f입니다. %n", avg);
		
		System.out.println("a % b = " + (a % b)  );		//4

		// 축약된 형태 
		int e=0, f=100;
		
		e= e + 1;
		e+= 1;
		System.out.println(e);	//2
		
		e-= 1;
		System.out.println(e);	//1
		
		f++;
		System.out.println(f);	//101
		
		f--;
		System.out.println(f);	//101
		
	}
}
