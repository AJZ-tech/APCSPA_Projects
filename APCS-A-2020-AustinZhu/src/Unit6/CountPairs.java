package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		
		for (int i = 0; i < (str.length() - 1); i++) {
			if (str.substring(i, i + 1).equals(str.substring(i + 1, i + 2))) {
				count += 1;
			}
		}
		
		return count;
	}
}