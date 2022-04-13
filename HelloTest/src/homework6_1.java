import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;

public class homework6_1 {

	public static void main(String[] args) {
		
		SecureRandom random = new SecureRandom();
		ArrayList<Integer> input = new ArrayList<>();
		ArrayList<Integer> lotto = new ArrayList<>();
		ArrayList<Integer> correct = new ArrayList<>();
		//로또 숫자 개수
		int n = Integer.parseInt(args[0]);
		//사용자 입력 받기 
		for(int i=1; i<=n; i++) {
			int inputNumber = Integer.parseInt(args[i]);
			//중복 확인 
			if(input.isEmpty()) {
				input.add(inputNumber);
			}
			else if(!input.contains(inputNumber)) {
				input.add(inputNumber);
			}
			else {
				System.out.println("중복된 번호가 포함되었습니다. 다시 입력해주세요.");
				System.exit(-1);
			}
		}
		//첫째줄 출력
		System.out.printf("로또 숫자 갯수와 숫자를 입력하세요 : %d ", n);
		for(int i=1; i<=n; i++) {
			System.out.print(args[i]+" ");
		}
		//중복되지 않는 로또 번호 저장 
		do {
			int lottoNumber = random.nextInt(45)+1;
			if(!lotto.contains(lottoNumber)) {
				lotto.add(lottoNumber);
			}
		}
		while(lotto.size()!=n);
		//일치하는 번호
		int count = 0;
		//중
		for(int i=0; i<n; i++) {
			int buffer = lotto.get(i);
			
			if(input.contains(buffer)) {
				correct.add(buffer);
				count++;
			}
		}
		
		Collections.sort(input);
		Collections.sort(lotto);
		Collections.sort(correct);
		
		System.out.print("\n사용자가 입력한 숫자 : ");
		for(int i=0; i<input.size(); i++) {
			System.out.print(input.get(i)+" ");
		}
		System.out.println();
		
		System.out.print("생성된 로또 숫자 : ");
		for(int i=0; i<lotto.size(); i++) {
			System.out.print(lotto.get(i)+" ");
		}
		System.out.println();
		
		System.out.printf("일치하는 숫자의 개수 : %d\n", count);

		System.out.print("일치하는 숫자 : ");
		for(int i=0; i<correct.size(); i++) {
			System.out.print(correct.get(i)+" ");
		}
		System.out.println();
		
	}

}
