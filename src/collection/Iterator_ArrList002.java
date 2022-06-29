package collection;

import java.util.ArrayList;
import java.util.Iterator;

//많이 발생하는 오류 java.util.ConcureentMoificationException
//1) 보통 컬렉션 list 요소를 반복문 안에서 돌리면서 값을 삭제(remove() 메서드 호출)하고자 할 때 발생
//		한 행씩 삭제하는 경우에는 별 문제가 없으나 반복문 안에 순회하면서 삭제 시 주의!
//		반복문 들어가기 전의 기존 list 배열의 size(length)나 index가 변경되면서 순회 중 데이터가 맞지 않아 오류 발생.
//		해결] iterator 사용. 순회하고 it.remove() 메서드로 처리하기.
//2) iterator 객체 생성 순서에 따라서도 발생 등


public class Iterator_ArrList002 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
	
		Iterator<Integer> it = list.iterator();
		
		// 삭제 전
		for(Integer num:list)
			System.out.print(num + " ");
		System.out.println();
		
		// 반복문없이 한 행만 삭제 : 문제X
		///System.out.println(list.get(1));	//2
		//list.remove(1);						//2번 삭제
		//System.out.println(list.get(1));	//3
		
		//while 반복문 사용 (for문 안에서 remove 시 오류)
		System.out.println("=====================");
		
		while(it.hasNext()) {
			Integer i = it.next();
			if(i == 2) {
				it.remove();
				System.out.println(i + "번 삭제");
			}
		}
		System.out.println("=====================");

		for(Integer num:list)
			System.out.print(num + " ");
		System.out.println();
	}
}
 