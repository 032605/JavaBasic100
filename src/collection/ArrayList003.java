package collection;

import java.util.ArrayList;
import java.util.Arrays;

//2차원 배열
public class ArrayList003 {
	public static void main(String[] args) {
		
		//[1] : 객체 생성
		ArrayList<Integer[]> list = new ArrayList<Integer[]>();
		
		//[2] : 요소 추가
		list.add(new Integer[]{11,12,13,14});
		list.add(new Integer[]{21,22,23,24});
		list.add(new Integer[]{31,32,33,34});
		
		/*
		 * for(int i=0; i<list.size(); i++) {
		 * System.out.println(Arrays.toString(list.get(i))); }
		 */

		//[3] : 요소 출력
		for(int i=0; i<list.size(); i++) {
			// size 	: 컬렉션 프레임워크 타입의 길이
			// length() : 문자열의 길이
			// length 	: 배열(int[], Integer[], String[])의 길이를 알고 싶을 때
			for(int j=0; j<list.get(i).length; j++) {
				System.out.print(list.get(i)[j] + " ");
			}
			System.out.println();
		}

	}
}
