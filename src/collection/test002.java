package collection;

public class test002 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();  // StringBuffer 객체 sb 생성
		sb.append("<");
		sb.append("&lt;");
		String result = sb.toString();
		System.out.println(result);

	}
}
