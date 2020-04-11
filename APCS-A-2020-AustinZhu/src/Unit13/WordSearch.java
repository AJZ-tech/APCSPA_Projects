package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	char[][] grid = new char[size][size];
    	
    	int counter = 0;
    	for (int x = 0; x < size; x++) {
    		for (int y = 0; y < size; y++) {
    			grid[x][y] = str.charAt(counter);
    			System.out.print(str.charAt(counter) + " ");
    			counter += 1;
    		}
    		System.out.println();
    	}
    }

    public boolean isFound( String word )
    {
    	boolean result = false;
    	int WL = word.length();
    	for (int x = 0; x < 8; x++) {
    		for (int y = 0; y < 8; y++) {
    			if (WL < x-1-WL) 
    				result = checkRight(word, );
    			if (word.length()) 
    				result = checkLeft(word, );
    			if (word.length()) 
    				result = checkUp(word, );
    			if (word.length()) 
    				result = checkDown(word, );
    			if (word.length() && word.length()) 
    				result = checkDiagUpRight(word, );
    			if (word.length() && word.length()) 
    				result = checkDiagUpLeft(word, );
    			if (word.length() && word.length()) 
    				result = checkDiagDownLeft(word, );
    			if (word.length() && word.length()) 
    				result = checkDiagDownRight(word, );
    		}
    	}
    	
    	return result;
    }

	public boolean checkRight(String w, int r, int c)
   {
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
	   return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		return false;
	}

    public String toString()
    {
 		return "";
    }
}
