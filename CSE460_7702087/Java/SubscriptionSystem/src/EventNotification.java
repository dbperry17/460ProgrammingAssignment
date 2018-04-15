import java.util.ArrayList;
import java.util.HashMap;

public class EventNotification
{

	//private static ArrayList subscribers = new ArrayList<Subscriber>();
	private Event event;
	private static EventPool pool;
	//private static HashMap subscriptions = new HashMap<String, ArrayList<String>>;

	//private static ArrayList subscribers = new ArrayList<Subscriber>();

	//Begin
	private static ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>();
	private static HashMap<String, ArrayList<Subscriber>> subscriptions = new HashMap<String, ArrayList<Subscriber>>();

	public EventNotification()
	{
		pool = EventPool.getPool();
	}
	//End

	/**
	 * Attaches a new user as a publisher
	 */
	public boolean attachPublisher()
	{
		//Begin
		boolean succeeded = false;

		return succeeded;
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
		if(index == -1)
		{
			//If not, add to list of subscribers
			sub = new Subscriber(user);
			subscribers.add(sub);
			index = subscribers.size() - 1;
		}
		else
			sub = subscribers.get(index);
		
		int forNum = pool.searchForums(forum);
		
		//Does the forum exist?
		if(forNum == -1)
		{
			//If not, do nothing
		}
		else
			subbed = sub.subscribe(forum);
		
		//Did the user get subscribed?
		if(index != -1 && forNum != -1 && subbed)
		{
			//If so, add it to the list of that forums's subscribers
			
			
			succeeded = true;
		}
		
		return succeeded;
		//End
		//return false;
	}

	/**
	 * Calls Notify for Subscriber
	 */
	public boolean pushEvent(Event ev)
	{
		//Begin
		boolean succeeded = false;

		return succeeded;
		//End
		//return false;
	}

	/**
	 * Subscribes a user to a forum
	 */
	public boolean detachSubscriber(String user, String forum)
	{
		//Begin
		boolean succeeded = false;
		boolean unsubbed = false;
		int index = searchSubscribers(user);
		Subscriber sub;
		
		//Does the subscriber exist?
		if(index == -1)
		{
			//If not, add to list of subscribers
			//
			sub = new Subscriber(user);
			subscribers.add(sub);
			index = subscribers.size() - 1;
			return false; //No sense in checking anything else
		}
		else
			sub = subscribers.get(index);
		
		int forNum = pool.searchForums(forum);
		
		//Does the forum exist?
		if(forNum == -1)
		{
			//If not, do nothing
		}
		else
			unsubbed = sub.subscribe(forum);
		
		//Did the user get subscribed?
		if(index != -1 && forNum != -1 && unsubbed)
			succeeded = true;
		
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
		
		//Starts at 1 because 0 is used up automatically by me
		for(int i = 1; i < subscribers.size(); i++)
			if(subscribers.get(i).getName().equalsIgnoreCase(user))
				index = i;
		
		return index;
		//End
		//return 0;
	}
	
	
	private boolean checkSubs(Subscriber user)
	{
		//Begin
		boolean found = false;
		
		return found;
		//End
		//return false;
		
	}

}
