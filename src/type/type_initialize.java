package type;

public class type_initialize {
	public static void main(String[] args) {
		
		int a; int b = 90;
		double c;
		char d;
		String e;
		
		a= 10;
		b = 29;
		c = 10.0;
		d = 'A';	//���ڴ� ''����!!
		e = "hello"; 
		
		System.out.println( a );  	
		System.out.println( b );  	
		System.out.println( c );  	
		System.out.println( d );  	
		System.out.println( e );  	

		//==============================================================================
		// ���� �ʱ�ȭ
		
		//int x,y,z = 900;		//z�� �ʱ�ȭ�ǰ� x,y�� �ʱ�ȭ �ȵ�.
		int x,y,z; 
		int x2=300, y2=300, z2=400; //Python�̶� �ٸ�,, 
		
		x = 900;
		y = 900;
		z = 900;
		
		System.out.println( x + " " + y + " " + z);  	
		System.out.println( x2 + " " + y2 + " " + z2);  	

		//Python : ������ = ������ 
		//Ex) 1. ������ ���� ���� ������ ���� a = b = c = 10
		//2. �ٸ� ���� ���� ������ ����. �����Ϳ� ������ ������ �����ؾ� ��.	name, age = '�ƹ���', 26
		
		String str1, str2, str3;
		str1 = str2 = str3 = "���� �ʱ�ȭ";
		System.out.println( str1 + " " + str2 + " " + str3);  	
		
		//==============================================================================
		// ������ ������ ���������� ��(Type)��ȯ���Ѽ� ��� >> ASCII(�ƽ�Ű�ڵ�)�� ���
		
		// [1]
		short A1 = 'A';
		System.out.println( A1 ); //65
		
		// [2] short > char
		short Z = 90;
		System.out.println((char)Z);  //Z
		
		// [2-2]
		short B = 66;
		System.out.println((char)B);  //B
				
		// [3] char > short
		char A3 = 'a';
		System.out.println( (short)A3 );  //97
		
	}
}
