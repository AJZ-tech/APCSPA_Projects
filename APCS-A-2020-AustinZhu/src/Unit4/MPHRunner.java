package Unit4;
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
		MilesPerHour example = new MilesPerHour();
		
		example.setNums(45, 0, 32);
		out.print("Example:\n\nEnter the distance :: 45\nEnter the distance :: 0\nEnter the distance :: 32\n");
		example.calcMPH();
		example.print();
		out.println("\n");
		
		
		int dist = 0;
		while (1==1) {
			while (1==1) {
				out.print("Enter the distance :: ");
				if (keyboard.hasNextInt()) {
					dist = keyboard.nextInt();
					break;
				} else {
					out.println("\ninvalid input!");
		            keyboard.next();
				}
			}
			
			int hrs = 0;
			while (1==1) {
				out.print("Enter the hours :: ");
				if (keyboard.hasNextInt()) {
					hrs = keyboard.nextInt(); 
					break;
				} else {
					out.println("\ninvalid input!");
		            keyboard.next();
				}
			}
			
			int mins = 0;
			while (1==1) {
				out.print("Enter the minutes :: ");
				if(keyboard.hasNextInt()) {
					mins = keyboard.nextInt();
					break;
				} else {
					out.println("\ninvalid input!");
		            keyboard.next();
				}
			}

			MilesPerHour test = new MilesPerHour(dist, hrs, mins);
			test.calcMPH();
			test.print();
			
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