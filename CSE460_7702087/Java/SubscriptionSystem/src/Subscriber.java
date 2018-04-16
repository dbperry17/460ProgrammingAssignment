import java.util.ArrayList;

public class Subscriber
{
	//private ArrayList forums;
	private String username;
	private static boolean firstEvent = false;
	private Broker broker;
	private Event[] event;
	
	//Begin
	private ArrayList<String> forums;
	
	/**
	 * Constructor
	 */
	public Subscriber(String name)
	{
		this.username = name;
		forums = new ArrayList<String>();
		broker = Broker.getBroker();
	}
	//End

	public boolean Notify(Event ev)
	{
		//Begin
		boolean succeeded = false;
		
		if(firstEvent)
			System.out.print(";");
		
		firstEvent = true;
		//Sent to [subscriber name]: A new post was added by [author name] in [forum name]: [thread title].
		//Posts in thread: [number of posts].
		String output = "Sent to " + username + ": A new post was added by " + ev.getPoster() + " in " +
						ev.getThread().getForum() + ": " + ev.getThread().getTitle() +
						". Posts in thread: " + ev.getThread().getNumPosts() + ".";
		
		System.out.print(output);
		
		
		return succeeded;
		//End
		//return false;
	}

	/**
	 * Calls attachSubscriber, adds forum to forums attribute
	 */
	public boolean subscribe(String forum)
	{
		//Begin
		boolean succeeded = false;
		int index = getSubscription(forum);
		
		if(index == -1)
		{
			forums.add(forum);
			succeeded = true;
		}
		
		return succeeded;
		//End
		//return false;
	}

	/**
	 * Calls detachSubscriber, deletes forum to forums attribute
	 */
	public boolean unsubscribe(String forum)
	{
		//Begin
		boolean succeeded = false;
		int index = getSubscription(forum);
		
		//Was the user subscribed?
		if(index != -1)
		{
			//If so, remove from list
			forums.remove(index);
			succeeded = true;
		}
		
		return succeeded;
		//End
		//return false;
	}

	/**
	 * Returns index of forum in forums ArrayList attribute.
	 * 
	 * If the forum searched for is not listed, returns -1.
	 */
	private int getSubscription(String forum)
	{
		//Begin
		int index = -1;
		for(int i = 0; i < forums.size(); i++)
		{
			if(forums.get(i).equalsIgnoreCase(forum))
				index = i;
		}
		
		return index;
		//End
		//return 0;
	}
	
	//Begin
	public String getName()
	{
		return this.username;
	}
	//End

}
