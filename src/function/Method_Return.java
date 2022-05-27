package function;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Method_Return {
	
	//2���� ������ ���� �����ϴ� �޼��� ���� 
	

	public static HashMap hashMapMethod() {
		HashMap map = new HashMap();

		map.put("num1", 100);
		map.put("num2", 200);
		
		//Python�� return num1, num2 ����
		return map;
	}
	
	public static int[] intMethod() {
		int num1 = 100;
		int num2 = 200;
		
		return new int[] {num1, num2};
	}
	
	public static String[] StringMethod(String x, String y) {

		String str1 = x.toUpperCase();
		String str2 = y.toLowerCase();
		
		return new String[] {str1, str2};
	}
	
	public static void main(String[]args) {

		//hashmap���� return
		HashMap rst = hashMapMethod();
		
		System.out.println(rst);				//{num1=100, num2=200}
		System.out.println(rst.get("num1"));	//100
		
		System.out.println("===========int===========");
		
		//�迭 ���� ����
		int intRst[] = intMethod();
		
		for (int i=0; i<intRst.length; i++) {
			System.out.print(intRst[i] + " ");
		}
		
		//System.out.println(Arrays.toString(intRst));
		
		System.out.println("===========String===========");

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�빮�ڷ� �ٲ� ���ڸ� �Է����ּ���. ");
		String toUpper = sc.next();
		
		System.out.print("�ҹ��ڷ� �ٲ� ���ڸ� �Է����ּ���. ");
		String toLower = sc.next();
		
		String strRst[] = StringMethod(toUpper, toLower);
		
		System.out.println(Arrays.toString(strRst));	//[KOREA, usa]

	}
}
