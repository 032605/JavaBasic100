package collection;

import java.util.ArrayList;
import java.util.Arrays;

//2���� �迭
public class ArrayList003 {
	public static void main(String[] args) {
		
		//[1] : ��ü ����
		ArrayList<Integer[]> list = new ArrayList<Integer[]>();
		
		//[2] : ��� �߰�
		list.add(new Integer[]{11,12,13,14});
		list.add(new Integer[]{21,22,23,24});
		list.add(new Integer[]{31,32,33,34});
		
		/*
		 * for(int i=0; i<list.size(); i++) {
		 * System.out.println(Arrays.toString(list.get(i))); }
		 */

		//[3] : ��� ���
		for(int i=0; i<list.size(); i++) {
			// size 	: �÷��� �����ӿ�ũ Ÿ���� ����
			// length() : ���ڿ��� ����
			// length 	: �迭(int[], Integer[], String[])�� ���̸� �˰� ���� ��
			for(int j=0; j<list.get(i).length; j++) {
				System.out.print(list.get(i)[j] + " ");
			}
			System.out.println();
		}

	}
}
