
public class Yutnori {

	public static void main(String[] args) {

		Yutpae y1 = new Yutpae();
		Yutpae y2 = new Yutpae();

		int p1Score = y1.result();
		int p2Score = y2.result();
		System.out.printf("player1's result : %s%n", y1.status());
		System.out.printf("player2's result : %s%n", y2.status());
		
		if(p1Score > p2Score) {
			System.out.printf("player1 won!%n");
		}
		else if(p2Score > p1Score) {
			System.out.printf("player2 won!%n");
		}
		else {
			System.out.printf("draw!%n");
		}
		
	}

}
