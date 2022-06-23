/*
(1) Any year is entered through the keyboard, write a program to
determine whether the year is leap or not. Use the logical operators
&& and ||.
*/
import java.util.Scanner;
class Leap
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);		
		int y;
		System.out.print("Enter Year: ");
		y=sc.nextInt();
		if((y%400==0)||((y%4==0)&&(y%100!=0)))
			System.out.println("Leap year");
		else
			System.out.println("Not Leap year");
	}

}
