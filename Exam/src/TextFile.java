import java.io.*;

public class TextFile 
{
	public static void main (String args[]) throws IOException
	{
		File f1 = new File("names.dat");
		
		if (f1.exists())
		{
			FileReader inFile = new FileReader(f1);
			BufferedReader inStream = new BufferedReader(inFile);
			
			String inString;
			while(((inString = inStream.readLine()) != null))
					System.out.println(inString);
			inStream.close();
		}
		else
		{
			System.out.println("Doesn't Exist");
		}
		System.out.println();
	}
}