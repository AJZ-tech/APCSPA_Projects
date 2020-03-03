package ElevensLab;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 5;

	/**
	 * The number of values to shuffle.
	 */
	private static final int VALUE_COUNT = 10;

	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = new int[VALUE_COUNT];
		for (int i = 0; i < values1.length; i++) {
			values1[i] = i;
			}
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = new int[VALUE_COUNT];
		for (int i = 0; i < values2.length; i++) {
			values2[i] = i;
			}
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		int[] temp = new int[perfectSplitter(true, values)];
		int[] temp2 = new int[perfectSplitter(false, values)];
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] = values[i];
		}
		
		for (int i = 0; i < temp2.length; i++) {
			temp2[i] = values[i + temp.length];
		}
		
		int a = 0;
		int b = 0;
		for (int i = 0; i < values.length; i++) {
			if (i % 2 == 0) {
				values[i] = temp[a];
				a += 1;
			} else {
				values[i] = temp2[b];
				b += 1;
			}
		}
	}
	
	public static int perfectSplitter(boolean firstHalf, int[] list) {
		
		if (list.length % 2 == 1) {
			if (firstHalf) {
				return (int)((double)list.length/2 + 0.5f);
			} else {
				return (int)((double)list.length/2 - 0.5f);
			}
		}
		
		return list.length/2;
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). 
	 * 
	 * It repeatedly does the following until all cards have been selected: 
	 * randomly remove a card from those not yet selected and add it to the selected cards.
	 * 
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		int rand = randomNum(values);
		System.out.println("rand : " + rand);
		int rand2 = rand + randomNum(values);
		System.out.println("rand2 : " + rand2);
		
		for (int i = 0; i < values.length; i++) {
			list.add(i);
		}
		System.out.println(list);
		
		while (list2.size() <= values.length) {
			
			if (rand2 - rand > values.length - list2.size()) {
				rand = 0;
				rand2 = values.length - list2.size();
			}
			
			int a = 0;
			for (int i = rand; i < rand2; i++) {
				System.out.println("list num : " + (list.size() - i));
				System.out.println("list index : " + (list.indexOf(list.size() - i)));
				list2.add(a, list.get(list.indexOf(list.size() - i)));
				list.remove(list.indexOf(i));
				a += 1;
			}
			System.out.println(list2);
			
			rand = randomNum(values);
			System.out.println("rand : " + rand);
			rand2 = rand + randomNum(values);
			System.out.println("rand2 : " + rand2);
		}
		
		
	}
	
	public static int randomNum(int[] values) {
		Random randoCarrizian = new Random();
		int num = randoCarrizian.nextInt((int)((double)values.length/3));
		System.out.println("range : " + (int)((double)values.length/3));
		return num;
	}
}
