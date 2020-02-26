package Unit3;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{ 
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums (dist, hrs, mins);
		mph = 0.0;
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		mph = (double)distance/((double)hours+((double)minutes/60));
	}

	public void print()
	{
		System.out.println(distance +" {0} miles in "+ hours +" hours and "+ minutes +" minutes is "+ (int)Math.round(mph) +" miles per hour");
		//System.out.println(String.format("test: %s, test: %f, test: %.3f","bob", 21321515324.54364645543, 21321515324.54364645543));
		//System.out.println( String.format("%.02f", 435.23432532) );
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return Integer.toString((int)Math.round(mph));
	}
}