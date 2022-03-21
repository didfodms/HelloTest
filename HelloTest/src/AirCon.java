
public class AirCon {

	String company;
	String color;
	int price;
	int size;
	int temp;
	
	void powerOn() {
		System.out.println("Power on!");
	}
	void powerOff() {
		System.out.println("Power off!");
	}
	void tempUp() {
		System.out.println("Temp up!");
		temp++;
	}
	void tempDown() {
		System.out.println("Temp down!");
		temp--;
	}

}
