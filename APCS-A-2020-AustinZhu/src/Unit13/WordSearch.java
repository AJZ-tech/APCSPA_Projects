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
    	m = new String[size][size];
    	
    	int counter = 0;
    	for (int x = 0; x < size; x++) {
    		for (int y = 0; y < size; y++) {
    			m[x][y] = Character.toString(str.charAt(counter));
    			counter += 1;
    		}
    	}
    	
    	counter = 0;
    	for (int x = 0; x < size; x++) {
    		for (int y = 0; y < size; y++) {
    			System.out.print(m[x][y] + " ");
    		}
    		System.out.println();
    	}
    }

    public boolean isFound( String word )
    {
    	boolean result = false;
    	int wl = word.length()-1;
    	int size = m.length;
    	int stopingPoint = 0;
    	for (int x = 0; x < 8; x++) {
    		for (int y = 0; y < 8; y++) {
    			if (y+wl < size) {
    				if (checkRight(word, x, y)) {
    					result = true;
    				}
    				//System.out.println("checkRight");
    			} else {
    				stopingPoint += 1;
    			}
    			if (y > wl) {
    				if (checkLeft(word, x, y)) {
    					result = true;
    				}
				}	else {
    				stopingPoint += 1;
    			}
    			if (x > wl) {
    				//System.out.println(x);
    				if (checkUp(word, x, y)) {
    					result = true;
    				}
				}	else {
    				stopingPoint += 1;
    			}
    			if (x+wl < size) {
    				if (checkDown(word, x, y)) {
    					result = true;
    				}
    				//System.out.println("checkDown");
				}	else {
    				stopingPoint += 1;
    			}
    			if (y > wl && x+wl < size) {
    				if (checkDiagUpRight(word, x, y)) {
    					result = true;
    				}
				}	else {
    				stopingPoint += 1;
    			}
    			if (y > wl && x > wl) {
    				if (checkDiagUpLeft(word, x, y)) {
    					result = true;
    				}
				}	else {
    				stopingPoint += 1;
    			}
    			if (y+wl < size && x > wl) {
    				if (checkDiagDownRight(word, x, y)) {
    					result = true;
    				}
				}	else {
    				stopingPoint += 1;
    			}
    			if (y+wl < size && x+wl < size) {
    				if (checkDiagDownLeft(word, x, y)) {
    					result = true;
    				}
				}	else {
    				stopingPoint += 1;
    			}
    		}
    	}
    	
    	return result;
    }

	public boolean checkRight(String w, int r, int c)
   {
		String storage = "";
		
		for (int y = 0; y < w.length(); y++) {
			storage = storage + m[r][y+c];
		}
		//System.out.println(w + ": " + storage);
		if (w.equals(storage)) {
			return true;
		}
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		/*String storage = "";
		
		for (int y = 0; y < w.length(); y++) {
			storage = storage + m[r][y+c];
		}
		//System.out.println(w + ": " + storage);
		if (w.equals(storage)) {
			return true;
		}*/
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		String storage = "";
		
		for (int x = r-1; x >= r-w.length(); x--) {
			storage = storage + m[x][c];
		}
		System.out.println(w + "(up): " + storage + ", " + r + ", " + c);
		if (w.equals(storage)) {
			return true;
		}
		return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
		String storage = "";
		
		for (int x = 0; x < w.length(); x++) {
			storage = storage + m[x+r][c];
		}
		//System.out.println(w + "(down): " + storage + ", " + r + ", " + c);
		if (w.equals(storage)) {
			return true;
		}
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
