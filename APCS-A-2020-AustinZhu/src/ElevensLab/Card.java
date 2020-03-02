package ElevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
	
	//public static final String SUITS[] = {"Clubs", "Diamonds", "Hearts", "Spades"};

	//instance variables
		//String suit
	private String suit;
		//int face
	private int face;
	private int PV;

  	//constructors
	public Card() {
		suit = "";
		face = 0;
		PV = 0;
	}
	
	public Card(String S, int F) {
		suit = S;
		face = F;
		PV = 0;
	}
	
	public Card (String S, int F, int Points) {
		suit = S;
		face = F;
		PV = Points;
	}
	
	public Card (String S, String F, int Points) {
		suit = S;
		for (int i = 0; i < Card.FACES.length; i++) {
			if (F.toLowerCase().equals(Card.FACES[i].toLowerCase())) {
				face = i;
			}
		}
		PV = Points;
	}

	// modifiers
		//set methods
	public void setFace(int newFace) {
		face = newFace;
	}
	
	public void setSuit(String newSuit) {
		suit = newSuit;
	}
	
	public void setPoints(int Points) {
		PV = Points;
	}
	
	public void changeCard(String newSuit, int newFace) {
		suit = newSuit;
		face = newFace;
	}
	
	public void changeStats(String newSuit, int newFace, int Points) {
		changeCard(newSuit, newFace);
		setPoints(Points);
	}


  	//accessors
		//get methods
	public String rank() {
		return FACES[face];
	}
	
	public int face() {
		return face;
	}
	
	public String suit() {
		return suit;
	}
	
	public static String[] getFaces() {
		return FACES;
	}

  	//toString
	public String toString() {
		if (PV == 0) {
			return FACES[face] + " of " + suit;
		}
		return FACES[face] + " of " + suit + " :: " + PV;
	}
	
	public int pointValue() {
		return PV;
	}

	public boolean matches(Card card2) {
		if (PV != 0) {
			if (face == card2.face() && suit.equals(card2.suit()) && PV == card2.pointValue()) {
				return true;
			}
		} else {
			if (face == card2.face() && suit.equals(card2.suit())) {
				return true;
			}
		}
		return false;
	}
 }