package function;

public class NoneStaticMethod {

		public void noneStatic() {
			System.out.println("none static");
		}
		
		public static void main(String[] args) {
			
			//���� �޼���� static �޼��常 ȣ���� �� ���� > ��ü ���� �� �޼��� ȣ��
			NoneStaticMethod res = new NoneStaticMethod();
			
			res.noneStatic();
			
		}
}
