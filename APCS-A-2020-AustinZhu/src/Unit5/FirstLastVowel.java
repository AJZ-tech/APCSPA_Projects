package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String[] vowels = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
	   
	   for (int i = 0; i < vowels.length; i++) {
		   if (a.indexOf(vowels[i]) == 0 || a.indexOf(vowels[i]) == (a.length()-1)) {
			   //System.out.println(vowels[i]);
			   return "yes";
		   }
		   //System.out.print(vowels[i]);
	   }
	   return "no";
	}
}