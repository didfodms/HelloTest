import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.println("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		
		System.out.printf("Sum is %d\n", sum);
		

	}

}
