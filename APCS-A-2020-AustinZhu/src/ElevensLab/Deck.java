package ElevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//make a Deck class
public class Deck {

	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	//public static final int BUFFER = 1;
	
	private List<Card> cards;
	private int top;

   //make a Deck constructor
	public Deck () {
	   	//refer cards to new ArrayList
		cards = new ArrayList<Card>();
	   	//set top to the top of the deck 51 (why 51?)
		top = NUMCARDS;
		
	   	//loop through all suits
		for (int i = 0; i < SUITS.length; i++) {
	   		//loop through all faces 1 to 13
			for (int a = 1; a < Card.getFaces().length; a++) {
	   			//add a new TwentyOneCard to the deck
				cards.add(new Card(SUITS[i], a));
			}
		}
	}

	public Deck(String[] face, String[] suits2, int[] pointValues) {
		
		//refer cards to new ArrayList
		cards = new ArrayList<Card>();
		//initialize array that corresponds suit2 to suit one values
		int[] compare = new int[face.length + 1];
		
		//sets the corresponding values
		for (int i = 0; i < face.length; i++) {
			for (int a = 0; a < Card.FACES.length; a++) {
				if (face[i].toLowerCase().equals(Card.FACES[a].toLowerCase())) {
					compare[i + 1] = a;
				}
			}
		}

	   	//set top to the top of the deck
		top = face.length * suits2.length + 1;
		
		cards.add(new Card("", 0, 0));
		
   		//loop through all faces
		for (int a = 0; a < face.length; a++) {
		   	//loop through all suits
			for (int i = 0; i < suits2.length; i++) {
	   			//add a new card to the deck
				cards.add(new Card(suits2[i], compare[a + 1], pointValues[a]));
			}
		}
	}

//make a dealCard() method that returns the top card
   public Card deal() {
	   if (top > 1) {
		   top -= 1;
		   return cards.get(top);
	   }
	   return cards.get(0);
   }
   
   //write a shuffle() method
   public void shuffle() {
	   	//use Colletions.shuffle
	   Collections.shuffle(cards);
	   	//reset the top card 
	   top = NUMCARDS;
   }

	public int size() {
		return top - 1;
	}

	public boolean isEmpty() {
		if (top > 1) {
			return false;
		}
		return true;
	}
	
}
