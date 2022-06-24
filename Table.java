import java.util.Scanner;
class Table
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i=1;
		System.out.print("\tEnter number: ");
		int n=sc.nextInt();
		System.out.println("\t-------------------");
		while(i<=10)
		{
			System.out.println("\t"+n+"*"+i+"\t=  "+(i*n));
			i++;
		}
				
	}
}
