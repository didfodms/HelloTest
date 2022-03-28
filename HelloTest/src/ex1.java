import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of values to input : ");
		int t = sc.nextInt();
		int mm = 2147483647;
		while(t-- > 0) {
			System.out.print("Enter a integer : ");
			int n = sc.nextInt();
			mm = mm<n?mm:n;
		}
		sc.close();

		System.out.println("Smallest is "+ mm);
	}

}
