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

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		
		while (1==1) {
			out.print("Enter the distance :: ");
			int dist = keyboard.nextInt();

			out.print("Enter the hours :: ");
			int hrs = keyboard.nextInt(); 

			out.print("Enter the minutes :: ");
			int mins = keyboard.nextInt();

			MilesPerHour test = new MilesPerHour(dist, hrs, mins);
			test.calcMPH();
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