import java.util.Scanner;
import java.util.ArrayList;

public class MainClass
{

	private static boolean firstEvent;

	private static Scanner kb;

	private static ArrayList publishers;

	public static void main(String[] args)
	{
		// Begin
		kb = new Scanner(System.in);
		publishers = new ArrayList<Publisher>();
		firstEvent = false;
		String command = "";

		/*
		 * Commands:
		 * 
		 * new forum,[forum name]
		 * 
		 * new post,[user name],[forum name],[thread title],[post text]
		 * 
		 * subscribe,[user name],[forum name]
		 * 
		 * unsubscribe,[user name],[forum name]
		 */

		while (!(command = kb.nextLine()).isEmpty())
		{
			ArrayList<String> parsed = parseCommand(command);
			
			if (command.matches("new forum,[\\S ]+"))
				newForum(parsed.get(0));
			else if (command.matches("new post,[\\S ]+,[\\S ]+,[\\S ]+,[\\S ]+"))
				newPost(parsed);
			else if (command.matches("subscribe,[\\S ]+,[\\S ]+"))
				subscribe(parsed);
			else if (command.matches("unsubscribe,[\\S ]+,[\\S ]+"))
				unsubscribe(parsed);
			// else
			// System.out.println("Command not recognized");

		}
		// End
	}

	private static boolean newForum(String command)
	{
		// Begin
		boolean succeeded = false;

		return succeeded;
		// End
		// return false;
	}

	/************************************************************
	 * NOTE: Methods generated by Astah. Had to redo them because 
	 * Astah set the parameter/return value as "ArrayList" instead
	 * of "ArrayList<String>."
	 ************************************************************/
	/*
	private static boolean newPost(ArrayList command)
	{
		return false;
	}

	private static boolean subscribe(ArrayList command)
	{
		return false;
	}

	private static boolean unsubscribe(ArrayList command)
	{
		return false;
	}
	
	/**
	 * Returns an ArrayList containing each part of the command.
	 */
	/*
	private static ArrayList parseCommand(String command)
	{
		return null;
	}
	*/
	
	//Begin
	private static boolean newPost(ArrayList<String> command)
	{
		boolean succeeded = false;
		
		return succeeded;
	}

	private static boolean subscribe(ArrayList<String> command)
	{
		boolean succeeded = false;

		return succeeded;
	}

	private static boolean unsubscribe(ArrayList<String> command)
	{
		boolean succeeded = false;

		return succeeded;
	}
	
	private static ArrayList<String> parseCommand(String command)
	{
		ArrayList<String> splitCommand = new ArrayList<String>();
		
		return splitCommand;
	}
	//End

}
