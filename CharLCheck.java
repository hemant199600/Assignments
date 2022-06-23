/*
(6) Using conditional operators determine:
(1) Whether the character entered through the keyboard is a
lower case alphabet or not.
(2) Whether a character entered through the keyboard is a special
symbol or not.
*/
import java.util.Scanner;
public class CharLCheck {
	private static Scanner sc;

	public static void main(String[] args) {
		char ch;
		sc = new Scanner(System.in);		
		System.out.println("Enter character:  ");
		ch = sc.next().charAt(0);
		if(ch>='a'&&ch<='z')
		{
			System.out.println(ch+ " is small Character.");	
		}
		else if(ch>=' '&&ch<='/'||ch>=':'&&ch<='@'||ch>='['&&ch<='`'||ch>='{')
		{
			System.out.println(ch+ " is special Symbol");	
		}
		else
			System.out.println("it is not speacial symbol nor small Char.");
	}
}
