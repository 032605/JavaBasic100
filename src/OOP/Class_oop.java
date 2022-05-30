package OOP;

class FarmMachine {
	//Attribute
	int price;
	int yr;
	String color;
	
	//Method
	void move() {
		System.out.println("Farm Machine is MOVING");
	}
	
	void dig() {
		System.out.println("Farm Machine is DIGGING");
	}
	
	void grind() {		
		System.out.println("Farm Machine is GRINDING");
	}
}
public class Class_oop {

	//python�� class ��Ʈ�� ������ �ۼ�������, java�� class ������
	
	//[1] Ŭ������? 
	// Ŭ������ ��ü(�Ǵ� �ν��Ͻ�)�� �����ϴ� �ϳ��� ����(=Ʋ, ������, ���ø�, ���� ��)�̴�.
	// �ܹ��� ����(class)���� ���� �ֹ��� ������ �ܹ��Ű� ������� ���� >> �̰� �ٷ� ��ü. 
	
	// [2] Ŭ������ ������� �ϴ� ��ü�� Ư¡�� ������ ����
	
	// [3] 
	// ��ü�� Ư¡ > �Ӽ�(Attribute)
	// ��ü�� ���� > �޼���(Method) --> �Լ��� ���� ����
	// *Python���� �Ϲ������� �Լ���� ǥ���� ������, Ŭ���� �������� �Լ��� �޼����� �θ���. ���� �Լ��� ������.

	// [4] why Ŭ������ �� ��������
	
	// Ŭ���� ��� ��ü�� Ư¡(�Ӽ�)���� ������ ���� ����, ������ �Լ��� ���� ����
	// �׷��� ���α׷� �Ը� Ŀ���� ���� �������� ü�����̰� �о�ȭ �ý������� �����ϰ� Ȯ�� �ʿ伺�� ����
	// �׷� �Ϸ��� �������� OOP(��ü ���� ���α׷���)�� ��������� ����.

	// �ϳ��� ���Ͽ� 2�� �̻��� Ŭ���� �ۼ� ���� (O) 
	// ��� public Ű���带 ���� �� �ִ�. (X) // ��� �� ���� �� ������, �ƹ� Ŭ���� �� �ƹ��ų� ���ϸ��� �� �� ����. (O)
	public static void main(String[] args) {
		
		// ��ü ���� 
		FarmMachine fm = new FarmMachine();
	
		System.out.println(fm);
		
		// ������ ��ü�� �Ӽ� �� �Է�
		fm.price = 1000000;
		fm.yr = 2022;
		fm.color = "green";
	
		// �Ӽ� �� ���
		
		//õ ���� �޸� ���̱�
		String fm_price = String.format("%,d", fm.price);
		//DecimalFormat df = new DecimalFormat("###,###");  �� ����� ����
		
		System.out.println(fm_price + " " + fm.yr  + " " + fm.color);
		
		// call method 
		fm.move();
		fm.dig();
		fm.grind();
		
	}
}
