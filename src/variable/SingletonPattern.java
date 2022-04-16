package variable;


class Singleton {
	public static Singleton single;
	
    private Singleton() {
    }
    
    public static Singleton getInstance() {
    	
    	//메서드 호출함으로써 싱글톤 패턴 의미가 없어지므로 null이면 싱글톤 생성
    	if(single == null) {
    		single =  new Singleton(); // 같은 클래스이므로 생성자 호출이 가능하다.
    	}
    	
    	return single;

    	//null체크 안해줄 때 singleton <> singleton2
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