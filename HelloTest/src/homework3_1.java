import java.util.Scanner;

public class homework3_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int sum = 1;
		for(int i=1; i<=n; i++) {
			if(i%2==1) {
				sum *= i;
			}
		}
		
		System.out.println(sum);
	}

}
