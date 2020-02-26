package ConsumerLab;
import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

/**
 * Class that contains helper methods for the Review Lab
 **/
public class Review {

	private static HashMap<String, Double> sentiment = new HashMap<String, Double>();
	private static ArrayList<String> posAdjectives = new ArrayList<String>();
	private static ArrayList<String> negAdjectives = new ArrayList<String>();

	private static final String SPACE = " ";

	static {
		try {
			Scanner input = new Scanner(new File("src/ConsumerLab/cleanSentiment.csv"));
			while (input.hasNextLine()) {
				String[] temp = input.nextLine().split(",");
				sentiment.put(temp[0], Double.parseDouble(temp[1]));
				//System.out.println("added "+ temp[0]+", "+temp[1]);
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Error reading or parsing cleanSentiment.csv");
		}

		// read in the positive adjectives in postiveAdjectives.txt
		try {
			Scanner input = new Scanner(new File("src/ConsumerLab/positiveAdjectives.txt"));
			while (input.hasNextLine()) {
				String temp = input.nextLine().trim();
				//System.out.println(temp);
				posAdjectives.add(temp);
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
		}

		// read in the negative adjectives in negativeAdjectives.txt
		try {
			Scanner input = new Scanner(new File("src/ConsumerLab/negativeAdjectives.txt"));
			while (input.hasNextLine()) {
				negAdjectives.add(input.nextLine().trim());
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Error reading or parsing negativeAdjectives.txt");
		}
	}

	/**
	 * returns a string containing all of the text in fileName (including
	 * punctuation), with words separated by a single space
	 */
	public static String textToString(String fileName) {
		String temp = "";
		try {
			Scanner input = new Scanner(new File(fileName));

			// add 'words' in the file to the string, separated by a single space
			while (input.hasNext()) {
				temp = temp + input.next() + " ";
			}
			input.close();

		} catch (Exception e) {
			System.out.println("Unable to locate " + fileName);
		}
		// make sure to remove any additional space that may have been added at the end
		// of the string.
		return temp.trim();
	}

	/**
	 * @returns the sentiment value of word as a number between -1 (very negative)
	 *          to 1 (very positive sentiment)
	 */
	public static double sentimentVal(String word) {
		try {
			return sentiment.get(word.toLowerCase());
		} catch (Exception e) {
			return 0;
		}
	}

	/**
	 * Returns the ending punctuation of a string, or the empty string if there is
	 * none
	 */
	public static String getPunctuation(String word) {
		String punc = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			if (!Character.isLetterOrDigit(word.charAt(i))) {
				punc = String.valueOf(word.charAt(i));
				//System.out.println(punc + " p");
			} else {
				return punc;
			}
		}
		return punc;
	}

	/**
	 * Randomly picks a positive adjective from the positiveAdjectives.txt file and
	 * returns it.
	 */
	public static String randomPositiveAdj() {
		int index = (int) (Math.random() * posAdjectives.size());
		return posAdjectives.get(index);
	}

	/**
	 * Randomly picks a negative adjective from the negativeAdjectives.txt file and
	 * returns it.
	 */
	public static String randomNegativeAdj() {
		int index = (int) (Math.random() * negAdjectives.size());
		return negAdjectives.get(index);

	}

	/**
	 * Randomly picks a positive or negative adjective and returns it.
	 */
	public static String randomAdjective() {
		boolean positive = Math.random() < .5;
		if (positive) {
			return randomPositiveAdj();
		} else {
			return randomNegativeAdj();
		}
	}

	/**
	 * Activity 2: totalSentiment() Write the code to total up the sentimentVals of
	 * each word in a review.
	 */
	public static double totalSentiment(String filename) {
		// read in the file contents into a string using the textToString method with
		// the filename
		String storageSTR = textToString(filename) + " t";
		//System.out.println(storageSTR);
		// set up a sentimentTotal variable
		double sentimentTotal = 0.0;
		int numOfWords = 0;
		// loop through the file contents
		//System.out.println(storageSTR.trim().length());
		//System.out.println(sentiment.get("abs"));
		while (storageSTR.trim().length() > -1 ) {
		// find each word
			int tempINT = storageSTR.indexOf(SPACE);
			/*System.out.println(storageSTR.substring(0, tempINT));
			System.out.println(punct);
			System.out.println(storageSTR.substring(0, tempINT).indexOf(punct));*/
			//System.out.println ("test");
			//System.out.println(tempINT);
			boolean isThere = false;
		// add in its sentimentVal
			if (tempINT > -1) {
				String punct = getPunctuation(storageSTR.substring(0, tempINT));
				/*if (punct.compareTo("") != 0 && punct.compareTo() != ) {
					System.out.println(storageSTR.substring(0, tempINT) + " :: " + punct);
				}*/
				if (storageSTR.substring(0, tempINT).indexOf(punct) > 0) {
					tempINT = storageSTR.indexOf(punct);
					//System.out.println(storageSTR.substring(0, tempINT));
				}
				//System.out.println(tempINT);
				for (String i : sentiment.keySet()) {
					 if(storageSTR.substring(0, tempINT).equals(i)) {
						isThere = true;
						System.out.print(storageSTR.substring(0, tempINT));
						numOfWords++;
					}
				}
				if (isThere) {
					sentimentTotal += sentiment.get(storageSTR.substring(0, tempINT));
					System.out.println(": " + sentiment.get(storageSTR.substring(0, tempINT)));
					/*if (sentiment.get(storageSTR.substring(0, tempINT)) < 0)
					System.out.println(sentiment.get(storageSTR.substring(0, tempINT)));
					else
					System.out.println("+" + sentiment.get(storageSTR.substring(0, tempINT)));*/
				}
			// set the file contents to start after this word
				storageSTR = storageSTR.substring(tempINT, storageSTR.length()).trim();
				//if (isThere) System.out.println(storageSTR.substring(0, tempINT));
			} else {
				break;
			}
		}
		System.out.println(numOfWords);
		return sentimentTotal;
	}
	

	/**
	 * Activity 2 starRating method Write the starRating method here which returns
	 * the number of stars for the review based on its totalSentiment.
	 */
	public static int starRating(String filename) {
		// call the totalSentiment method with the fileName
		double ts = totalSentiment(filename);
		// determine number of stars between 0 and 4 based on totalSentiment value
		int stars = 0;
		// write if statements here
		if (ts >= 30.0) {
			stars = 5;
		} else if (ts >= 20.0) {
			stars = 4;
		} else if (ts >= 10.0) {
			stars = 3;
		} else if (ts >= 0.0) {
			stars = 2;
		} else {
			stars = 1;
		}
		// return number of stars
		return stars;
	}
}