package conditionalStatement;

public class Conditional_if {
	public static void main(String[] args) {
		
		int kor=50, eng=00, math=100;
		
		if(math > eng) 
			System.out.println("hi!");
		
		
		if(eng > 90) {
			System.out.println("A 학정입니다.");
			System.out.println("축하해요~");
		} else
			System.out.println("90점 미만");
				
		int tot = kor + eng + math;
		
		if (tot>=270) {
			System.out.println("총 합계는 " + tot + "입니다. 굿");
		} else if (tot>=240) {
			System.out.println("총 합계는 " + tot + "입니다. 쏘쏘");
		} else if (tot>=210) {
			System.out.println("총 합계는 " + tot + "입니다. 떼잉");
		} else {
			System.out.printf("댓츠 그 이하 %d. %n", tot);
			
			if(kor >= 90) {
				System.out.printf("총 합계는 %d이지만, 국어 점수는 %d입니다. 진정한 한국인", tot, kor);
			} else {
				System.out.printf("곤란쓰 총 합계 %d, 국어 점수 %d.", tot, kor);
			}
		}
		
	}
}
