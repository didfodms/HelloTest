import java.security.SecureRandom;
import java.util.Arrays;

public class DeckOfCards {

	private static final SecureRandom random = new SecureRandom();
	private static final int NUMBER_OF_CARDS = 52;
	
	private Card[] deck = new Card[NUMBER_OF_CARDS];
	private int currentCard = 0;
	
	public DeckOfCards() {
		String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		
		for(int i=0; i<deck.length; i++) {
			deck[i] = new Card(faces[i%13], suits[i/13]);
		}
	}
	
	public void shuffle() {
		currentCard = 0;
		
		for(int first = 0; first < deck.length; first++) {
			int second = random.nextInt(NUMBER_OF_CARDS);
			
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
	}
	
	public Card dealCard() {
		if(currentCard < deck.length) {
			return deck[currentCard++];
		} else {
			return null;
		}
	}
	//face가 같은거 한 쌍
	public boolean isPair(Card[] field) {
		for(int i=0; i<field.length-1; i++) {
			for(int j=i+1; j<field.length; j++) {
				if(field[i].getFace().equals(field[j].getFace())) {
					return true;
				}
			}
		}
		return false;
	}
	/*face 같은거 두 쌍
	public boolean isTwoPairs(Card[] field) {
		for(int i=0; i<field.length-1; i++) {
			for(int j=i+1; j<field.length; j++) {
				//이건 보류.
			}
		}
	}
	*/
	//같은 face 세 장
	public boolean isThreeOfAKind(Card[] field) {
		for(int i=0; i<field.length-1; i++) {
			int faceCount = 1;
			for(int j=i+1; j<field.length; j++) {
				if(field[i].getFace().equals(field[j].getFace())) {
					faceCount++;
				}
			}
			if(faceCount >= 3) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isFourOfAKind(Card[] field) {
		
		for(int i=0; i<field.length-1; i++) {
			int faceCount = 1;
			for(int j=i+1; j<field.length; j++) {
				if(field[i].getFace().equals(field[j].getFace())) {
					faceCount++;
				}
			}
			if(faceCount == 4) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isFlush(Card[] field) {
		Card firstCard = field[0];
		
		int suitCount = 1;
		for(int i=0; i<field.length; i++) {
			if(field[i].getSuit().equals(firstCard.getSuit())) {
				suitCount++;
			}
		}
		
		return suitCount == 5;
	}
	/*
	public boolean isStraight(Card[] field) {
		
	}
	
	public boolean isFullHouse() {
	}
	*/
}
