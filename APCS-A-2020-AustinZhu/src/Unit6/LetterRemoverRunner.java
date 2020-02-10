package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		while (1==1) {
			Scanner keyboard = new Scanner(in);
			String Sentence = "";
			char Character = '\0';
			
			out.print("Enter Sentence :: ");
			Sentence = keyboard.next();
			
			out.print("Enter Char :: ");
			Character = keyboard.next();
			
			//put in functions	
			
			boolean quit = false;
			while (1==1) {
				out.print("Continue using? (y/n) :: ");
				String answer = keyboard.next().charAt(0);
				
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