/*
9 Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F
*/
import java.util.Scanner;
class Grade
{
	public static void main(String args[])
	{
		double  m1,m2,m3,m4,m5,total;
		double marks;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 subjects marks: ");
		m1=sc.nextDouble();
		m2=sc.nextDouble();
		m3=sc.nextDouble();
		m4=sc.nextDouble();
		m5=sc.nextDouble();
		total=m1+m2+m3+m4+m5;
		marks=100*(total/500);
		System.out.printf("percentage : %.2f \n",marks);
		if(marks>=90)
			System.out.println("Grade : A");
		else if(marks<90 && marks>=80)
			System.out.println("Grade : B");
		else if(marks<80 && marks>=70)
			System.out.println("Grade : C");
		else if(marks<70 && marks>=60)
			System.out.println("Grade : D");
		else if(marks<60 && marks>=40)
			System.out.println("Grade : E");
		else
			System.out.println("Grade : F");
			
	}
}
