/*
(5) In boxing the weight class of a boxer is decided as per the following
table. Write a program that receives weight as input and prints out
the boxer’s weight class.
Boxer Class  Weight in Pounds  
Flyweight    < 115
Bantamweight  115 - 121
Featherweight  122 - 153
Middleweight  154 – 189
Heavyweight    >= 190
*/
import java.util.*;
class BoxerAge
{
	public static void main(String args[])
	{
		double  w;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter weight (in pounds): ");
		w=sc.nextInt();
		if(w>=190)
			System.out.println("Heavyweight");
		else if(w<190 && w>=154)
			System.out.println("Middleweight");
		else if(w<154 && w>=122)
			System.out.println("Featherweight");
		else if(w<122 && w>=115)
			System.out.println("Bantamweight");
		else
			System.out.println("Flyweight");
			
	}
}
