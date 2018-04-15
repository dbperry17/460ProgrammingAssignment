import java.util.ArrayList;

public class EventPool
{
	//private ArrayList availForums;
	//private ArrayList threads;
	
	//Begin
	private ArrayList<String> availForums;
	private ArrayList<ThreadInfo> threads;
	
	public EventPool()
	{
		availForums = new ArrayList<String>();
		threads = new ArrayList<ThreadInfo>();
	}
	//End

	/**
	 * Adds a post to a thread, updates relevant ThreadInfo, adds the thread to
	 * threads attribute (if thread does not already exist).
	 */
	public ThreadInfo newPost(String postInfo)
	{
		//Begin
		ThreadInfo thread = new ThreadInfo();
		
		return thread;
		//End
		//return null;
	}

	/**
	 * Creates a new forum to add to availForums attribute
	 */
	public String newForum(String name)
	{
		//Begin
		String forum = "";
		
		return forum;
		//End
		//return null;
	}

	/**
	 * Checks to see if given thread exists in the given forum.
	 * 
	 * If it does exist, method returns its index from the threads attribute.
	 * 
	 * If it does not exist, method returns -1.
	 */
	private int searchThreads(String thread, String forum)
	{
		//Begin
		int threadNum = 0;
		
		return threadNum;
		//End
		//return 0;
	}

}
