
public class homework6_2 {

	public static void main(String[] args) {
		
		Date date = new Date(4, 13, 2022);
		/*
		System.out.print("30�� �� ��¥ : ");
		for(int i=0; i<30; i++) {
			date.nextDay();
		}
		System.out.println(date.toString());
		*/
		System.out.print("365�� �� ��¥ : ");
		for(int i=0; i<365; i++) {
			date.nextDay();
		}
		System.out.println(date.toString());
		
	}

}
