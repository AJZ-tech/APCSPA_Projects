package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

import java.util.Scanner;

import Unit4.MilesPerHour;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(in);
		
		while(1==1) {	
			String one = "";
			out.print("String One :: ");
			one = keyboard.next();
			
			
			String two = "";
			out.print("String Two :: ");
			two = keyboard.next();

			StringEquality example = new StringEquality(one, two);
			example.result = example.checkEquality();
			out.print(example.toString());
			
			out.print("\n");
			
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
					out.print("invalid input!\n\n");
				}
			}
			if (quit == true) {
				break;
			}
		}
	}
}