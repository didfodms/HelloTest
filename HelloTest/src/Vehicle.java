
abstract class Vehicle {
	abstract void move();
}

class Car extends Vehicle {
	@Override
	void move() {
		System.out.println("������ �ٴѴ�");
	}
}

class Ship extends Vehicle {
	@Override
	void move() {
		System.out.println("���η� �ٴѴ�");
	}
}

class Plane extends Vehicle {
	@Override
	void move() {
		System.out.println("�ϴ÷� �ٴѴ�");
	}
}

class Use {
	void VehicleUse(Vehicle vehicle) {
		vehicle.move();
	}
}