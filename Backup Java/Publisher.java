public class Publisher
{

	/**
	 * name of publisher
	 */
	private String username;
	private EventNotification evNote;
	private Event[] event;
	private static EventPool pool;

	//Begin	
	public Publisher(String name)
	{
		this.username = name;
		pool = EventPool.getPool();
	}
	//End

	/**
	 * Uses command parametert to create an event and calls pushEvent() in
	 * EventNotification class.
	 */
	public String[] addPost(String[] command)
	{
		//Begin
		String[] post = {};
		
		return post;
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
