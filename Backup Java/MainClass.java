import java.util.Scanner;
import java.util.ArrayList;

public class MainClass
{

	private static boolean firstEvent = false;
	private static Scanner kb = new Scanner(System.in);
	//private static ArrayList publishers = new ArrayList<Publisher>();

	//Begin
	private static ArrayList<Publisher> publishers = new ArrayList<Publisher>();
	private static boolean testing = true;
	//"testing" variable not shown on class diagram as it's for testing only,
	//and is not actually part of the design
	//End

	public static void main(String[] args)
	{
		// Begin
		String command = "";
		Publisher admin = new Publisher("admin"); //for new forums
		publishers.add(admin);

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
				
				if(testing)
					System.out.println("Command not recognized");
			}
			firstEvent = true;
		}
		// End
	}

	private static void newForum(String command)
	{
		// Begin
		
		if(firstEvent)
			System.out.println(";");
		
		if(publishers.get(0).addForum(command))
		{
			//No output should be printed if not testing
			if(testing)
				System.out.println("New forum created: " + command);
		}

		
		
		// End
	}

	private static void newPost(String[] command)
	{
		// Begin
		if(firstEvent)
			System.out.println(";");
		
		//Test
		for(int i = 0; i < command.length; i++)
			System.out.println(command[i]);
		

		// End
	}

	private static void subscribe(String[] command)
	{
		// Begin
		if(firstEvent)
			System.out.println(";");
		
		//Test
		for(int i = 0; i < command.length; i++)
			System.out.println(command[i]);
		// End
	}

	private static void unsubscribe(String[] command)
	{
		// Begin
		if(firstEvent)
			System.out.println(";");
		
		//Test
		for(int i = 0; i < command.length; i++)
			System.out.println(command[i]);
		
		
		// End
	}

	/**
	 * Returns an ArrayList containing each part of the command.
	 */
	private static String[] parseCommand(String command)
	{
		//Begin
		
		// Help on splitting Strings:
		// https://stackoverflow.com/questions/3481828/how-to-split-a-string-in-java

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
	}

}
