package collection;

//���׸�(Generic)�� ����� �ʿ伺�� ���ؼ� ���� �ڵ�� �����غ��ÿ�.
//�� ������ �ڹ� ������ ���׸��� ���� ����� �ʿ伺�� ���ؼ� �˰� �ִ����� ���� �����̴�.
//��� Ÿ���� �� �޴� Ŭ������ �����ÿ�.

class Sample {
	//Field
	private Object a;
	
	//Constructor
	Sample(Object x) {
		this.a = x;
	}
	
	//Method
	public Object getA() {
		return a;
	}
	
	void printInfo() {
		System.out.println(a.getClass().getName());	//��ü�� ���ϴ� Ŭ������ ������ ����ϴ� �޼���
	}
}

public class Generic {
	public static void main(String[] args) {

		//[1] ��ü ���� --> ���ڿ�
		Sample s1 = new Sample("�ȳ��ϼ���");
		System.out.println(s1.getA());
		s1.printInfo();
		
		//[2] ��ü ���� --> ����
		Sample s2 = new Sample(100);
		System.out.println(s2.getA());
		s2.printInfo();
		
		//[3] ��ü ���� --> Object
		Sample s3 = new Sample(new Object());	
		System.out.println(s3.getA());			//��ü�� �ּ� �� ���
		s3.printInfo();
		
		//[4] ���� ���� ��� �� ���� => �� ��ȯ �ʿ�
		
		// s1 (���ڿ�) -> length ���� X 
		//String str = s1.getA(); 	//Err 
		String str = (String) s1.getA();
		Object strObj = s1.getA();		//Return �� ��ȯ Ÿ���� Object

		System.out.println(str.length());
		System.out.println(strObj.toString().length());
		
		// s2 (����) -> ���� �Ұ�
		//int num = s2.getA();	//Err
		int num = (int) s2.getA();
		Object intObj = s2.getA();
		
		System.out.println(num + 100);
		//System.out.println(intObj + 110); //Err
	}
}
