/**
 * A User
 */
public class Publisher
{
	private String username;
	//private EventNotification eventNotification;
	private Event[] event;

	//Begin
	private EventNotification evNote;
	//Astah named it automatically as it was generated due to association
	//I had no way to change the name in Astah, so I had to rename it here
	
	public Publisher(String name)
	{
		username = name;
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
		
		eventNotification = new EventNotification();
		
		
		return succeeded;
		//End
		//return false;
	}

}
