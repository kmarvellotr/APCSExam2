import java.util.*;


public class ReverseString
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
		
		System.out.println("Word1:  " + original);
		System.out.println("Word2:  " + reverse);
	}
}