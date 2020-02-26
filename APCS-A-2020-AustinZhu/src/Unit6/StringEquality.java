package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;
	boolean result = true;

	public StringEquality()
	{
		wordOne = "";
		wordTwo = "";
	}

	public StringEquality(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
		
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkEquality( )
	{
		if (wordOne.length() != wordTwo.length()) {
			return false;
		}
		for (int i = 0; i < wordOne.length(); i++) {
			if (wordOne.substring(i, i + 1).compareTo(wordTwo.substring(i, i + 1)) != 0) {
				return false;
			}
		}
		return true;
	}

	public String toString()
	{
		if (result == false) {
			return wordOne + " does not have the same letters as " + wordTwo + "\n";
		} else {
			return wordOne + " does have the same letters as " + wordTwo + "\n";
		}
		
	}
}