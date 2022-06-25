package finalExam;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class splitPhoneNumber {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input: ");
		String phoneNumber = br.readLine();
		
		String[] tokenArray = new String[3];
		tokenArray = phoneNumber.split("-");
		
		System.out.println("Output:");
		System.out.printf("Mobile Code: %s%nPhone Number: %s%n", tokenArray[0], tokenArray[1]+tokenArray[2]);
		

	}

}
