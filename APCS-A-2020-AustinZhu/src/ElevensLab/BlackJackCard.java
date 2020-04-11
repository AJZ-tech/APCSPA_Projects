package ElevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class BlackJackCard extends Card
{
  	//constructors
  	public BlackJackCard( String s, int f)
  	{
  		super( s, f );
  	}

  	//accessors
	public int getValue()
	{
		if( face() == 1 )
			return 11;
		if( face() >= 10 )
			return 10;
		return face();
	}

  	//toString
  	public String toString()
  	{
  		return super.toString() + " " + getValue();
  	}
 }