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
		 * 		new forum,[forum name]
		 * 		new post,[user name],[forum name],[thread title],[post text]
		 * 		subscribe,[user name],[forum name]
		 * 		unsubscribe,[user name],[forum name]
		 */

		while (!(command = kb.nextLine()).isEmpty())
		{
			String[] parsed = parseCommand(command);

			if (parsed[0].equalsIgnoreCase("new forum"))
				newForum(parsed[1]);
			else if (parsed[0].equalsIgnoreCase("new post"))
				newPost(parsed);
			else if (parsed[0].equalsIgnoreCase("Subscribe"))
				subscribe(parsed);
			else if (parsed[0].equalsIgnoreCase("Unsubscribe"))
				unsubscribe(parsed);
			else
			{
				// Note to self: Line below for test purposes only
				// Do not change, as unsuccessful commands are supposed
				// to return no error message
				
				System.out.println("Command not recognized");
			}
		}
		// End
	}

	private static boolean newForum(String command)
	{
		// Begin
		boolean succeeded = false;

		//Test
		System.out.println("New Forum: " + command);
		
		return succeeded;
		// End
		// return false;
	}

	private static boolean newPost(String[] command)
	{
		// Begin
		boolean succeeded = false;
		
		//Test
		for(int i = 0; i < command.length; i++)
			System.out.println(command[i]);
		
		return succeeded;
		// End
		// return false;
	}

	private static boolean subscribe(String[] command)
	{
		// Begin
		boolean succeeded = false;

		//Test
		for(int i = 0; i < command.length; i++)
			System.out.println(command[i]);
		
		return succeeded;
		// End
		// return false;
	}

	private static boolean unsubscribe(String[] command)
	{
		// Begin
		boolean succeeded = false;

		//Test
		for(int i = 0; i < command.length; i++)
			System.out.println(command[i]);
		
		return succeeded;
		// End
		// return false;
	}

	/**
	 * Returns an ArrayList containing each part of the command.
	 */
	private static String[] parseCommand(String command)
	{
		//Begin
		/*
		 * Help on splitting Strings:
		 * https://stackoverflow.com/questions/3481828/how-to-split-a-string-in-java
		 * 
		 * 
		 * If you'd like to limit the number of resulting parts, then you can supply the desired number as 2nd argument of split() method.
		 * 
		 * String string = "004-034556-42";
		 * String[] parts = string.split("-", 2);
		 * String part1 = parts[0]; // 004
		 * String part2 = parts[1]; // 034556-42 
		 */

		String[] splitCommand = null;

		if (command.matches("(?i)new forum,[\\S ]+"))
		{
			//new forum,[forum name]
			splitCommand = command.split(",", 2);
		}
		else if (command.matches("(?i)new post,[\\S ]+,[\\S ]+,[\\S ]+,[\\S ]+"))
		{
			//new post,[user name],[forum name],[thread title],[post text]
			splitCommand = command.split(",", 5);
		}
		else if (command.matches("(?i)subscribe,[\\S ]+,[\\S ]+"))
		{
			//subscribe,[user name],[forum name]
			splitCommand = command.split(",", 3);
		}
		else if (command.matches("(?i)unsubscribe,[\\S ]+,[\\S ]+"))
		{
			//unsubscribe,[user name],[forum name]
			splitCommand = command.split(",", 3);
		}
		else
		{
			splitCommand = new String[1];
			splitCommand[0] = "Error";
		}

		return splitCommand;
		//End
		//return null;
	}

}
