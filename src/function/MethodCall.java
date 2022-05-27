package function;


class testMethod {
	int num;
	testMethod(int num) {
		this.num = num;
	}
}

public class MethodCall {

	public static void sum(testMethod x, testMethod y) {
		 
		x.num = x.num + y.num;
	}
	
	public static void main(String[] args) {
		testMethod a =  new testMethod(1);
		testMethod b =  new testMethod(2);
		
		System.out.println("a´Â " + a.num);
		
		sum(a,b);
		
		System.out.println("a´Â " + a.num + ", b´Â " + b.num);
	}
}
