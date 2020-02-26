package Unit0;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

import java.util.Scanner; 

public class CountPairsRunner
{
	public static void main( String[] args )
	{
		while (1==1) {
			Scanner keyboard = new Scanner(in);
			String input = "";
			
			out.print("Enter Testcase :: ");
			input = keyboard.next();
			System.out.println( "pairs = " + CountPairs.pairCounter(input));
			System.out.println();
			//add in all of the provided test cases from the lab handout	
			
			boolean quit = false;
			while (1==1) {
				out.print("Continue using? (y/n) :: ");
				String answer = keyboard.next();
				
				if (answer.compareTo((String)"n") == 0) {
					quit = true;
					break;
				} else if (answer.compareTo((String)"y") == 0) {
					out.print("\n");
					break;
				} else {
					out.print("invalid input!\n");
				}
			}
			if (quit == true) {
				break;
			}
		}
	}
}