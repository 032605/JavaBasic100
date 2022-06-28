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
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Aligator");
		list.add("Hipo");
		list.add("Ostrich");
		list.add("Donkey");
		
		Iterator<String> it = list.iterator();
		
		while ( it.hasNext() ) {
		    String val = it.next();
		    
		    System.out.println(val);
		}   
		
	}
}
