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

	// getter �� setter ����
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

	//moving �޼���
	void moving() {
		System.out.println(this.name + " �̵� ��..");
	}
}

class Monster extends Person2 {
	//Field
	private String num;
	private int skill;		//1 : â, 2 : ����, 3:��
	private double power;

	//Constructor
	Monster(String name, int age, int height, int weight, String num, int skill, int power) {
		//�θ� Ŭ���� ������ ȣ��
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
		System.out.println("�̸� : " + getName());
		System.out.println("���� : " + getAge());
		System.out.println("Ű : " + getHeight());
		System.out.println("������ : " + getWeight());
		System.out.println("�ѹ� : " + getNum());
		System.out.println("��ų : " + getSkillName(getSkill()));
		System.out.println("�Ŀ� : " + getPower());
		System.out.println("==================");
	}
	
	public String getSkillName(int skill) {
		String skillName;
		
		switch (skill) {
			case 1 : 
				skillName = "���ǵ���";
				break;
			case 2 : 
				skillName = "���潺��";
				break;
			case 3 :
				skillName = "����";
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
		// [1] ��ü ����
		Monster zombie = new Monster("����", 15, 182, 50, "20220602", 1, 10);

		// [2] �޼��� ȣ��
		zombie.print();
		zombie.moving();	//�θ� Ŭ���� moving() �޼���

		// [1] ��ü ����
		Monster zamanbo = new Monster("�Ḹ��", 15, 250, 25000, "20220603", 2, 10);

		// [2] �޼��� ȣ��
		zamanbo.print();
		zamanbo.moving();	//�θ� Ŭ���� moving() �޼���
	
	}
}
