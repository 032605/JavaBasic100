package conditionalStatement;

public class Conditional_if {
	public static void main(String[] args) {
		
		int kor=50, eng=00, math=100;
		
		if(math > eng) 
			System.out.println("hi!");
		
		
		if(eng > 90) {
			System.out.println("A �����Դϴ�.");
			System.out.println("�����ؿ�~");
		} else
			System.out.println("90�� �̸�");
				
		int tot = kor + eng + math;
		
		if (tot>=270) {
			System.out.println("�� �հ�� " + tot + "�Դϴ�. ��");
		} else if (tot>=240) {
			System.out.println("�� �հ�� " + tot + "�Դϴ�. ���");
		} else if (tot>=210) {
			System.out.println("�� �հ�� " + tot + "�Դϴ�. ����");
		} else {
			System.out.printf("���� �� ���� %d. %n", tot);
			
			if(kor >= 90) {
				System.out.printf("�� �հ�� %d������, ���� ������ %d�Դϴ�. ������ �ѱ���", tot, kor);
			} else {
				System.out.printf("����� �� �հ� %d, ���� ���� %d.", tot, kor);
			}
		}
		
	}
}
