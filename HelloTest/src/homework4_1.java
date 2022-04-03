import java.util.Scanner;

public class homework4_1 {

	public static int distance(int x1, int y1, int x2, int y2) {
		return (int)Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
	}
	
	public static int distance(int x1, int y1, int z1, int x2, int y2, int z2) {
		return (int)Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)+Math.pow(z2-z1, 2));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x1, y1, z1, x2, y2, z2;
		int input = -1;
		int res = 0;
		
		while(input != 0) {
			System.out.println("input 0 -> program exit");
			System.out.println("input 1 -> calculating 2d distance between two points");
			System.out.println("input 2 -> calculating 3d distance between two points");
			input = sc.nextInt();
			
			if(input == 1) {
				x1 = sc.nextInt();	y1 = sc.nextInt();
				x2 = sc.nextInt();	y2 = sc.nextInt();
				
				res = distance(x1, y1, x2, y2);
			} else if(input == 2) {
				x1 = sc.nextInt();	y1 = sc.nextInt();	z1 = sc.nextInt();
				x2 = sc.nextInt();	y2 = sc.nextInt();	z2 = sc.nextInt();
				
				res = distance(x1, y1, z1, x2, y2, z2);
			} else if(input == 0)
				break;
			
			System.out.println(res);
		}
		
		sc.close();
	}

}
