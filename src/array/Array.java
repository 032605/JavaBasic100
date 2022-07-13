package array;

public class Array {
	public static void main(String[] args) {
		
		//배열 : 동일한 데이터 타입의 값들을 하나의 배열명으로 저장시킬 수 있는 자료구조.
		// 일일이 변순 선언 필요 X, 초기화 값 한번에 세팅 
		// python은 다른 데이터 타입도 배열 선언 가능.
		
		//데이터타입[] 배열명 = new 데이터타입[배열크기];
		//데이터타입 배열명[] = new 데이터타입[배열크기];
		
		//배열 선언 > 배열 크기 지정 > 배열 공간 값은 자동으로 초기화 셋팅(정수형 : 0, 실수형 : 0.0)
		
		//Q. 사원 100명에 대한 실적 저장하는 배열 선언 및 크기 지정
		// 1. 
		int[] record = new int[5];
		double record2[] = new double[100];
		
		// 2.
		double[] record3;
		record3 = new double[100];
		
		int size = record3.length;	//100
		
		System.out.println("reocrd3의 사이즈 " + size);
		record[0] = 1;
		
		System.out.println(record[0]);	//1
		System.out.println(record2[0]);	//0.0
		//System.out.println(record3[100]);	//Err
		
		System.out.println(record3[size-1]);	//0.0
		
		//배열 변수는 참조형 타입 > 해당 메모리 공간을 가리킴 >> 해당 메모리 공간의 주소 값(참조 값)을 가짐.
		//python은 index -1도 있음
		
	}
}
