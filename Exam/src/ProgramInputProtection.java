import java.util.*;

public class ProgramInputProtection
{
	public static void main (String args[]) 
	{   
		Scanner input = new Scanner(System.in);
		String gender;
		do
		{
			System.out.print("Enter your Gender [M/F] ===>>  ");
			gender = input.nextLine();
			if(gender.equals("M") || gender.equals("F"))
				System.out.println("Your gender is " + gender);
		}
		while (!gender.equals("M") || !gender.equals("F") );
		
		
	

	}
}
