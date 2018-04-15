import java.util.Scanner;
import java.util.ArrayList;

public class MainClass
{
	private static Scanner kb = new Scanner(System.in);
	//private static ArrayList publishers = new ArrayList<Publisher>();

	//Begin
	private static ArrayList<Publisher> publishers = new ArrayList<Publisher>();
	private static boolean testing = false;
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
		}
		// End
	}

	private static void newForum(String command)
	{
		// Begin	
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
		//0:	new post
		//1:	[user name]
		//2:	[forum name]
		//3:	[thread title]
		//4:	[post text]
		Publisher pub = new Publisher(command[1]);
		
		if(pub.addPost(command))
		{
			System.out.println("success?");
			//Sent to [subscriber name]: A new post was added by [author name] in [forum name]: [thread title].
			//Posts in thread: [number of posts].
		}
		

		// End
	}

	private static void subscribe(String[] command)
	{
		// Begin		
		EventNotification evNote = new EventNotification();
		if(evNote.attachSubscriber(command[1], command[2]))
		{
			//No output should be printed if not testing
			if(testing)
				System.out.println("User " + command[1] + " subscribed to " + command[2]);
		}

		// End
	}

	private static void unsubscribe(String[] command)
	{
		// Begin		
		EventNotification evNote = new EventNotification();
		if(evNote.detachSubscriber(command[1], command[2]))
		{
			//No output should be printed if not testing
			if(testing)
				System.out.println("User " + command[1] + " unsubscribed to " + command[2]);
		}
		
		
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
