package COS;

public class Excercise003_02 {
	public static void main(String[] args) {
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<10; j++) {
				
				int val;
				
				val = i*10 + j;
				
				if(j==0)
					System.out.print(val + " - ");
				
				if(val%2==0)
					System.out.print(val + " ");
					
			}
			System.out.println();
		}
	}
}
