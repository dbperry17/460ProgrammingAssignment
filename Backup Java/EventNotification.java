import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EventNotification
{
	//private static ArrayList subscribers = new ArrayList<Subscriber>();

	//Begin
	private ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>();
	Map<String, ArrayList<int>> theAccused = new HashMap<String, ArrayList<int>>();
	//End

	private Event event;

	private static EventPool pool;
	
	//Begin
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
			succeeded = true;
		
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

}
