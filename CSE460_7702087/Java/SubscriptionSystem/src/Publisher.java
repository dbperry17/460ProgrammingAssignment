/**
 * A User
 */
public class Publisher
{
	private String username;
	private EventNotification evNote;
	private Event[] event;

	//Begin	
	public Publisher(String name)
	{
		this.username = name;
	}
	//End

	/**
	 * Uses raw data of post to create an event and send it to EventNotification
	 * class
	 */
	public String[] addPost(String[] command)
	{
		//Begin
		String[] post = {};
		
		return post;
		//End
		//return null;
	}

	public boolean addForum(String forum)
	{
		//Begin
		boolean succeeded = false;
		
		evNote = new EventNotification();
		evNote.getEvent().updateEventPool(forum);
		
		
		return succeeded;
		//End
		//return false;
	}

}
