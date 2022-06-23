/*
(2) Any character is entered through the keyboard, write a program to
determine whether the character entered is a capital letter, a small
case letter, a digit or a special symbol.
The following table shows the range of ASCII values for various
characters:
Characters   ASCII Values
A – Z      65 – 90
a – z      97 – 122
0 – 9     58 - 64
special symbols
48 – 57
0 - 47, 58 - 64, 91 - 96, 123 - 127
*/
import java.util.Scanner;
public class CharCheck {
	private static Scanner sc;

	public static void main(String[] args) {
		char ch;
		sc = new Scanner(System.in);		
		System.out.println("Enter character:  ");
		ch = sc.next().charAt(0);
		if(ch>='A'&&ch<='Z')
		{
			System.out.println(ch+ " is capital character.");	
		}
		else if(ch>='a'&&ch<='z')
		{
			System.out.println(ch+ "  is small Character.");	
		}
		else if(ch>='0'&&ch<='9')
		{
			System.out.println(ch+ "is Digit");	
		}
		else
			System.out.println("it is speacial symbol.");
	}
}
