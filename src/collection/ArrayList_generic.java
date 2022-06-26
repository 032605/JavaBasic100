package collection;

import java.util.ArrayList;

//[4] ArrayList
//�ڹ� �迭 ũ�� �̸� �����ϰ� ��������� �ʿ�� �������� �߰� �� ���� ����
//�������̽� ����ϹǷ� �ε����� �ְ� ���� ������ �����ǰ� ������ �ߺ��� ����
//generic ������ ����� �� ����. -> ���׸� ������� �ʴ´ٸ� ���������� Object Ÿ������ ó����.

public class ArrayList_generic {
	public static void main(String[] args) {
	
		//[1]���׸� ���X 
		ArrayList list = new ArrayList();
		
		//������ �߰� add()
		list.add("����");
		list.add("��ġ����");
		list.add(100);
		list.add(new GenericSample("�ȳ�"));
		
		//������ �������� get()
		System.out.println(list.get(0));	//Object
		
		String str = (String) list.get(0);	//casting
		System.out.println(str.length());
		
		//System.out.println(list.get(2) + 1);	//Err
		int num = (int) list.get(2);
		System.out.println(num + 100);	//200
		
		System.out.println("================");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
}
