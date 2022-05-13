package array;

import java.util.Arrays;

public class Array2 {
	public static void main(String[] args) {
		//========�迭 ��ҿ� ������ �� �ֱ�
		int[] array = new int[5];
		
		array[0] = 3;
		array[1] = 11;
		array[2] = 22;
		array[3] = 33;
		array[4] = 44;

		System.out.println(array[0]);	//3
		System.out.println(array[1]);	//11
		System.out.println(array[2]);	//22
		System.out.println(array[3]);	//33
		System.out.println(array[4]);	//44
		
		System.out.println(array.length);			//5
		System.out.println(array[array.length-1]);	//44
		
		//========���� �� �ʱ�ȭ
		int[] rows =  {1, 2, 3, 4, 5, 6};
		int[] rows2 = new int[] {7, 8, 9}; //1�� ��ĺ��� ����. 
		
		int[] err;
		//err = {10, 11, 12);				//Err
		
		//new �����ڿ� ���� �޸� �ּ� ���� return
		err = new int[] {10, 11, 12};
		
		System.out.println(rows[1]);	//2
		System.out.println(rows2[1]);	//5
		System.out.println(err[1]);		//8
		
		//========�ݺ��� ���
		System.out.println("�ݺ���");
		for (int i=0; i<rows.length; i++) {
			System.out.print(rows[i] + " ");
		}
		
		//========���� for�� ���
		System.out.println("");
		System.out.println("���� for��");
		for (int rowfor:rows) {
			System.out.print(rowfor + " ");
		}
			
		//========�ݺ��� ������� �ʰ� �迭 �� ��� : Arrays.toString()
		System.out.println("");
		System.out.println(Arrays.toString(rows));	//[1, 2, 3, 4, 5, 6]
	
	}
}
