package OOP;

class Person2 {
	// Field
	private String name;
	private int age;
	private int height;
	private int weight;

	// Constructor
	Person2() {}
	
	Person2(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// Method

	// getter 및 setter 생성
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	//moving 메서드
	void moving() {
		System.out.println(this.name + " 이동 중..");
	}
}

class Monster extends Person2 {
	//Field
	private String num;
	private int skill;		//1 : 창, 2 : 방패, 3:총
	private double power;

	//Constructor
	Monster(String name, int age, int height, int weight, String num, int skill, int power) {
		//부모 클래스 생성자 호출
		super(name, age, height, weight);
		
		this.num = num;
		this.skill = skill;
		this.power = power;;
	}

	// Method
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public int getSkill() {
		return skill;
	}

	public void setSkill(int skill) {
		this.skill = skill;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}
	
	void print() {
		System.out.println("==================");
		System.out.println("이름 : " + getName());
		System.out.println("나이 : " + getAge());
		System.out.println("키 : " + getHeight());
		System.out.println("몸무게 : " + getWeight());
		System.out.println("넘버 : " + getNum());
		System.out.println("스킬 : " + getSkillName(getSkill()));
		System.out.println("파워 : " + getPower());
		System.out.println("==================");
	}
	
	public String getSkillName(int skill) {
		String skillName;
		
		switch (skill) {
			case 1 : 
				skillName = "스피드형";
				break;
			case 2 : 
				skillName = "디펜스형";
				break;
			case 3 :
				skillName = "딜러";
				break;
			default :
				skillName = "--";
				break;
		}
		return skillName;
	}
}

public class Getter_Setter {
	public static void main(String[] args) {
		// [1] 객체 생성
		Monster zombie = new Monster("좀비", 15, 182, 50, "20220602", 1, 10);

		// [2] 메서드 호출
		zombie.print();
		zombie.moving();	//부모 클래스 moving() 메서드

		// [1] 객체 생성
		Monster zamanbo = new Monster("잠만보", 15, 250, 25000, "20220603", 2, 10);

		// [2] 메서드 호출
		zamanbo.print();
		zamanbo.moving();	//부모 클래스 moving() 메서드
	
	}
}
