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

public class Excercise {
	public static void main(String[] args) {
		
		//Car[] cars = new Car[3];		//��ü �迭 ����
		//cars = new Car[] { new Ambulance(), new Tiller(), new SportsCar() };		//cars �迭 �ʱ�ȭ
		Car[] cars = { new Ambulance(), new Tiller(), new SportsCar() };
		
		//�޼��� ȣ��
		for (int i=0; i<cars.length; i++) {
			cars[i].sound(); 
		}
		
		System.out.println("===============");
		
		//���� for�� ��� 
		//Car type ������:�迭��
		for(Car obj:cars) {
			//System.out.println(obj);
			obj.sound();
		}
	}
}
