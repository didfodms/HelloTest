import java.security.SecureRandom;
import java.util.Scanner;

public class RandomCoin {
	
   private static final SecureRandom random = new SecureRandom();
   private enum Coin {
      HEADS, TAILS
   }
   
   public static void main(String[] args) {
	   
      Scanner scanner = new Scanner(System.in);
      int headsCount = 0;
      int tailsCount = 0;
      
      String message = "\nOptions Menu\n" + "1 - Toss Coin\n" + "2 - Display the results\n" + "9 - To quit\n"
            + "Enter an option: ";
      
      int option = 0;
      while (option != 9) {
         System.out.print(message);
         option = scanner.nextInt();
         
         switch (option) {
         case 1:
        	 if(flip() == Coin.HEADS) {
        		 headsCount++;
        	 } else {
        		 tailsCount++;
        	 }
        	 break;
        	 
         case 2:
        	 displayResults(headsCount, tailsCount);
        	 break;
        	 
         case 9:
        	 break;
        	 
        default:
        	System.out.println("\nInvalid option. Try again");
        	break;
         }
      }
      scanner.close();
   }
   
   public static void displayResults(int headsCount, int tailsCount) {
      System.out.println("\t Results");
      System.out.printf("\tHEADS TAILS%n");
      System.out.printf("\t%3d %4d%n", headsCount, tailsCount);
   }
   
   public static Coin flip() {
      
      if(random.nextInt(2) == 0) {
    	  return Coin.HEADS;
      }
      else {
    	  return Coin.TAILS;
      }
      
   }
}