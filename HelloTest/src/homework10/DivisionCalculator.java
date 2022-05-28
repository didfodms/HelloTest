package homework10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class NegativeNumberException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeNumberException(String msg) {
		super(msg);
	}
	
}

public class DivisionCalculator {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
			int num1 = Integer.parseInt(br.readLine());
			if(num1 < 0) {
				NegativeNumberException e = new NegativeNumberException("������ �Էµ� �� �����ϴ�");
				throw e;
			}
			
			System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
			int num2 = Integer.parseInt(br.readLine());
			if(num2 < 0) {
				NegativeNumberException e = new NegativeNumberException("������ �Էµ� �� �����ϴ�");
				throw e;
			}
			
			int result = num1/num2;
			System.out.println();
			System.out.println("��� : "+ result);
		}
		catch(ArithmeticException e) {
			System.out.println();
			System.out.println("0���δ� ���� �� �����ϴ�");
			return;
		}
		catch(NumberFormatException e) {
			System.out.println();
			System.out.println("�ùٸ��� ���� �Է°��Դϴ�");
			return;
		}
		catch(NegativeNumberException e) {
			System.out.println();
			System.out.println("������ �Էµ� �� �����ϴ�");
			return;
		}
		
	}
	
}
