public class Publisher
{

	/**
	 * name of publisher
	 */
	private String username;
	private EventNotification evNote;
	//private Event[] event;
	private static EventPool pool;

	//Begin	
	private Event event; //I only need one
	
	public Publisher(String name)
	{
		this.username = name;
		pool = EventPool.getPool();
		evNote = new EventNotification(); 
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
		
		ThreadInfo thread = pool.newPost(command);
		if(thread != null)
		{
			event = new Event(username, thread);
			if(evNote.pushEvent(event))
				succeeded = true;
		}
		
		return succeeded;
		//End
		//return null;
	}

	/**
	 * Adds a forum
	 */
	public boolean addForum(String forum)
	{
		//Begin
		boolean succeeded = false;
		pool.newForum(forum);
		succeeded = true;
		
		return succeeded;
		//End
		//return false;
	}

}
