package collection;

import java.util.ArrayList;

public class ArrayList002 {
	public static void main(String[] args) {
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("마제소바");
		food.add("카이막");
		food.add("잠봉뵈르");
		food.add("스노우피");
		food.add("텐동");
		food.add("새마을식당");
		food.add("스쿨푸드");
		food.add("헤기");
		food.add("골드바");
		
		String str = food.get(0);	//형변환 없이 바로 사용 -> 타입 안전성 ▲
		
		for(int i=0; i<food.size(); i++) {
			System.out.printf("%d번 후보의 이름은 %s입니다.", (i+1), food.get(i));
			System.out.println();
		}
		
		food.set(0, "칸다소바");	//수정
		food.remove(4);			//삭제
		
		System.out.println("================");
		
		for(String list:food) 
			System.out.print(list + " ");
		System.out.println();
		
		food.removeAll(food);	//모두 삭제
		System.out.println(food.size());	//0
		
	}
}
