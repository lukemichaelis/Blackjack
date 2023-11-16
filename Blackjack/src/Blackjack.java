import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Blackjack {
	private int chips;
	private int betAmount;
	static int playerScore;
	static int dealerScore;
	final int BUST = 21;
	private boolean hitNext = true;
	
	
	
	public boolean play(Scanner sc) { //True = game won, false = game lost
		chips = 1000;
		bet(sc);
		initialize();
		prompt();
		
		
		return true;
	}
	
	
	public void bet(Scanner sc) {
		System.out.println("How much would you like to bet? Whole numbers of chips only. You have " + chips + " Chips.");
		

		betAmount = sc.nextInt();
		while (betAmount > chips) {
			System.out.println("Error: Bet too large. Please try again.");
			betAmount = sc.nextInt();
		}
		System.out.println("You are betting " + betAmount + " chips on this hand.");
	}
	
	public void initialize() { //sets up the HashMap deck
		Card dealerCard1 = new Card(); //visible card
		dealerScore += dealerCard1.getPointValue();
		Card dealerCard2 = new Card(); //invisible card
		dealerScore += dealerCard2.getPointValue();
		
		Card playerCard1 = new Card();
		playerScore += playerCard1.getPointValue();
		Card playerCard2 = new Card();
		playerScore += playerCard2.getPointValue();
		
		if (playerCard1.getPointValue() + playerCard2.getPointValue() == 21) {
			System.out.println("Congratulations. You have a blackjack!");
		} else {
			System.out.println("You have the " + playerCard1.getCard() + " and the " + playerCard2.getCard()  
								+ ". Your total point value is " + playerScore + ". ");
			System.out.println("The visible dealer card is the " + dealerCard1.getCard() + ". ");
			System.out.println("Press H to hit."); //should only display these two if not BUST
			System.out.println("Press S to stand."); //see note above 
		}
	}
	
	public void hitReturn() { //when the player chooses to hit, this algorithm plays
		
	}
	
	public void prompt() { //asks the player whether they want to hit or stand
		
	}
	
	public void newCard(String cardName, Random random) { //randomly chooses card between 1 and 13
		if (i == 1) { //AceCard.java
			//Make an ace
		} else if (i >= 11) { //FaceCard.java
			//Make three face cards
		} else { //Card.java
			
		}
	}
	
	public boolean isBust() {
		if (playerScore > 21) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		HashMap<Card, Integer> deck = new HashMap<Card, Integer>(); //card type, pointValue in int
		 
		
		
		
		Blackjack game = new Blackjack();
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Blackjack! Press the Enter key to begin.");
		
		sc.nextLine();
		
		game.play(sc);
		
		
		
		
		
		String hitStand;
		
		
			
		hitStand = sc.next();
			
		/*while (hitStand.equals("H")) {
			playerScore += playerCard3.getPointValue();
				
			if (playerScore <= 21) {
				break;
			}
				
			System.out.println("You picked up the " + playerCard3.getCard() + ".");
				
				
			System.out.println("Press H to hit.");
			System.out.println("Press S to stand.");
			hitStand = sc.nextLine();
			hitStand = sc.next();
		}
			
		System.out.println("BALLS"); */
		
		
	}

}
