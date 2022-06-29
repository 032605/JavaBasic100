package collection;

import java.util.ArrayList;
import java.util.Iterator;

// Iterator
// �÷��� �����ӿ�ũ ������ �پ��� �÷��ǵ��� �ִµ� ���(=����)�� �о�� �� Iterator �������̽��� ǥ��ȭ�ϰ� �ִ�.
// for �ݺ����� ����Ͽ� ��ȸ�� �� > index�� �� ��Ҹ� ��ȸ�ϳ� Iterator�� �̿��ϸ� ���� �� ��
// Iterator�� �������̽� �ֿ� �޼���: hasNext(), next(), remove() �޼��� �̿� > ��ȯŸ�� : boolean, Object(���׸�), void
// hasNext() : ���� ��Ұ� �ִ����� �˻��Ͽ�  true�� ����
// next()	 : ���� ��Ҹ� ���� > ���� ��ġ�� Ŀ���� �̵�. Iterator������ �������� �ʰ� Ŀ���� �̵�.
// remove()	 : ����

// * next() �޼����� ��� �迭 ���� ���� �� ����� �� ���� �߻� (����. hasNext() �޼��� ��� �� ȣ�� )

public class Iterator_ArrList {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();	//new ArrayList<>(); �� Ÿ�� ��������
		
		list.add("Aligator");
		list.add("Hippo");
		list.add("Ostrich");
		list.add("Donkey");
		
		// �ݺ��� ��ü ���� 
		// Collection �������̽� > iterator() �޼��� �����ϰ� �ְ� �̸� ��ӹ޴� ���� List, Set �������̽��̹Ƿ� 
		// List, Set �������̽��� ��ӹ޾� ������ Ŭ������ ��ü�� ���ؼ� iterator()�޼��带 ����� �� ����.
		Iterator<String> it = list.iterator();
		
		//System.out.println(it.hasNext());	//true
		//System.out.println(it.next());		//Aligator
		
		System.out.println("===============");
		
		//Hipo�� ���
		/*
		 * while ( it.hasNext() ) { String val = it.next();
		 * 
		 * if("Hipo".equals(val)) System.out.println(val);
		 * 
		 * }
		 */
		
		//Hipo ��� ����
		while ( it.hasNext() ) {
		
			String val = it.next();

			if("Hippo".equals(val)) {
				it.remove();
				System.out.println("Hippo ����");
			}
		}
		
		System.out.println("===============");
		for(String s:list)
			System.out.println(s);
	}
}
