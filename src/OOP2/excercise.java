package OOP2;

// �߻� Ŭ������ ����� ����Ͽ� ������ ���� ����

abstract class Car {
	abstract void sound();
}

class Ambulance extends Car {
	void sound() {
		System.out.println("�߿�߿�");
	}
}

class Tiller extends Car {
	void sound() {
		System.out.println("���ȴ���");
	}
}

class SportsCar extends Car {
	void sound() {
		System.out.println("��");
	}
}

public class excercise {
	public static void main(String[] args) {
		
		//��ü ����
		Car ambulance = new Ambulance();		
		Car tiller = new Tiller();
		Car sportsCar = new SportsCar();
		
		//�޼��� ȣ��
		ambulance.sound();
		tiller.sound();
		sportsCar.sound();
	}
}
