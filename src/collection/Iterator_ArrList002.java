package collection;

import java.util.ArrayList;
import java.util.Iterator;

//���� �߻��ϴ� ���� java.util.ConcureentMoificationException
//1) ���� �÷��� list ��Ҹ� �ݺ��� �ȿ��� �����鼭 ���� ����(remove() �޼��� ȣ��)�ϰ��� �� �� �߻�
//		�� �྿ �����ϴ� ��쿡�� �� ������ ������ �ݺ��� �ȿ� ��ȸ�ϸ鼭 ���� �� ����!
//		�ݺ��� ���� ���� ���� list �迭�� size(length)�� index�� ����Ǹ鼭 ��ȸ �� �����Ͱ� ���� �ʾ� ���� �߻�.
//		�ذ�] iterator ���. ��ȸ�ϰ� it.remove() �޼���� ó���ϱ�.
//2) iterator ��ü ���� ������ ���󼭵� �߻� ��


public class Iterator_ArrList002 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
	
		Iterator<Integer> it = list.iterator();
		
		// ���� ��
		for(Integer num:list)
			System.out.print(num + " ");
		System.out.println();
		
		// �ݺ������� �� �ุ ���� : ����X
		///System.out.println(list.get(1));	//2
		//list.remove(1);						//2�� ����
		//System.out.println(list.get(1));	//3
		
		//while �ݺ��� ��� (for�� �ȿ��� remove �� ����)
		System.out.println("=====================");
		
		while(it.hasNext()) {
			Integer i = it.next();
			if(i == 2) {
				it.remove();
				System.out.println(i + "�� ����");
			}
		}
		System.out.println("=====================");

		for(Integer num:list)
			System.out.print(num + " ");
		System.out.println();
	}
}
 