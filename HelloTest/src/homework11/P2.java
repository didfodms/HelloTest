package homework11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		String[] strArr = str.split(" ");
		int maxLength = 0;
		int[] wordLength = new int[100000];
		for(int i=0; i<strArr.length; i++) {
			int nowLength = strArr[i].length();
			wordLength[nowLength]++;
			maxLength = Math.max(nowLength, maxLength);
		}
		
		System.out.println("word length\toccurrences");
		for(int i = 1; i <= maxLength; i++) {
			System.out.printf("%4d\t\t%4d%n", i, wordLength[i]);
		}
		
	}

}
