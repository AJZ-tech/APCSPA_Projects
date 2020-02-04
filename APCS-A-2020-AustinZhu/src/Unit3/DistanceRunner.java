package Unit3;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		while(1==1) {
			//add test cases	
			Scanner keyboard = new Scanner(in);
		
			out.print("Enter X1 :: ");
			int X1 = keyboard.nextInt();
		
			out.print("Enter Y1 :: ");
			int Y1 = keyboard.nextInt();
		
			out.print("Enter X2 :: ");
			int X2 = keyboard.nextInt();
		
			out.print("Enter Y2 :: ");
			int Y2 = keyboard.nextInt();
		
			Distance test = new Distance(X1,Y1,X2,Y2);
			test.calcDistance();
			test.print();
			
			out.print("\n\n");
			
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
					out.print("invalid answer.\n\n");
				}
			}
			if (quit == true) {
				break;
			}
		}
	}
}