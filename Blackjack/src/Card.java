import java.util.Random;

public class Card {
	String[] Suits = new String[] {"Hearts", "Spades", "Diamonds", "Clubs"};
	String[] Numbers = new String[] {"Two", "Three", "Four", "Five", "Six", 
									"Seven", "Eight", "Nine", "Ten"};
	
	Random random = new Random();
	
	protected int pointValue;
	protected String cardNumber;
	protected String suit;
		

	public int getPointValue() {
		return pointValue;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}
	
	
	public Card() { //for infinite decks
		pointValue = random.nextInt(8) + 2;
		cardNumber = Numbers[pointValue - 2];
		suit = Suits[random.nextInt(3) + 1];
	}
	/*public Card(String number, String cardSuit) { //for actual deck generation from words
		cardNumber = number;
		suit = cardSuit;
		for (int i = 0; i < 9; i++) {
			if (cardNumber.equals(Numbers[i])) {
				pointValue = i + 1;
				break;
			}
		}
		
	} */
	
	public Card(int number, int cardSuit) { //for random deck generation from numbers
		cardNumber = Numbers[number - 2];
		suit = Suits[cardSuit];
		pointValue = number;
	}
	
	
	public void print() {
		System.out.println("Current card: " + cardNumber + " of " + suit);
	}
	
	public String getCard() {
		return cardNumber + " of " + suit;
	}
	
}
