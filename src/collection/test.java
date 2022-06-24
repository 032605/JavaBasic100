package collection;

import java.util.HashMap;
import java.util.Iterator;

public class test {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put("title", "<script>alert('Hello!')</script>");
		map.put("content", "<script>alert('Bye!')</script>");
		
		Iterator<String> keys = map.keySet().iterator();
		while ( keys.hasNext() ) {
		    String key = keys.next();
		    String value = (String) map.get(key);
		    value = value.replaceAll("[<]", "&lt;");
		    value = value.replaceAll("[>]", "&gt;");
		    
		    System.out.println(" key : " + key +" / value : " + value);
		}   
	}
}
