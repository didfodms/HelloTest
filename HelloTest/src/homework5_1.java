import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class homework5_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SecureRandom random = new SecureRandom();

		int[] input = new int[6];
		int[] lotto = new int[6];
		int[] correct = new int[6];
		int count = 0;
		
		boolean check;
		do {
			check = false;
			System.out.print("숫자 6개를 입력하세요 : ");
			for(int i=0; i<6; i++) {
				input[i] = sc.nextInt();
			}
			
			Arrays.sort(input);
			
			for(int i=1; i<6; i++) {
				if(input[i-1]==input[i]) {
					check = true;
					System.out.println("숫자가 중복되었습니다. 중복되지 않도록 다시 입력하세요.");
					break;
				}
			}

		} while(check==true);
		
		for(int i=0; i<6; i++) {
			lotto[i] = random.nextInt(45) + 1;
			//로또 번호 중복 처리
			for(int j=0; j<i; j++) {
				while(lotto[j]==lotto[i]) {
					lotto[i] = random.nextInt(45) + 1;
				}
			}
		}
		
		for(int i=0; i<6; i++){
			for(int j=0; j<6; j++) {
				if(input[i]==lotto[j]) {
					correct[count++] = input[i];
				}
			}
		}
		
		Arrays.sort(lotto);
		for(int i=0; i<count; i++) {
			for(int j=1; j<count; j++) {
				if(correct[i] > correct[j]) {
					int temp = correct[i];
					correct[i] = correct[j];
					correct[j] = temp;
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
