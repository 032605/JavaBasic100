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
	
	public static void main(String[] args) {
	
		// main method�� static ���� > static method�� ȣ�� ����.
		showMenu();
		
		int a = 5;
		int b = 6;
		plus(a,b);
	}
	
	
}
