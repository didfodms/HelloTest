import java.util.Scanner;

public class homework2_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = 1;
		for(int i=2; i<=n; i++) {
			res *= i;
		}
		sc.close();
		
		System.out.println(res);
	}

}
