package OOP;

public class StringToInt {
	public static void main(String[] args) {
		String a = "1";
		String b = "2";
		
		System.out.println(a + " + " + b + " = " + a+b);	//1 + 2 = 12
		
		// �ڷ��� Ȯ��
		System.out.println(a.getClass().getName());
		
		// parseInt() > Integer Ŭ������ static���� ���� > ��ü�� �������� �ٷ� "Ŭ������.parseInt()�� ���� ��� ����
		System.out.println(a + " + " + b + " = " + (Integer.parseInt(a) + Integer.parseInt(b)));	//1 + 2 = 3
		
		// ���� ����
		System.out.println("======== ���� ���� ========");
		System.out.println(Integer.parseInt("2022"));		//2022
		System.out.println(Integer.parseInt("2022", 10));	//2022
		System.out.println(Integer.parseInt("2022", 8));	//1042
		System.out.println(Integer.parseInt("1", 2));		//1
		System.out.println(Integer.parseInt("1001", 2));	//9
		System.out.println(Integer.parseInt("1004", 8));	//516
		System.out.println(Integer.parseInt("A", 16));		//10
		System.out.println(Integer.parseInt("D", 16));		//13
		System.out.println(Integer.parseInt("FF", 16));		//255 (15*16 + 15*1)
		
		 //16���� 0123456789ABCDEF--
		
		System.out.println("======== ���� ���� ========");
	}
}
