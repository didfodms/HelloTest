import java.util.Scanner;

public class homework2_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int bn = sc.nextInt();
		int p = 0;
		int res = 0;
		sc.close();
		
		while(bn > 0) {
			res += (bn%10)*Math.pow(2, p++);
			bn /= 10;
		}
		
		System.out.println(res);

	}

}
