package function;

public class Method {
	
	// �޼��� : �ٸ� ������ �Լ��� ���������� � Ư���� �����̳� ó���� �ϵ��� ������� �ڵ� ����. > ���뼺
	// ��� ��ȯ�� ����/���� ����, ���� �� �ѱ� ����/�� �ѱ� ����
	
	//1) ��ȯ�� X		�޴� ���ڰ� X
	//2) ��ȯ�� X		�޴� ���ڰ� O
	//3) ��ȯ�� O		�޴� ���ڰ� X
	//4) ��ȯ�� O		�޴� ���ڰ� O
	
	
	// ============ 1) ��ȯ�� X		�޴� ���ڰ� X
	
	//static > Ŭ������.�޼����(); ȣ��
	public static void showMenu() {
		System.out.println("showMenu() �޼��� ȣ��");
	}
	
	// ============ 2) ��ȯ�� X		�޴� ���ڰ� O
	
	public static void plus(int a, int b) {
		
		System.out.println(a + b);
	
	}
	
	// ============ 3) ��ȯ�� O		�޴� ���ڰ� X
	
	public static String third() {
		
		return "hit"; 
	
	}
	
	// ============ 4) ��ȯ�� O		�޴� ���ڰ� O
	
	public static String convertCapital(String str) {
		
		String rs = str.toUpperCase();
		
		return rs;
	}
	
	public static void main(String[] args) {
	
		// main method�� static ���� > static method�� ȣ�� ����.
		
		//[1]
		showMenu();
		
		//[2]
		int a = 5;
		int b = 6;
		plus(a,b);
		
		//[3]
		String third = third();
		
		System.out.println(third);
		
		//[4]
		//Scanner sc = new Scanner(System.in);
		
		//System.out.print("�ҹ��ڸ� �Է��ϼ���. ===>");
		//String str = sc.next();
		
		//String rs = convertCapital(str);
		String rs = convertCapital("korea");
		System.out.println("�Է��� �ҹ����� �빮�ڴ� = " + rs);
	
	}
	
	
}
