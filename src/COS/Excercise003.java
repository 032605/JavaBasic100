package COS;	

//COS Pro 2��, 1�޿��� ���� ������ ������ ��ø �ݺ��� ����
//continue label�̶� �������� �����غ��� ���õ� ������ �ڵ�� �����غ��ÿ�.

// 4*4�� ¦���� ���

public class Excercise003 {
	public static void main(String[] args) {
		
		 for(int i=0; i<4; i++) {
			 
			 for(int j=0; j<10; j++) {
				 
				 int output = i*10 + j;
				 
				 if(output%2==0)
					 System.out.print(output + " ");
			 }
			 System.out.println();
		 }
		 
		
	}
}
