package Unit0;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Austin Zhu
//Date - 1/30/20
//Class - 2
//Lab  - 1

public class AsciiBox 
{
	public static void main(String[] args)
	{
		System.out.println("name: Austin Zhu \t  date: 1/30/2020 \n\n" );
		
		int i;
		int count;
		int lines;
		boolean letter = false;
		for (i = 0; i < 7; i++) {
			int LIN = 3;
			if (letter == true) {
				LIN = 2;
			} else if (letter == false) {
				LIN = 3;
			}
			for (lines = 0; lines < LIN; lines++) {
				for (count = 0; count < 26; count++) {
					if (letter == true) {
						System.out.print("A");
					} else if (letter == false) {
						System.out.print("+");
					}
				}
				System.out.println();
			}
			if (letter == true) {
				letter = false;
			} else if (letter == false) {
				letter = true;
			}
		}
	}
}