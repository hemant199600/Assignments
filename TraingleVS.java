/*
(4) If the three sides of a triangle are entered through the keyboard,
write a program to check whether the triangle is isosceles,
equilateral, scalene or right angled triangle.
*/
import java.util.Scanner;
class TraingleVS
{	
	public static void main(String[] args)
	{
		int x , y , z ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of 3 side one by one : ");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		if (x == y && y == z )
			System.out.println("Equilateral Triangle");
		else if (x == y || y == z || z == x )
			System.out.println("Isosceles Triangle");
		else
			System.out.println("Scalene Triangle");

	}
	
}
