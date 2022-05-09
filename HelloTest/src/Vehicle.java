
abstract class Vehicle {
	abstract void move();
}

class Car extends Vehicle {
	@Override
	void move() {
		System.out.println("차도로 다닌다");
	}
}

class Ship extends Vehicle {
	@Override
	void move() {
		System.out.println("수로로 다닌다");
	}
}

class Plane extends Vehicle {
	@Override
	void move() {
		System.out.println("하늘로 다닌다");
	}
}

class Use {
	void VehicleUse(Vehicle vehicle) {
		vehicle.move();
	}
}