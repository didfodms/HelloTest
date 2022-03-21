
public class AirConTest {

	public static void main(String[] args) {
		AirCon airCon1 = new AirCon();
		
		airCon1.color = "White";
		airCon1.temp = 10;
		airCon1.price = 10000;
		
		airCon1.tempUp();
		System.out.printf("airCon1의 색상 %s, 현재 기온 : %d, 가격 : %d\n", airCon1.color, airCon1.temp, airCon1.price);
		
		airCon1.tempDown();
		System.out.printf("airCon1의 색상 %s, 현재 기온 : %d, 가격 : %d\n", airCon1.color, airCon1.temp, airCon1.price);
		
		AirCon airCon2 = new AirCon();
		
		airCon2.color = "Black";
		airCon2.temp = 20;
		airCon2.price = 20000;
		
		airCon2.tempUp();
		airCon2.tempUp();
		airCon2.tempUp();
		System.out.printf("airCon2의 색상 %s, 현재 기온 : %d, 가격 : %d\n", airCon2.color, airCon2.temp, airCon2.price);
		
	}

}
