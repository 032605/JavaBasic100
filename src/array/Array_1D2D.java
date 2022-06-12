package array;

import java.util.Arrays;

public class Array_1D2D {
	public static void main(String[] args) {
		
		// String 타입의 참조 변수 3개를 저장하기 위한 공간 생성 > 참조형 변수 각 요소는 기본 값 > null 초기화
		// new 공간 생성. 주소 값 리턴. arr가 주소 값 기억
		String[] arr = new String[3];
		
		System.out.println(Arrays.toString(arr));
		
		//2차원 배열
		//동북아시아 : 한국, 중국, 일본 / 동남아시아 : 태국, 베트남, 필리핀 (2*3)
		String[][] asia = { {"한국", "중국", "일본"} , {"태국", "베트남", "필리핀"} };
		
		System.out.println(Arrays.toString(asia[0]));	//[한국, 중국, 일본]
		
		System.out.println(asia[0]);					//[Ljava.lang.String;@5e91993f (1차원 배열의 주소 값)
		System.out.println(asia[0][1]);					//중국
		
		System.out.println(asia.length);				//2
		System.out.println(asia[0].length);				//3 (한국, 중국, 일본)
		
		//전체 출력
		System.out.println(Arrays.deepToString(asia));	//[[한국, 중국, 일본], [태국, 베트남, 필리핀]]
		
		System.out.println("for문");
		
		//for문 (배열 통으로 가져오기)
		/*
		 * for(int i=0; i<asia.length; i++) {
		 *  	System.out.print(Arrays.toString(asia[i])+ ""); //[한국, 중국, 일본][태국, 베트남, 필리핀] 
		 *  }
		 */

		//for문2 (배열 요소 하나씩 가져오기)
		
		for(int i=0; i<asia.length; i++) {
			for(int j= 0; j<asia[i].length; j++) {
				System.out.print(asia[i][j] + " ");		//한국 중국 일본 태국 베트남 필리핀 
			}
		}
		
		System.out.println("");
		
		for(int a=0; a<asia.length; a++) {
			
			String[] forarr = asia[a];	//asia[0] = [한국, 중국, 일본]
			
			for(int b=0; b< forarr.length; b++) {
				System.out.print(forarr[b] + "");	//한국중국일본태국베트남필리핀 
			}
			
		}
		
		System.out.println("");
		
		//charAt() 메서드 사용 > 해당 인덱스에 있는 값을 반환 : 단어를 char 배열에 한글자 씩 저장.
		String[] strAr = {"hong", "kim", "park"};
		
		System.out.println(strAr[0].charAt(2));	//n
		System.out.println(strAr[0].length());  //4(hong)
		
		for (int n=0; n<strAr.length; n++) {
			
			for(int c=0; c<strAr[n].length(); c++) {
				System.out.print(strAr[n].charAt(c));	//hongkimpark
			}
		}
		System.out.println();
		
		//length vs length() : 전자는 배열의 길이를, 후자는 문자열의 길이를 구함.
		int[] aaa = new int[10];
		System.out.println(aaa.length);	//10
		
		String bbb = "High Way";
		System.out.println(bbb.length());	//8
		
	}
}
