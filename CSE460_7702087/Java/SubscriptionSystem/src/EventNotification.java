import java.util.ArrayList;

public class EventNotification
{
	//private static ArrayList subscribers = new ArrayList<Subscriber>();

	/**
	 * First index indicates index in availForums attribute in EventPool class.
	 * 
	 * Second index lists subscribers in order subscribed.
	 */
	//private static ArrayList subscriptions = new <ArrayList<Integer>>();

	//Begin
	private ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>();;

	// First index indicates index in availForums attribute in EventPool class. 
	// Second index lists subscribers in order subscribed.
	private ArrayList<ArrayList<Integer>> subscriptions = new ArrayList<ArrayList<Integer>>();
	//End

	private Event event;

	private static EventPool pool;
	
	//Begin
	public EventNotification()
	{
		
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
	public boolean attachSubscriber(Subscriber user, String forum)
	{
		//Begin
		boolean succeeded = false;

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
	public boolean detachSubscriber(Subscriber user, String forum)
	{
		//Begin
		boolean succeeded = false;

		return succeeded;
		//End
		//return false;
	}

}
