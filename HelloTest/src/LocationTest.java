import java.util.ArrayList;
import java.util.Scanner;

class Location {
	
	private int x;
	private int y;
	
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
}

public class LocationTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Location> a = new ArrayList<>();
		
		System.out.println("쥐가 이동한 위치(x, y)를 5개 입력하라.");
		a.add(new Location(0, 0));
		for(int i=0; i<5; i++) {
			System.out.print(">> ");
			a.add(new Location(sc.nextInt(), sc.nextInt()));
		}
		a.add(new Location(0, 0));

		double distSum = 0;
		double cur = 0;
		for(int i=0; i<a.size()-1; i++) {
			distSum += Math.sqrt(Math.pow(a.get(i).getX()-a.get(i+1).getX(), 2)+Math.pow(a.get(i).getY()-a.get(i+1).getY(), 2));
		}
		
		System.out.print("총 이동 거리는 ");
		System.out.println(distSum);
	}

}
