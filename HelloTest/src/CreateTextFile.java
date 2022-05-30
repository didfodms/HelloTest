import java.io.FileNotFoundException;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Formatter;
import java.lang.SecurityException;
import java.util.Formatter;

public class CreateTextFile {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.printf("%s%n%s%n? ", "Enter account number, first name, last name and balance.", "Enter end-of-file indicator to end input.");
		
		try (Formatter output = new Formatter("clients.txt")) {
			while(input.hasNext()) {
				try {
					output.format("%d %s %s %.2f%n", input.nextInt());
				}
				catch (NoSuchElementException elementException) {
					System.err.println("Invalid input. Please try again.");
					input.nextLine();
				}
				
				System.out.print("? ");
			}
		}
		catch (SecurityException | FileNotFoundException | FormatterClosedException e) {
			e.printStackTrace();
			System.exit(1);
		}

	}

}
