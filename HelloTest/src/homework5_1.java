import java.security.SecureRandom;
import java.util.Scanner;

public class homework5_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SecureRandom random = new SecureRandom();
		System.out.print("숫자 6개를 입력하세요 : ");
		int[] input = new int[6];
		int[] lotto = new int[6];
		int count = 0;
		int[] correct = new int[6];
		
		for(int i=0; i<6; i++) {
			input[i] = sc.nextInt();
			lotto[i] = random.nextInt(45) + 1;
		}
		
		for(int i=0; i<6; i++){
			for(int j=0; j<6; j++) {
				if(input[i]==lotto[j]) {
					correct[count++] = input[i];
				}
			}
		}
		
		System.out.print("사용자가 입력한 숫자 : ");
		for(int i=0; i<6; i++) {
			System.out.print(input[i]+" ");
		}
		System.out.print("\n생성한 로또 숫자 : ");
		for(int i=0; i<6; i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.print("\n일치하는 숫자의 개수 : "+count);
		System.out.print("\n일치하는 숫자 : ");
		for(int i=0; i<count; i++) {
			System.out.print(correct[i]+" ");
		}
	}

}
