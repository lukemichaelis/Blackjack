
public class AceCard extends Card {
	
	public AceCard() {
		isAce = true;
		pointValue = 11;
		cardNumber = "Ace";
	}
	
	public void softAce() {
		pointValue = 1;
	}
	
}
