package OOP;

//�ݺ����� ����Ͽ� ��ü �迭 ���� �� ���
//��ü�� �ּҸ� �����ϰ� �ִ� ��ü �迭�� �ݺ����� ����Ͽ� ���� �� �ִ���

class Candidate2 {
	//Field
	private String name;
	private int age;
	
	//Constructor
	Candidate2(){}
	
	Candidate2(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//Method
	public String getName() {return name;}
	public void SetName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void SetAge(int age) {this.age = age;}
	
}

public class ObjArray_for {

	public static void main(String[] args) {
		
		// [1] ��ü ����
		Candidate2[] arr;	//Candidate2 Ÿ���� ��ü �迭 ���� arr ����.
		
		arr = new Candidate2[5];
		
		// [2] �ݺ������� Candidate ��ü ����
		for (int i=0; i<arr.length; i++) {
			arr[i] = new Candidate2(i+1 + "�� �ĺ���", i+20);	//i�� ������ �������̶� X

			// [2-1] getter & setter �޼��� ���
			System.out.println(arr[i].getName() + "("+ arr[i].getAge() + ")");

			// [2-2] ���࿡ private �ƴϸ� �迭 �ε��� ����Ͽ� ���. arr[i].name 

			// [2-3] printf() 
			//System.out.printf("%s�� ���̴� %d���Դϴ�. \n", arr[i].getName(), arr[i].getAge());
			
		}
		
	}
}
