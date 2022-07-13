package OOP;

//객체에 대한 참조값을 요소로 가지는 객체 배열 코드를 구현하시오.
//기본형 타입이 아닌 참조형 타입의 객체가 원소인 객체 배열을 구현할 수 있는지 묻는 문제.

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
		
		// [1] 객체 생성
		int[] ar1 = {1,2,3,4,5};
		char[] ar2 = {'A', 'B', 'C', 'D', 'E'};
		
		Candidate[] arr = new Candidate[5];
		
		arr[0] = new Candidate("김치찌개", 24); 
		arr[1] = new Candidate("이치킨", 26); 
		arr[2] = new Candidate("마라탕", 28); 
		arr[3] = new Candidate("고햄벅", 29); 
		arr[4] = new Candidate("안피자", 20); 
		
		// [2] 출력
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i].getName() + "(" + arr[i].getAge() + ")" + "\t");	
		}
		System.out.println();
		
	}
}
