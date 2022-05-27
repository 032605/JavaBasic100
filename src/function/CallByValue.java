package function;

public class CallByValue {

	//Call By Value
	//메서드로 인자 값을 넘길 때 해당 값을 복사하여 넘기는 방식
	public static void sum(int a) {
		a += 400;
		
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		int a = 100;
		
		sum(a);
		System.out.println(a);

	}
}
