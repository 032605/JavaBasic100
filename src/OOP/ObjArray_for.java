package OOP;

//반복분을 사용하여 객체 배열 생성 및 출력
//객체의 주소를 저장하고 있는 객체 배열을 반복문을 사용하여 만들 수 있는지

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
		
		// [1] 객체 생성
		Candidate2[] arr;	//Candidate2 타입의 객체 배열 변수 arr 선언.
		
		arr = new Candidate2[5];
		
		// [2] 반복문으로 Candidate 객체 생성
		for (int i=0; i<arr.length; i++) {
			arr[i] = new Candidate2(i+1 + "번 후보자", i+20);	//i만 보내면 정수형이라 X

			// [2-1] getter & setter 메서드 사용
			System.out.println(arr[i].getName() + "("+ arr[i].getAge() + ")");

			// [2-2] 만약에 private 아니면 배열 인덱스 사용하여 출력. arr[i].name 

			// [2-3] printf() 
			//System.out.printf("%s의 나이는 %d살입니다. \n", arr[i].getName(), arr[i].getAge());
			
		}
		
	}
}
