import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayNumber {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			al.add(sc.nextInt());
		}
		
		int maxCount = 0;
		int curCount = 1;
		for(int i=0; i<al.size()-1; i++) {
			if(al.get(i)==al.get(i+1)) {
				curCount++;
			} else {
				maxCount = Math.max(maxCount, curCount);
				curCount = 1;
			}
		}
		maxCount = Math.max(maxCount, curCount);

		System.out.println(maxCount);
	}

}
