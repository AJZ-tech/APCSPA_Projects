package Unit0;
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
			
			while (1==1) {
				out.print("Enter Char :: ");
				String Temp = keyboard.next();
				if (Temp.length() == 1) {
					Character = Temp.charAt(0);
					break;
				} else {
					out.println("\ninvalid input!");
				}
			}
			
			out.println();
			LetterRemover LR = new LetterRemover(Sentence, Character);
			System.out.println("Result :: " + LR.removeLetters());
			System.out.println(LR.toString());
			
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