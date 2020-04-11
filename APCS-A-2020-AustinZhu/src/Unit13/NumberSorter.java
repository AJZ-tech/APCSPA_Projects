package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		while(number > 0) {
			number = (number - (number%10))/10;
			count += 1;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		int count = 1;
		
		
		while (count <= sorted.length) {
			for (int i = 0; i < count; i++) {
				if (sorted[i] > number%10) {
					int[] storage = Arrays.copyOfRange(sorted, i, count);
					sorted[i] = number%10;
					int counter = 0;
					for (int a = i + 1; a < count; a++) {
						sorted[a] = storage[counter];
						counter += 1;
					}
					break;
				}
				if (i == count - 1) {
					sorted[i] = number%10;
				}
			}
			number = (number - (number%10))/10;
			count += 1;
		}
		return sorted;
	}
}