package function;

public class NoneStaticMethod {

		public void noneStatic() {
			System.out.println("none static");
		}
		
		public static void main(String[] args) {
			
			//메인 메서드는 static 메서드만 호출할 수 있음 > 객체 생성 후 메서드 호출
			NoneStaticMethod res = new NoneStaticMethod();
			
			res.noneStatic();
			
		}
}
