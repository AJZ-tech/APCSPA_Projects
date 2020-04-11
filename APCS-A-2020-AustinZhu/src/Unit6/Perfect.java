package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;
   private int ammount;
   private int[] numbers;
   private int fin;
   private boolean result = false;

	//add constructors
   public Perfect() {
	   number = 0;
   }
   
   public Perfect(int i) {
	   number = i;
   }

	//add a set method

	public boolean isPerfect()
	{
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				ammount += 1;
			}
		}
		numbers = new int[ammount];
		ammount = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				numbers[ammount] = i;
				ammount += 1;
			}
		}
		
		for (int i : numbers) {
			fin += i;
		}
		
		if (fin == number) {
			result = true;
			return result;
		}
		return result;
	}

	//add a toString
	
	public String toString() {
		return "" + result;
	}
	
}