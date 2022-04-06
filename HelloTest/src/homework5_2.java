import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class homework5_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SecureRandom random = new SecureRandom();
		System.out.print("숫자 6개를 입력하세요 : ");
		
		ArrayList<Integer> input = new ArrayList<>();
		ArrayList<Integer> lotto = new ArrayList<>();
		ArrayList<Integer> correct = new ArrayList<>();
		int count = 0;
		
		for(int i=0; i<6; i++) {
			input.add(sc.nextInt());
			lotto.add(random.nextInt(45)+1);
			//로또 숫자 중복 처리
			for(int j=0; j<i; j++) {
				while(lotto.get(i)==lotto.get(j)) {
					lotto.set(i, random.nextInt(45)+1);
				}
			}
		}

		for(int i=0; i<6; i++){
			for(int j=0; j<6; j++) {
				if(input.get(i)==lotto.get(j)) {
					correct.add(input.get(i));
					count++;
				}
			}
		}
		
		System.out.print("사용자가 입력한 숫자 : ");
		for(int i=0; i<6; i++) {
			System.out.print(input.get(i)+" ");
		}
		System.out.print("\n생성한 로또 숫자 : ");
		for(int i=0; i<6; i++) {
			System.out.print(lotto.get(i)+" ");
		}
		System.out.print("\n일치하는 숫자의 개수 : "+count);
		System.out.print("\n일치하는 숫자 : ");
		for(int i=0; i<count; i++) {
			System.out.print(correct.get(i)+" ");
		}
		
	}

}
