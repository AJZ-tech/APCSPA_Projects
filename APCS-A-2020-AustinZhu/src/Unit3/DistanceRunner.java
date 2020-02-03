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
	}
}