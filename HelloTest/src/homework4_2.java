import java.util.Scanner;

public class homework4_2 {

	static int pow(int a, int b) {
		
		if(b==0) {
			return 1;
		} else {
			return a*pow(a, b-1);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int exponent = sc.nextInt();
		sc.close();

		System.out.println(pow(base, exponent));
	}

}
