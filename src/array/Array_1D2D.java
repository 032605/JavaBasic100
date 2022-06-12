package array;

import java.util.Arrays;

public class Array_1D2D {
	public static void main(String[] args) {
		
		// String Ÿ���� ���� ���� 3���� �����ϱ� ���� ���� ���� > ������ ���� �� ��Ҵ� �⺻ �� > null �ʱ�ȭ
		// new ���� ����. �ּ� �� ����. arr�� �ּ� �� ���
		String[] arr = new String[3];
		
		System.out.println(Arrays.toString(arr));
		
		//2���� �迭
		//���Ͼƽþ� : �ѱ�, �߱�, �Ϻ� / �����ƽþ� : �±�, ��Ʈ��, �ʸ��� (2*3)
		String[][] asia = { {"�ѱ�", "�߱�", "�Ϻ�"} , {"�±�", "��Ʈ��", "�ʸ���"} };
		
		System.out.println(Arrays.toString(asia[0]));	//[�ѱ�, �߱�, �Ϻ�]
		
		System.out.println(asia[0]);					//[Ljava.lang.String;@5e91993f (1���� �迭�� �ּ� ��)
		System.out.println(asia[0][1]);					//�߱�
		
		System.out.println(asia.length);				//2
		System.out.println(asia[0].length);				//3 (�ѱ�, �߱�, �Ϻ�)
		
		//��ü ���
		System.out.println(Arrays.deepToString(asia));	//[[�ѱ�, �߱�, �Ϻ�], [�±�, ��Ʈ��, �ʸ���]]
		
		System.out.println("for��");
		
		//for�� (�迭 ������ ��������)
		/*
		 * for(int i=0; i<asia.length; i++) {
		 *  	System.out.print(Arrays.toString(asia[i])+ ""); //[�ѱ�, �߱�, �Ϻ�][�±�, ��Ʈ��, �ʸ���] 
		 *  }
		 */

		//for��2 (�迭 ��� �ϳ��� ��������)
		
		for(int i=0; i<asia.length; i++) {
			for(int j= 0; j<asia[i].length; j++) {
				System.out.print(asia[i][j] + " ");		//�ѱ� �߱� �Ϻ� �±� ��Ʈ�� �ʸ��� 
			}
		}
		
		System.out.println("");
		
		for(int a=0; a<asia.length; a++) {
			
			String[] forarr = asia[a];	//asia[0] = [�ѱ�, �߱�, �Ϻ�]
			
			for(int b=0; b< forarr.length; b++) {
				System.out.print(forarr[b] + "");	//�ѱ��߱��Ϻ��±���Ʈ���ʸ��� 
			}
			
		}
		
		System.out.println("");
		
		//charAt() �޼��� ��� > �ش� �ε����� �ִ� ���� ��ȯ : �ܾ char �迭�� �ѱ��� �� ����.
		String[] strAr = {"hong", "kim", "park"};
		
		System.out.println(strAr[0].charAt(2));	//n
		System.out.println(strAr[0].length());  //4(hong)
		
		for (int n=0; n<strAr.length; n++) {
			
			for(int c=0; c<strAr[n].length(); c++) {
				System.out.print(strAr[n].charAt(c));	//hongkimpark
			}
		}
		System.out.println();
		
		//length vs length() : ���ڴ� �迭�� ���̸�, ���ڴ� ���ڿ��� ���̸� ����.
		int[] aaa = new int[10];
		System.out.println(aaa.length);	//10
		
		String bbb = "High Way";
		System.out.println(bbb.length());	//8
		
	}
}
