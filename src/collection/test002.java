package collection;

public class test002 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();  // StringBuffer ��ü sb ����
		sb.append("<");
		sb.append("&lt;");
		String result = sb.toString();
		System.out.println(result);

	}
}
