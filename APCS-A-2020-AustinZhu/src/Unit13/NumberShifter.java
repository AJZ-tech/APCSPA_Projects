package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] sevens = new int[size];
		Random rand = new Random();
		
		
		/*sevens[0] = 7;
		sevens[1] = 7;
		sevens[2] = rand.nextInt(10) + 1;
		sevens[3] = 7;
		for (int i = 4; i < size; i++) {
			sevens[i] = rand.nextInt(10) + 1;
		}
		*/
		for (int i = 0; i < size; i++) {
			sevens[i] = rand.nextInt(10) + 1;
		}
		//System.out.println("makeLucky7Array(output): " + Arrays.toString(sevens));
		return sevens;
	}
	
	public static void shiftEm(int[] array)
	{
		//System.out.println("shiftEm(input): " + Arrays.toString(array));
		
		int num7 = -1;
		boolean finished = false;
		
		for (int num : array) {
			if (num == 7) {
				num7 += 1;
			}
			//System.out.println(num);
		}
		
		//System.out.println();
		//System.out.println(num7);
		
		while (1==1) {
			int tester = 0;
			for(int num : array) {
				if (num == 7) {
					tester += 1;
				} else if (num != 7) {
					break;
				}
			}			

			if (tester - 1 == num7) {
				//System.out.println("test compatible");
				break;
			}
			//System.out.println("tester: "+tester);
			
			for (int i = tester; i < array.length; i++ ) {
				int[] storage;
				if (array[i] == 7) {
					//System.out.println(tester + "-" + i);
					storage = Arrays.copyOfRange(array, tester, i);
					array[tester] = 7;
					//System.out.println("Storage: "+Arrays.toString(storage));
					//System.out.println(storage.toString());
					int num = 0;
					for (int a = tester + 1; a < tester + 1 + storage.length; a++) {
						array[a] = storage[num];
						num += 1;
						//System.out.println(num);
					}
					System.out.println(Arrays.toString(array));
					break;
				}
				//System.out.println("test1");
			}
			//System.out.println("test2");
		}
	}
}