/*
10 Write a Java program to input basic salary of an employee and calculate its Gross salary according to following:
Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95%
*/
import java.util.*;
class CheckSal
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		int basic;
		double da,hra;
		System.out.println("Enter basic salary :   ");
		basic=sc.nextInt();
		if(basic>20000)
		{
			da=basic*0.95;
			hra=basic*0.3;
			System.out.println("HRA :" +hra);
			System.out.println("DA :"+da);
			System.out.println("Gross Salary :"+(basic+hra+da));
		}
		else if(basic>10000&&basic<=20000)
		{
			da=basic*0.90;
			hra=basic*0.25;
			System.out.println("HRA :"+ hra);
			System.out.println("DA :"+da);
			System.out.println("Gross Salary :"+(basic+hra+da));
			
		}
		else if(basic<=10000)
		{
			da=basic*0.8;
			hra=basic*0.2;
			System.out.println("HRA :"+ hra);
			System.out.println("DA :"+da);
			System.out.println("Gross Salary :"+(basic+hra+da));
					
		}
		else
		{
			System.out.println("Enter valid salary ");
		}
	}
}
