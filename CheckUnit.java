/*
11 Write a Java program to input electricity unit charges and calculate total electricity bill according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill
*/
import java.util.Scanner;
class CheckUnit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int unit;
		double su,tu;
		System.out.println("Enter Unit");
		unit=sc.nextInt();
		if(unit>250)
		{
			tu=(unit*1.50);
			su=tu*0.2;
			System.out.println(" Your Electricity bill: "+(tu+su)+" RS");
		}
		else if(unit <=250 && unit>150)
		{
			tu=(unit*1.20);
			System.out.println(" Your Electricity bill: "+tu+" RS");
		}
		else if(unit <=150 && unit>50)
		{
			tu=(unit*0.75);
			System.out.println(" Your Electricity bill: "+tu+" RS");
		}
		else
		{
			tu=unit*0.50;
			System.out.println(" Your Electricity bill: "+tu+" RS");
		}
		
	}
}
