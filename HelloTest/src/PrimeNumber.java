import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PrimeNumber {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		int[] prime = new int[1000001]; //�Ҽ� ����
		int pn = 0; //�Ҽ� ����
		boolean[] check = new boolean[1000001]; //�������� false
		Arrays.fill(check, true);
		for(int i=2; i<=N; i++) {
			if(check[i]) {
				prime[pn++] = i;
				for(int j=i*2; j<=N; j+=i) {
					check[j] = false;
				}
			}
		}
		
		int product = 1;
		for(int i=1; i<=N; i++) {
			if(check[i]==true) {
				product *= i;
			}
		}
		
		System.out.printf("the result is %d%n", product);
	}

}
