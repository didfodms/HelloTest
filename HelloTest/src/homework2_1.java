import java.util.Scanner;

public class homework2_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int res = 0;
		while(N-- > 0) {
			if(sc.nextInt()>0)
				res++;
		}
		sc.close();
		
		System.out.println(res);
	}

}
