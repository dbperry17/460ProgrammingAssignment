public class Publisher
{
	/**
	 * name of publisher
	 */
	private String username;
	private static Broker broker;
	//private Event[] event;
	
	//Begin	
	private Event event; //I only need one
	
	public Publisher(String name)
	{
		this.username = name;
		broker = Broker.getBroker();
	}
	//End

	/**
	 * Uses command parameters to create an event and calls pushEvent() in
	 * EventNotification class.
	 */
	public boolean addPost(String[] command)
	{
		//Begin
		boolean succeeded = false;
		
		ThreadInfo thread = broker.newPost(command);
		if(thread != null)
		{
			event = new Event(username, thread);
			if(broker.pushEvent(event))
				succeeded = true;
		}
		
		return succeeded;
		//End
		//return false;
	}

	/**
	 * Adds a forum
	 */
	public boolean addForum(String forum)
	{
		//Begin
		boolean succeeded = false;
		broker.newForum(forum);
		succeeded = true;
		
		return succeeded;
		//End
		//return false;
	}

}
