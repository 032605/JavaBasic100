package type;

public class type_intString {
	public static void main(String[] args) {
		
		//int�� ������ �ڸ��� ���ϱ�
		int num = 12345;
		String str = "12345";
		
		int one = 1;
		
		System.out.println("[1] --> " + str.length());
		
		//[2] ������ > ���ڿ� ��ȯ
		String str2 = String.valueOf(num);
		
		System.out.println("[2] --> " + str2.length());

		//[3] ���ڿ� + ������ 
		System.out.println("[3] --> " + (12345 + 1) );		//123456
		System.out.println("[3] --> " + str + 1);			//123451
		
		//[4] ���ڿ� > ������
		
		System.out.println("[4] --> " + (Integer.valueOf(str2) + 1) );
	
		//*valueOf�� parseInt ������ : ��ü�� ��� or �⺻ �ڷ������� ���
		//1) valueOf() �޼���� ���ڿ��� ���� ���������� ��ȯ�� ���� Integer ��ü�� ���� ��ȯ. => new Integer(Integer.parseInt(s)) ���� ����
		//2) parseInt() �޼���� ������� �׻� int ������ ����. ���� ���� ��ü�� �ƴ� �⺻ �ڷ���(Primitive Type)��
		
		int num1 = Integer.valueOf("100");
		System.out.println("valueOf => " + num1);	//100

		int num2 = Integer.parseInt("100");
		System.out.println("parseInt => " + num2);	//100
		
		
	}
}
