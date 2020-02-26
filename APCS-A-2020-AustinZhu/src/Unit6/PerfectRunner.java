package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		while (1==1) {
			Scanner keyboard = new Scanner(in);
			int num = 0;
			while (1==1) {
				out.print("Enter number :: ");
				if (keyboard.hasNextInt()) {
					num = keyboard.nextInt(); 
					break;
				} else {
					out.println("\ninvalid input!");
		            keyboard.next();
				}
			}
			
			//function
			Perfect function = new Perfect(num);
			if (function.isPerfect()) {
				System.out.println(num + " is perfect");
			} else {
				System.out.println(num + " is not perfect");
			}
			
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