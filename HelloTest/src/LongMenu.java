import java.util.ArrayList;
import java.util.Scanner;

public class LongMenu {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int longIndex = 0;
		
		for(int i=0; i<5; i++) {
			al.add(sc.next());
			longIndex = al.get(i).length() > al.get(longIndex).length() ? i : longIndex;
		}
		sc.close();

		System.out.print("가장 긴 메뉴 이름은 : ");
		System.out.println(al.get(longIndex));
		
	}

}
