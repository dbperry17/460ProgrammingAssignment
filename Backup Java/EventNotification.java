import java.util.ArrayList;

public class EventNotification
{
	//private ArrayList subscribers;
	/**
	 * First index indicates index in availForums attribute in EventPool class.
	 * 
	 * Second index lists subscribers in order subscribed.
	 */
	//private ArrayList subscriptions;

	//Begin
	private ArrayList<Subscriber> subscribers;

	// First index indicates index in availForums attribute in EventPool class. 
	// Second index lists subscribers in order subscribed.
	private ArrayList<ArrayList<Integer>> subscriptions;
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
	public boolean attachSubscriber()
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
	 * Unsubscribes a user to a forum
	 */
	public boolean detachSubscriber()
	{
		//Begin
		boolean succeeded = false;

		return succeeded;
		//End
		//return false;
	}
}
