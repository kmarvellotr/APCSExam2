import java.util.*;

public class Palindrome
{
	public static void main (String args[])
	{
		
		String original, reverse = "";
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a word --> ");
		original = input.nextLine();
		
		int length = original.length();
		
		for (int i = length - 1; i >=0; i--)
			reverse = reverse + original.charAt(i);
		
		if (original.equals(reverse))
			System.out.println(original + " is a palindrome");
		else
			System.out.println(original + " is not a palindrome");
	}
}