package collection;

import java.util.ArrayList;

//[4] ArrayList
//자바 배열 크리 미리 지정하고 사용했지만 필요시 언제든지 추가 및 삭제 가능
//인터페이스 상속하므로 인덱스가 있고 저장 순서가 유지되고 데이터 중복이 허용됨
//generic 문법을 사용할 수 있음. -> 제네릭 사용하지 않는다면 내부적으로 Object 타입으로 처리됨.

public class ArrayList_generic {
	public static void main(String[] args) {
	
		//[1]제네릭 사용X 
		ArrayList list = new ArrayList();
		
		//데이터 추가 add()
		list.add("피자");
		list.add("김치찌개라면");
		list.add(100);
		list.add(new GenericSample("안녕"));
		
		//데이터 가져오기 get()
		System.out.println(list.get(0));	//Object
		
		String str = (String) list.get(0);	//casting
		System.out.println(str.length());
		
		//System.out.println(list.get(2) + 1);	//Err
		int num = (int) list.get(2);
		System.out.println(num + 100);	//200
		
		System.out.println("================");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
}
