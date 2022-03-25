import java.util.Scanner;

public class homework3_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		//분자
		int a = 0;
		//분모
		int b = 1;
		int temp = 1;
		for(int i=1; i<n; i++) {
			b *= i;
			temp = 1;
			
			for(int j=i; j<n; j++) {
				temp *= j;
			}
			a += temp;
		}
		a++;
		double res = (double)a/(double)b;
		
		System.out.printf("%f", res);
	}

}
