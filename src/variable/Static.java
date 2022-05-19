package variable;

import java.text.SimpleDateFormat;
import java.util.Date;

import function.Method;

class Counter {
	static int count = 0; //static�� �ٿ������ν� �޸� ������.
	Counter() {
		this.count++;
		System.out.println(count); //this.count���� this ����.
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
		
		//ī���� (Ȱ�뿹�� : ��ȸ��)
		Counter cnt1 = new Counter(); // 1
		Counter cnt2 = new Counter(); // 2
		Counter cnt3 = new Counter(); // 3

		System.out.println(Counter.getCount()); // ����ƽ �޼���� Ŭ������ �̿��Ͽ� ȣ��
	
		//Util Ŭ���� ���� ��¥ ���ϱ�
		System.out.println(Util.getCurrentDate("yyyymmdd"));
		
		Method.plus(2, 5);
	}
}
