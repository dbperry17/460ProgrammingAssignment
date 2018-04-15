public class Event
{

	private ThreadInfo thread;
	private String poster;
	
	//Begin
	public Event(String poster, ThreadInfo thread)
	{
		this.poster = poster;
		this.thread = thread;
	}
	//End

	public boolean printOutput()
	{
		//Begin
		boolean succeeded = false;

		return succeeded;
		//End
		//return false;
	}
	
	//Begin
	public String getPoster()
	{
		return poster;
	}
	
	public ThreadInfo getThread()
	{
		return thread;
	}
	//End
}
