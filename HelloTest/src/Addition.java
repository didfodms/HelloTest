import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("ù��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		
		System.out.println("�ι�° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		
		System.out.printf("Sum is %d\n", sum);
		

	}

}
