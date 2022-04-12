import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class homework5_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SecureRandom random = new SecureRandom();
		
		ArrayList<Integer> input = new ArrayList<>();
		ArrayList<Integer> lotto = new ArrayList<>();
		ArrayList<Integer> correct = new ArrayList<>();
		int count = 0;
		
		boolean check;
		do {
			check = false;
			System.out.print("���� 6���� �Է��ϼ��� : ");
			for(int i=0; i<6; i++) {
				input.add(sc.nextInt());
			}
			
			Collections.sort(input);
			
			for(int i=1; i<6; i++) {
				if(input.get(i-1)==input.get(i)) {
					check = true;
					System.out.println("���ڰ� �ߺ��Ǿ����ϴ�. �ߺ����� �ʵ��� �ٽ� �Է��ϼ���.");
					input.clear();
					break;
				}
			}

		} while(check==true);
		
		for(int i=0; i<6; i++) {
			lotto.add(random.nextInt(45)+1);
			//�ζ� ���� �ߺ� ó��
			for(int j=0; j<i; j++) {
				while(lotto.get(i)==lotto.get(j)) {
					lotto.set(i, random.nextInt(45)+1);
				}
			}
		}

		//��ġ�ϴ� ���� ����
		Collections.sort(lotto);
		Collections.sort(correct);
		
		for(int i=0; i<6; i++){
			for(int j=0; j<6; j++) {
				if(input.get(i)==lotto.get(j)) {
					correct.add(input.get(i));
					count++;
				}
			}
		}
		
		System.out.print("����ڰ� �Է��� ���� : ");
		for(int i=0; i<6; i++) {
			System.out.print(input.get(i)+" ");
		}
		System.out.print("\n������ �ζ� ���� : ");
		for(int i=0; i<6; i++) {
			System.out.print(lotto.get(i)+" ");
		}
		System.out.print("\n��ġ�ϴ� ������ ���� : "+count);
		System.out.print("\n��ġ�ϴ� ���� : ");
		for(int i=0; i<count; i++) {
			System.out.print(correct.get(i)+" ");
		}
		
	}

}