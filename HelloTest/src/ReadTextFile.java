
public class ReadTextFile {

	public static void main(String[] args) {

		try(Scanner input = new Scanner(Paths.get("clients.txt"))) {
			System.out.printf("%-10s%-12s%-12s%10s%n", args)
		}

	}

}
