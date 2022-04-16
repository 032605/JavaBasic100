package variable;


class Singleton {
	public static Singleton single;
	
    private Singleton() {
    }
    
    public static Singleton getInstance() {
    	
    	//�޼��� ȣ�������ν� �̱��� ���� �ǹ̰� �������Ƿ� null�̸� �̱��� ����
    	if(single == null) {
    		single =  new Singleton(); // ���� Ŭ�����̹Ƿ� ������ ȣ���� �����ϴ�.
    	}
    	
    	return single;

    	//nullüũ ������ �� singleton <> singleton2
    	//return new Singleton();
    }
}

public class SingletonPattern {
    public static void main(String[] args) {
    	
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton == singleton2); //true
        
       }
}