package type;

public class Type_value {
	// [1] : �⺻�� Ÿ��(Primitive Data Type) --> ����Ʈ ���� ����, NULL�� �������� ����(����ϰ� ���� �� Wrapper Ŭ���� ���)
	
	// ������ --> byte(1byte), short(2), int(4), long(8)
	// *�Ϲ������� int�� ���� ����?
	// JVM�� �ǿ����� ������ �ǿ����ڸ� 4 Byte������ ������ > byte(1)�� short(2)�� ���� ����� ���� 4Byte�� ��ȯ�Ͽ� ���� �� ���� >> int�� ���� ȿ����
	// ȿ������ CPU ���ຸ�� �޸𸮸� �����Ϸ��� byte, short ���
	
	// �Ǽ��� --> float(4), double(8)

	// ������ --> char(2byte) --> ���� �Ѱ� --> �����, ���ڿ��� �ٷ�� Ÿ���� ����.
	// *Java�� �����ڵ� ���
	
	// �ο���(���� : �� or ����) --> boolean(1byte) --> true, false

	// [2] : ������ Ÿ��(Reference Data Type) --> �� �⺻���� ������ �ʴ� ����������.
	// ��ǥ���� �͵� --> Ŭ����(class), �迭(array), �������̽�(interface), ���ڿ�(String/immutable)
	// ������ ������ Ư¡ --> �����Ͱ� ����� �޸��� �ּ� ���� �����ϴ� �����̴�. 

	// �ڹ��� Primitive Data Type�� ����Ʈ ũ��� ��Ʈ ũ�⸦ ����ϴ� �ڵ带 �����Ͻÿ�.
	// ������ Ÿ�԰� ������ Ÿ�Կ� ���ؼ��� �����Ѵ�.
	// �̶�, �� Ÿ���� �ּ��ִ� �� �ּڰ��� ���� ���Ͽ� ����Ͻÿ�.
	public static void main(String[] args) {
		
		System.out.println("Byte");
		System.out.println("����Ʈ ũ��" + Byte.BYTES + " ��Ʈ ũ��" + Byte.SIZE + " �ּ��ִ� " + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		
		System.out.println("Short");
		System.out.println("����Ʈ ũ��" + Short.BYTES + " ��Ʈ ũ��" + Short.SIZE + " �ּ��ִ� " + Short.MIN_VALUE + "~" + Byte.MAX_VALUE);
		
		System.out.println("int");
		System.out.println("����Ʈ ũ��" + Integer.BYTES + " ��Ʈ ũ��" + Integer.SIZE + " �ּ��ִ� " + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		
		System.out.println("Long");
		System.out.println("����Ʈ ũ��" + Long.BYTES + " ��Ʈ ũ��" + Long.SIZE + " �ּ��ִ� " + Long.MIN_VALUE + "~" + Long.MAX_VALUE);

		//�������� �ּڰ� �� �ּ��ִ�  ��� �� int ����ȯ �ʿ�
		System.out.println("Character");
		System.out.println("����Ʈ ũ��" + Character.BYTES + " ��Ʈ ũ��" + Character.SIZE + " �ּ��ִ� " + (int) Character.MIN_VALUE + "~" + (int) Character.MAX_VALUE);
		
		/*
		 * Byte ����Ʈ ũ��1 ��Ʈ ũ��8 �ּ��ִ� -128~127 
		 * Short ����Ʈ ũ��2 ��Ʈ ũ��16 �ּ��ִ� -32768~127 
		 * int ����Ʈ ũ��4 ��Ʈ ũ��32 �ּ��ִ� -2147483648~2147483647 
		 * Long ����Ʈ ũ��8 ��Ʈ ũ��64 �ּ��ִ� -9223372036854775808~9223372036854775807 
		 * Character ����Ʈ ũ��2 ��Ʈ ũ��16 �ּ��ִ� 0~65535
		 */
		
		
		byte b = 10;
		short s = 32767;		//32768�� �ϸ� Err. (32767�� �ִ�)
		int i = 2100000000;
		long l = 7000000000L;	//���̻� �ٿ��ֱ� l OR L
		float f = 9.8F;			//���̻� �ٿ��ֱ� f OR F
		double d = 3.14;
		char c = 'A';
		boolean bl = false;		//0(X) 1(X) False(X) True(X) true(O)
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(b + " " + s + " " + i + " " + l + " " + f + " " + d + " " + c + " " + bl);
		
		System.out.print("�ȳ��ϼ���");
		System.out.print("����,,");
		
		//printf() > �����ڸ� ��� (%d ����, %f �Ҽ��� ����, %c ����, %s ���ڿ�, %b �ο�, %n �ٹٲ� %o 8���� %x 16����)
		System.out.printf("%d��° ���� %n ���� �ٲ� -- > %.1f %f %n %b", b, f, f, bl); // �Ҽ��� ����
		
		System.out.printf("10�� 8������ %o�̰� 16������ %x�̴�.",b, b);		//12 , a
		System.out.printf("%x %x",15, 9);	//f , 9
	
	}
}
