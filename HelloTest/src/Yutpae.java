import java.security.SecureRandom;

public class Yutpae {

	private final String[] state = {"Do", "Gae", "Girl", "Yut", "Mo"};
	private int curState = -1;
	
	public Yutpae() {
		SecureRandom random = new SecureRandom();
		this.curState = random.nextInt(5);
	}
	
	public String status() {
		return state[curState];
	}
	
	public int result() {
		return curState;
	}
}
