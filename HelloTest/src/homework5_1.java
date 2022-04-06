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
			System.out.print("���� 6���� �Է��ϼ��� : ");
			for(int i=0; i<6; i++) {
				input[i] = sc.nextInt();
			}
			
			Arrays.sort(input);
			
			for(int i=1; i<6; i++) {
				if(input[i-1]==input[i]) {
					check = true;
					System.out.println("���ڰ� �ߺ��Ǿ����ϴ�. �ߺ����� �ʵ��� �ٽ� �Է��ϼ���.");
					break;
				}
			}

		} while(check==true);
		
		for(int i=0; i<6; i++) {
			lotto[i] = random.nextInt(45) + 1;
			//�ζ� ��ȣ �ߺ� ó��
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
		
		System.out.print("����ڰ� �Է��� ���� : ");
		for(int i=0; i<6; i++) {
			System.out.print(input[i]+" ");
		}
		System.out.print("\n������ �ζ� ���� : ");
		for(int i=0; i<6; i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.print("\n��ġ�ϴ� ������ ���� : "+count);
		System.out.print("\n��ġ�ϴ� ���� : ");
		for(int i=0; i<count; i++) {
			System.out.print(correct[i]+" ");
		}

	}

}
