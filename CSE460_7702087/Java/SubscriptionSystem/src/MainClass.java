import java.util.Scanner;

public class MainClass
{

	private static boolean firstEvent;

	private static Scanner kb;

	private static Publisher[] publishers;

	public static void main(String[] args)
	{
		//Begin
		kb = new Scanner(System.in);
		String command;
		
		/*
		 * Commands:
		 *		new forum,[forum name]
		 *		new post,[user name],[forum name],[thread title],[post text]
		 *		subscribe,[user name],[forum name]
		 *		unsubscribe,[user name],[forum name]
		 */
		
		while (!(command = kb.nextLine()).isEmpty())
		{
			if(command.matches("new forum,[\\S ]+"))
				System.out.println("New forum created!");
			else if(command.matches("new post,[\\S ]+,[\\S ]+,[\\S ]+,[\\S ]+"))
				System.out.println("New post created");
			else if(command.matches("subscribe,[\\S ]+,[\\S ]+"))
				System.out.println("User Subscribed");
			else if(command.matches("unsubscribe,[\\S ]+,[\\S ]+"))
				System.out.println("User Unsubscribed");
			else
				System.out.println("Command not recognized");
				
		}
		//End
	}

}
