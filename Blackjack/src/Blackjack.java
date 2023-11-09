import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;

public class Blackjack {
	//static int cardCount;
	static int playerScore;
	static int dealerScore;
	final int BUST = 21;
	
	public static void main(String[] args) {
		
		HashMap<Card, Integer> deck = new HashMap<Card, Integer>(); //card type, pointValue in int
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Blackjack! Press the Enter key to begin.");
		
		sc.nextLine();
		
		Card dealerCard1 = new Card(); //visible card
		dealerScore += dealerCard1.getPointValue();
		Card dealerCard2 = new Card(); //invisible card
		dealerScore += dealerCard2.getPointValue();
		
		Card playerCard1 = new Card();
		playerScore += playerCard1.getPointValue();
		Card playerCard2 = new Card();
		playerScore += playerCard2.getPointValue();
		
		Card playerCard3 = new Card();
		Card PlayerCard4 = new Card();
		Card playerCard5 = new Card();
		
		
		String hitStand;
		
		if (playerCard1.getPointValue() + playerCard2.getPointValue() == 21) {
			System.out.println("Congratulations. You have a blackjack!");
		} else {
			System.out.println("You have the " + playerCard1.getCard() + " and the " + playerCard2.getCard()  
								+ ". Your total point value is " + playerScore + ". ");
			System.out.println("The visible dealer card is the " + dealerCard1.getCard() + ". ");
			System.out.println("Press H to hit."); //should only display these two if not BUST
			System.out.println("Press S to stand."); //see note above
			
			hitStand = sc.next();
			
			while (hitStand.equals("H")) {
				playerScore += playerCard3.getPointValue();
				
				if (playerScore <= 21) {
					break;
				}
				
				
				System.out.println("Press H to hit.");
				System.out.println("Press S to stand.");
				hitStand = sc.next();
			}
		}
		
		
	}

}
