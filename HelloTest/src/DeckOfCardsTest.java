
public class DeckOfCardsTest {

	public static void main(String[] args) {
		
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle();
		
		Card[] field = new Card[5];
		
		for(int i=0; i<5; i++) {
			field[i] = myDeckOfCards.dealCard();
			System.out.printf("%-19s", myDeckOfCards.dealCard());
		}
		System.out.println();
		System.out.println("¿øÆä¾î : "+myDeckOfCards.isPair(field));
	}

}
