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

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		Distance example = new Distance();
		
		example.setCoordinates(1, 1, 2, 1);
		out.print("Example:\n\nEnter X1 :: 1\nEnter Y1 :: 1\nEnter X2 :: 2\nEnter Y2 :: 1\n");
		example.calcDistance();
		example.print();
		out.println("\n");
		
		while(1==1) {
			//add test cases			
			int X1 = 0;
			while (1==1) {
				out.print("Enter X1 :: ");
				if (keyboard.hasNextInt()) {
					X1 = keyboard.nextInt();
					break;
				} else {
					out.println("\ninvalid input!");
		            keyboard.next();
				}
			}
			
			int Y1 = 0;
			while (1==1) {
				out.print("Enter Y1 :: ");
				if (keyboard.hasNextInt()) {
					Y1 = keyboard.nextInt(); 
					break;
				} else {
					out.println("\ninvalid input!");
		            keyboard.next();
				}
			}
		
			int X2 = 0;
			while (1==1) {
				out.print("Enter X2 :: ");
				if (keyboard.hasNextInt()) {
					X2 = keyboard.nextInt();
					break;
				} else {
					out.println("\ninvalid input!");
		            keyboard.next();
				}
			}
		
			int Y2 = 0;
			while (1==1) {
				out.print("Enter Y2 :: ");
				if (keyboard.hasNextInt()) {
					Y2 = keyboard.nextInt();
					break;
				} else {
					out.println("\ninvalid input!");
		            keyboard.next();
				}
			}
		
			Distance test = new Distance(X1,Y1,X2,Y2);
			test.calcDistance();
			test.print();
			
			out.print("\n");
			
			
		}
	}
}