package collection;

class GenericSample<T> {
	//Field
	private T obj;
	
	//Constructor
	GenericSample(T x){ this.obj = x; }
	
	//Method
	T getObj() { return obj; };
	
	void printInfo() { System.out.println(obj.getClass().getName()); }
}

public class Generic003 {
	public static void main(String[] args) {
		
		//[1] ��ü ���� ==> String
		GenericSample<String> gs = new GenericSample<String>("Generic Example");
		
		System.out.println(gs.getObj());
		gs.printInfo();
		
		System.out.println("=========================");
		
		GenericSample<Integer> gs2 = new GenericSample<Integer>(200);
		System.out.println(gs2.getObj());
		gs2.printInfo();
		
		//����ȯ ���� ���
		String str = gs.getObj();
		System.out.println(str);
		
		System.out.println(gs2.getObj() + 200);
	}
}
