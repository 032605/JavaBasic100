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
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Aligator");
		list.add("Hipo");
		list.add("Ostrich");
		list.add("Donkey");
		
		Iterator<String> it = list.iterator();
		
		while ( it.hasNext() ) {
		    String val = it.next();
		    
		    System.out.println(val);
		}   
		
	}
}
