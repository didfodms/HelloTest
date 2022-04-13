import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;

public class homework6_1 {

	public static void main(String[] args) {
		
		SecureRandom random = new SecureRandom();
		ArrayList<Integer> input = new ArrayList<>();
		ArrayList<Integer> lotto = new ArrayList<>();
		ArrayList<Integer> correct = new ArrayList<>();
		//�ζ� ���� ����
		int n = Integer.parseInt(args[0]);
		//����� �Է� �ޱ� 
		for(int i=1; i<=n; i++) {
			int inputNumber = Integer.parseInt(args[i]);
			//�ߺ� Ȯ�� 
			if(input.isEmpty()) {
				input.add(inputNumber);
			}
			else if(!input.contains(inputNumber)) {
				input.add(inputNumber);
			}
			else {
				System.out.println("�ߺ��� ��ȣ�� ���ԵǾ����ϴ�. �ٽ� �Է����ּ���.");
				System.exit(-1);
			}
		}
		//ù°�� ���
		System.out.printf("�ζ� ���� ������ ���ڸ� �Է��ϼ��� : %d ", n);
		for(int i=1; i<=n; i++) {
			System.out.print(args[i]+" ");
		}
		//�ߺ����� �ʴ� �ζ� ��ȣ ���� 
		do {
			int lottoNumber = random.nextInt(45)+1;
			if(!lotto.contains(lottoNumber)) {
				lotto.add(lottoNumber);
			}
		}
		while(lotto.size()!=n);
		//��ġ�ϴ� ��ȣ
		int count = 0;
		//��
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
		
		System.out.print("\n����ڰ� �Է��� ���� : ");
		for(int i=0; i<input.size(); i++) {
			System.out.print(input.get(i)+" ");
		}
		System.out.println();
		
		System.out.print("������ �ζ� ���� : ");
		for(int i=0; i<lotto.size(); i++) {
			System.out.print(lotto.get(i)+" ");
		}
		System.out.println();
		
		System.out.printf("��ġ�ϴ� ������ ���� : %d\n", count);

		System.out.print("��ġ�ϴ� ���� : ");
		for(int i=0; i<correct.size(); i++) {
			System.out.print(correct.get(i)+" ");
		}
		System.out.println();
		
	}

}
