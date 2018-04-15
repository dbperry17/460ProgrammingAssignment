import java.util.ArrayList;

public class Subscriber
{

	//private ArrayList forums;

	//Begin
	private ArrayList<String> forums;
	//End

	private String username;
	private EventNotification eventNotification;
	private Event[] event;
	
	//Begin
	/**
	 * Constructor
	 */
	public Subscriber(String name)
	{
		this.username = name;
	}
	//End

	public boolean Notify()
	{
		//Begin
		boolean succeeded = false;
		
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
	 * Calls detachSubscriber, adds forum to forums attribute
	 */
	public boolean unsubscribe(String forum)
	{
		//Begin
		boolean succeeded = false;
		
		return succeeded;
		//End
		//return false;
	}
	
	//Begin
	public String getName()
	{
		return this.username;
	}
	
	/**
	 * Returns index of forum in forums ArrayList attribute.
	 * 
	 * If the forum searched for is not listed, returns -1.
	 */
	public int getSubscription(String forum)
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
	//End

}
