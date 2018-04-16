import java.util.ArrayList;
import java.util.HashMap;

public class Broker
{
	//private ArrayList availForums;
	//private ArrayList threads;
	private static Broker broker;
	//private static HashMap subscriptions = new HashMap<String, ArrayList<Subscriber>>;
	//private static ArrayList subscribers;
	private Event event;

	//Begin
	private static ArrayList<Subscriber> subscribers;
	private static ArrayList<String> availForums;
	private static ArrayList<ThreadInfo> threads;
	private static HashMap<String, ArrayList<Subscriber>> subscriptions;
	//End

	private Broker()
	{
		availForums = new ArrayList<String>();
		threads = new ArrayList<ThreadInfo>();
		subscriptions = new HashMap<String, ArrayList<Subscriber>>();
		subscribers = new ArrayList<Subscriber>();
	}

	public static Broker getBroker()
	{
		//Begin
		if (broker == null)
			broker = new Broker();
		return broker;
		//End
		//return null;
	}

	/**
	 * Adds a post to a thread, updates relevant ThreadInfo, adds the thread to
	 * threads attribute (if thread does not already exist).
	 */
	public ThreadInfo newPost(String[] postInfo)
	{
		//Begin
		//0:	new post
		//1:	[user name]
		//2:	[forum name]
		//3:	[thread title]
		//4:	[post text]
		ThreadInfo thread;

		//Check if forum exists
		if (searchForums(postInfo[2]) != -1)
		{
			//If so, check if thread exists in that forum
			int index = searchThreads(postInfo[3], postInfo[2]);

			//If not, create a new thread
			if (index == -1)
			{
				thread = new ThreadInfo(postInfo[2], postInfo[3]);
				threads.add(thread);
				index = threads.size() - 1;
			}
			else
				thread = threads.get(index);

			//add a post to the new/found thread
			threads.get(index).addPost(postInfo);
		}
		else
			thread = null;

		return thread;
		//End
		//return null;
	}

	/**
	 * Creates a new forum to add to availForums attribute
	 */
	public boolean newForum(String name)
	{
		//Begin
		boolean succeeded = false;
		availForums.add(name);
		ArrayList<Subscriber> emptylist = new ArrayList<Subscriber>();
		subscriptions.put(name, emptylist);
		succeeded = true;

		return succeeded;
		//End
		//return false;
	}

	/**
	 * Checks to see if given thread exists in the given forum.
	 * 
	 * If it does exist, method returns its index from the threads attribute.
	 * 
	 * If it does not exist, method returns -1.
	 */
	private int searchThreads(String thread, String forum)
	{
		//Begin
		int threadNum = -1;

		//Check if forum exists
		if (searchForums(forum) != -1)
		{
			//If so, check if thread exists

			//Apparently this is one way to do a for loop?
			//idk, but I found it while checking StackOverflow for something
			//And I'm not getting errors, so...
			for (ThreadInfo t : threads)
			{
				if (t.getTitle().equalsIgnoreCase(thread))
					//If a thread with the same title is found, check if it's
					//in the right forum
					if (t.getForum().equalsIgnoreCase(forum))
						//If it's in the right forum, get the index
						threadNum = threads.indexOf(t);
			}
		}
		//Else, no one cares

		return threadNum;
		//End
		//return 0;
	}

	/**
	 * Searches to see if a forum exists.
	 * 
	 * Returns index position if found
	 * Returns -1 otherwise
	 */
	public int searchForums(String forum)
	{
		//Begin
		int index = -1;

		for (String f : availForums)
			if (f.equalsIgnoreCase(forum))
				index = availForums.indexOf(f);

		return index;
		//End
		//return 0;
	}

	/**
	 * Returns arrayList of subscribers to a particular forum.
	 */
	/*
	public ArrayList getForumSubs(String forum)
	{
		return null;
	}
	*/

	private boolean checkSubs(Subscriber user, String forum)
	{
		//Begin
		boolean found = false;

		ArrayList<Subscriber> undyne = subscriptions.get(forum);
		if (undyne.contains(user))
			found = true;

		return found;
		//End
		//return false;
	}

	/**
	 * Subscribes a user to a forum
	 */
	public boolean attachSubscriber(String user, String forum)
	{
		//Begin
		boolean succeeded = false;
		boolean subbed = false;
		int index = searchSubscribers(user);
		Subscriber sub;

		//Does the subscriber exist?
		if (index == -1)
		{
			//If not, add to list of subscribers
			sub = new Subscriber(user);
			subscribers.add(sub);
			index = subscribers.size() - 1;
		}
		else
			sub = subscribers.get(index);

		int forNum = searchForums(forum);

		//Does the forum exist?
		if (forNum != -1)
			subbed = sub.subscribe(forum);

		//Did the user get subscribed?
		if (index != -1 && forNum != -1 && subbed)
		{
			//If so, check if user is in that forum's list of subscribers
			if (!checkSubs(sub, forum))
			{
				//If not, add subscriber to list
				subscriptions.get(forum).add(sub);
				succeeded = true;
			}
		}

		return succeeded;
		//End
		//return false;
	}

	/**
	 * Calls Notify for Subscribers
	 */
	public boolean pushEvent(Event ev)
	{
		//Begin
		boolean succeeded = false;
		boolean loopCheck = true;

		String forum = ev.getThread().getForum();
		ArrayList<Subscriber> subs = getForumSubs(forum);

		for (Subscriber s : subs)
		{
			if (!s.Notify(ev))
			{
				loopCheck = false;
			}
		}

		if (loopCheck)
			succeeded = true;

		return succeeded;
		//End
		//return false;
	}

	/**
	 * Unsubscribes a user to a forum
	 */
	public boolean detachSubscriber(String user, String forum)
	{
		//Begin
		boolean succeeded = false;
		int index = searchSubscribers(user);
		Subscriber sub;

		//Does the subscriber exist?
		if (index != -1)
		{
			//If so, get them, and continue
			sub = subscribers.get(index);

			int forNum = searchForums(forum);
			//Does the forum exist?
			if (forNum != -1)
			{
				//If so, take forum off subscriber's list and continue 
				if (sub.unsubscribe(forum))
				{
					//If that succeeded, check if that forum is in list of subscriptions
					if (subscriptions.containsKey(forum))
					{
						//If so, check if user is in that forum's list of subscribers
						if (checkSubs(sub, forum))
						{
							//If so, remove subscriber from list
							subscriptions.get(forum).remove(sub);
							succeeded = true;
						}
					}
				}
			}
		}
		//No one cares about any other cases
		return succeeded;
		//End
		//return false;
	}

	/**
	 * Searches subscribers arraylist attribute for subscribers.
	 */
	private int searchSubscribers(String user)
	{
		//Begin
		int index = -1;

		for (int i = 0; i < subscribers.size(); i++)
			if (subscribers.get(i).getName().equalsIgnoreCase(user))
				index = i;

		return index;
		//End
		//return 0;
	}

	//Begin
	/**
	 * Returns arrayList of subscribers to a particular forum.
	 */
	public ArrayList<Subscriber> getForumSubs(String forum)
	{
		ArrayList<Subscriber> subs = subscriptions.get(forum);

		return subs;
	}
	//End
}
