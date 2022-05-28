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
			System.out.print("첫번째 숫자를 입력하세요 : ");
			int num1 = Integer.parseInt(br.readLine());
			if(num1 < 0) {
				NegativeNumberException e = new NegativeNumberException("음수는 입력될 수 없습니다");
				throw e;
			}
			
			System.out.print("두번째 숫자를 입력하세요 : ");
			int num2 = Integer.parseInt(br.readLine());
			if(num2 < 0) {
				NegativeNumberException e = new NegativeNumberException("음수는 입력될 수 없습니다");
				throw e;
			}
			
			int result = num1/num2;
			System.out.println();
			System.out.println("결과 : "+ result);
		}
		catch(ArithmeticException e) {
			System.out.println();
			System.out.println("0으로는 나눌 수 없습니다");
			return;
		}
		catch(NumberFormatException e) {
			System.out.println();
			System.out.println("올바르지 않은 입력값입니다");
			return;
		}
		catch(NegativeNumberException e) {
			System.out.println();
			System.out.println("음수는 입력될 수 없습니다");
			return;
		}
		
	}
	
}
