package variable;

import java.text.SimpleDateFormat;
import java.util.Date;

import function.Method;

class Counter {
	static int count = 0; //static을 붙여줌으로써 메모리 공유함.
	Counter() {
		this.count++;
		System.out.println(count); //this.count에서 this 제거.
	}
	
	public static int getCount() {
		return count;
	}
}

class Util {
    public static String getCurrentDate(String fmt) {
        SimpleDateFormat today = new SimpleDateFormat(fmt);
        return today.format(new Date());
    }
}

public class Static {
	public static void main(String[] args) {
		
		//카운팅 (활용예시 : 조회수)
		Counter cnt1 = new Counter(); // 1
		Counter cnt2 = new Counter(); // 2
		Counter cnt3 = new Counter(); // 3

		System.out.println(Counter.getCount()); // 스태틱 메서드는 클래스를 이용하여 호출
	
		//Util 클래스 오늘 날짜 구하기
		System.out.println(Util.getCurrentDate("yyyymmdd"));
		
		Method.plus(2, 5);
	}
}
