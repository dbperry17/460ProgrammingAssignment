import java.util.Scanner;

public class MainClass
{

	private static boolean firstEvent;
	private static Scanner kb;

	public static void main(String[] args)
	{
		kb = new Scanner(System.in);
		String command;
		
		while (!(command = kb.nextLine()).isEmpty())
		{
			System.out.println(command);
		}
	}

}
