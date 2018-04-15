import java.util.ArrayList;

public class EventPool
{

	//private ArrayList availForums;
	//private ArrayList threads;
	private static EventPool pool;

	//Begin
	private ArrayList<String> availForums = new ArrayList<String>();
	private ArrayList<ThreadInfo> threads = new ArrayList<ThreadInfo>();
	//End

	private EventPool()
	{

	}

	public static EventPool getPool()
	{
		//Begin
		if (pool == null)
			pool = new EventPool();
		return pool;
		//End
		//return null;
	}

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
	public boolean newForum(String name)
	{
		//Begin
		boolean succeeded = false;
		availForums.add(name);
		succeeded = true;
		
		return succeeded;
		//End
		//return false;
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

	/**
	 * Searches to see if a forum exists.
	 * 
	 * Returns index position if found
	 * Returns -1 otherwise
	 */
	public int searchForums(String forum)
	{
		//Begin
		int forumNum = 0;

		return forumNum;
		//End
		//return 0;
	}

}
