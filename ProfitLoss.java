/*
8 Write a Java program to calculate profit or loss.
*/
import java.util.Scanner;
public class ProfitLoss {

	public static void main(String[] args) {
		int cp = 0,sp = 0,items;
		Scanner sc=new Scanner(System.in);
			System.out.print("Enter items Cost Price : ");
			cp=sc.nextInt();
			System.out.print("Enter items Selling Price: ");
			sp=sc.nextInt();
		if(sp>cp)
		{
			System.out.println("You gained "+(sp-cp)+" RS profit");
		}
		else 
		{
			System.out.println("You incurred "+(cp-sp)+" RS loss");
		}
	}

}
