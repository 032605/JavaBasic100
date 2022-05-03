package operator;

public class Operator_relationalOpertator {
	public static void main(String[] args) {
		
		int kor=70, eng=40, math=70;
		boolean rst, rst2, rst3, rst4;
		boolean a = false;
		
		rst = kor==eng;
		rst2 = kor!=eng;
		rst3 = kor>eng; 
		
		System.out.println(rst + ", " + rst2 + ", " + rst3);	//false, true, true
		
		//==================== LogicalOperator ====================
		rst4 = kor==eng && kor>eng;	//f && t
				
		System.out.println(rst4);	//false
		System.out.println(!a);		//true
	}
}
