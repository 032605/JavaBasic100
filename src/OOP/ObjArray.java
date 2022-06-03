package OOP;

//��ü�� ���� �������� ��ҷ� ������ ��ü �迭 �ڵ带 �����Ͻÿ�.
//�⺻�� Ÿ���� �ƴ� ������ Ÿ���� ��ü�� ������ ��ü �迭�� ������ �� �ִ��� ���� ����.

class Candidate {
	//Field
	private String name;
	private int age;
	
	//Constructor
	Candidate(){}
	
	Candidate(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//Method
	public String getName() {return name;}
	public void SetName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void SetAge(int age) {this.age = age;}
	
}

public class ObjArray {
	public static void main(String[] args) {
		
		// [1] ��ü ����
		int[] ar1 = {1,2,3,4,5};
		char[] ar2 = {'A', 'B', 'C', 'D', 'E'};
		
		Candidate[] arr = new Candidate[5];
		
		arr[0] = new Candidate("��ġ�", 24); 
		arr[1] = new Candidate("��ġŲ", 26); 
		arr[2] = new Candidate("������", 28); 
		arr[3] = new Candidate("���ܹ�", 29); 
		arr[4] = new Candidate("������", 20); 
		
		// [2] ���
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i].getName() + "(" + arr[i].getAge() + ")" + "\t");	
		}
		System.out.println();
		
	}
}
