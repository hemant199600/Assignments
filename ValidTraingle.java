/*
3 If the three sides of a triangle are entered through the keyboard,
write a program to check whether the triangle is valid or not. The
triangle is valid if the sum of two sides is greater than the largest of
the three sides.
*/
import java.util.Scanner;
public class ValidTraingle {
	private static Scanner sc;

	public static void main(String[] args) {
		double side1, side2, side3;
		sc = new Scanner(System.in);		
		System.out.println("Please Enter Three sides of Triangle ");
		side1 = sc.nextDouble();
		side2 = sc.nextDouble();
		side3 = sc.nextDouble();
		
		if((side1 + side2  >  side3)&&(side2 + side3 > side1)&&(side1 + side3 > side2))
		{
			System.out.println("It is a Valid Triangle");
		}	
		else 	
		{
			System.out.println("It is Not a Valid Triangle");
		}
			
		
	}
}
