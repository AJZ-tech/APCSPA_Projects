package Unit2;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Austin Zhu
//Date - 2/3/2020

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double result = (((double)y2-(double)y1)/((double)x2-(double)x1));
		return result;
	}

}