package collection;

import java.util.ArrayList;

public class ArrayList002 {
	public static void main(String[] args) {
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("�����ҹ�");
		food.add("ī�̸�");
		food.add("����Ƹ�");
		food.add("�������");
		food.add("�ٵ�");
		food.add("�������Ĵ�");
		food.add("����Ǫ��");
		food.add("���");
		food.add("����");
		
		String str = food.get(0);	//����ȯ ���� �ٷ� ��� -> Ÿ�� ������ ��
		
		for(int i=0; i<food.size(); i++) {
			System.out.printf("%d�� �ĺ��� �̸��� %s�Դϴ�.", (i+1), food.get(i));
			System.out.println();
		}
		
		food.set(0, "ĭ�ټҹ�");	//����
		food.remove(4);			//����
		
		System.out.println("================");
		
		for(String list:food) 
			System.out.print(list + " ");
		System.out.println();
		
		food.removeAll(food);	//��� ����
		System.out.println(food.size());	//0
		
	}
}
