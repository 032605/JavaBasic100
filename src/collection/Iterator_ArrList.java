package collection;

import java.util.ArrayList;
import java.util.Iterator;

// Iterator
// 컬렉션 프레임워크 내에는 다양한 컬렉션들이 있는데 요소(=원소)를 읽어올 때 Iterator 인터페이스로 표준화하고 있다.
// for 반복문을 사용하여 순회할 떄 > index로 각 요소를 순회하나 Iterator를 이용하면 조금 더 편리
// Iterator는 인터페이스 주요 메서드: hasNext(), next(), remove() 메서드 이용 > 반환타입 : boolean, Object(제네릭), void
// hasNext() : 다음 요소가 있는지를 검사하여  true를 리턴
// next()	 : 다음 요소를 리턴 > 다음 위치로 커서가 이동. Iterator에서는 삭제하지 않고 커서만 이동.
// remove()	 : 제거

// * next() 메서드의 경우 배열 값이 없을 때 사용할 때 오류 발생 (주의. hasNext() 메서드 사용 후 호출 )

public class Iterator_ArrList {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();	//new ArrayList<>(); 형 타입 생략가능
		
		list.add("Aligator");
		list.add("Hippo");
		list.add("Ostrich");
		list.add("Donkey");
		
		// 반복자 객체 생성 
		// Collection 인터페이스 > iterator() 메서드 정의하고 있고 이를 상속받는 것이 List, Set 인터페이스이므로 
		// List, Set 인터페이스를 상속받아 구현한 클래스들 객체를 통해서 iterator()메서드를 사용할 수 있음.
		Iterator<String> it = list.iterator();
		
		//System.out.println(it.hasNext());	//true
		//System.out.println(it.next());		//Aligator
		
		System.out.println("===============");
		
		//Hipo만 출력
		/*
		 * while ( it.hasNext() ) { String val = it.next();
		 * 
		 * if("Hipo".equals(val)) System.out.println(val);
		 * 
		 * }
		 */
		
		//Hipo 요소 삭제
		while ( it.hasNext() ) {
		
			String val = it.next();

			if("Hippo".equals(val)) {
				it.remove();
				System.out.println("Hippo 삭제");
			}
		}
		
		System.out.println("===============");
		for(String s:list)
			System.out.println(s);
	}
}
