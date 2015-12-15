import java.util.*;

public class ATMPINProtection
{
	public static void main (String args[]) 
	{   
		Scanner input = new Scanner(System.in);
		int actual = 1234;
		int tries = 0;
		int pin;
		
		do
		{
			System.out.println("Please Enter Your PIN ===>>");
			pin = input.nextInt();
			tries +=3;
		
			if (pin == actual){
				System.out.println("Your PIN Is Accepted");
			}
		
			else if (tries > 6){
				System.out.println("You have exceeded your PIN entries");
			}
			
		}	
		while (pin != 1234 );
		
	}
}