package variable;

import java.util.Scanner;

//�ڹ� �⺻ �ڵ� �ۼ� ��Ģ
public class HelloWorld {
		public static void main(String[] args) {
			System.out.println( "JAVA ����Ǯ��" );
			
			Scanner boongubbangMachine = new Scanner(System.in);
			System.out.println("��Ḧ �Է��ϼ���");
			String a = (String) boongubbangMachine.next();
			
			System.out.println("�߰��� ��Ḧ �Է��ϼ���. ������ ���� �Է�.");
			String b = (String) boongubbangMachine.next();
			
			if(b.equals("����")) {
				System.out.println("ó�� ���� ���� �ؾ�� ����ϴ�.");
				System.out.println(a + " �ؾ�� �ϼ��Ǿ����ϴ�.");
				
				int price = (int) HelloWorld.payment(b);
				
				System.out.println(price + "���� �ּ���.");
			} else {
				System.out.println(a + b + " �ؾ�� �ϼ��Ǿ����ϴ�.");
				HelloWorld.payment(b);
				
				int price = (int) HelloWorld.payment(a);
				
				System.out.println(price + "���� �ּ���.");
			}
			
		}

		private static int payment(String menu) {
			
			int price = 0;
			
			if (menu.equals("����")) {
				price = 1500;
			} else {
				price = 2500; 
			}
			
			return price;
		}


/*
 * 
 * ���������� Ŭ�������� Ŭ�����̸� {
	���������� static ��ȯŸ�� ���θ޼���(���ڿ� �迭 ������) {
		// ������ �ڵ� �ۼ�
	}
 }
 * 
 * (1) ���������� --> public, private, protected, default(�ƹ��͵� ��þ��� ��)
 * 			   --> Ŭ������ �޼��忡 ������ �� �ִ� ������ ���� --> ����������, ���������� 
 * 			   --> private > protected > public 
 * (2) Ŭ�������� --> class
 * 			   --> ��ü�� �����ϴ� Ʋ, ������, ����, ���ø� 
 * (3) Ŭ�����̸� --> ī�����̽�(�ܾ�� �ܾ� ������ ���� --> �빮��) 
 * (4) �޼����̸� --> �޼����? --> �Լ� --> � Ư���� �����̳� �۾�, ���� ���� �����ϴ� ��.
 *				--> main() �ٸ��� �ۼ��� ��, �⺻ �޼��带 ã�� �� ����. ��� ���� �߻�
 *				--> �ڹ� ����Ǹ� ���� ���� ���� �޼��� ã�Ƽ� ����.
 *				--> ��� �ۼ��� �ҽ����� ������ ����� �� �� ������ �ȵǹǷ� �������� �˷��ִ� �뵵. --> entry point --> main()
 * 			   
 * (5) �Ķ����  --> �޼���(�Լ�) ȣ�� �� �ϳ� �̻��� �Ķ���� ���� �־ ȣ��.
 * 				--> �μ�(�Ķ����)���� ���� ������ �������� �����.
 * 				--> args�� �ϳ��� ��������. ���� ������ ����
 * (6) ���� Ÿ�� --> void
 * (7) static --> static���� ����� �Լ�(�޼���)�� ������ JVM���� �ν��Ͻ� ��ü�� �������� ȣ�� ����.
 * 				--> ��ü �������� �ش� �Լ�(�޼���)�� ȣ���ؼ� ����� �� �ִ�.
 * 				����(static) ������ �޼ҵ� + �̱��� ���� https://wikidocs.net/228
 * 
 * �ڹ� ����, static �޼��带 ã�Ƽ� ���� �޸𸮿� �Ҵ��Ŵ.
 * static �޼��尡 �������� ���, ��ü ������ ������� ��� �޸𸮿� �Ҵ�.
 * �� �߿� main �޼��带 ���� ���� �������� �޼���ν� ȣ��. 
 */


}



