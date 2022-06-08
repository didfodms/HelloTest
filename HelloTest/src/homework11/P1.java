package homework11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1 {

	public static void main(String[] args) throws Exception {
		
		int numOfAlphabet[] = new int[26];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if('a' <= ch && ch <= 'z') {
				numOfAlphabet[ch-97]++;
			}
		}
		
		for(int i=0; i<26; i++) {
			System.out.printf("number of %c : %d%n", i+97, numOfAlphabet[i]);
		}

	}

}
