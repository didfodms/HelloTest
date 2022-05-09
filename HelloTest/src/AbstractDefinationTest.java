
public class AbstractDefinationTest {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		Ship ship1 = new Ship();
		Plane plane1 = new Plane();
		
		Use vUse = new Use();
		vUse.VehicleUse(car1);
		vUse.VehicleUse(ship1);
		vUse.VehicleUse(plane1);

	}

}
