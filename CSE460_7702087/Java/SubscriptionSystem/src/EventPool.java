import java.util.ArrayList;

public class EventPool
{

	//private ArrayList availForums;
	//private ArrayList threads;
	private static EventPool pool;

	//Begin
	private static ArrayList<String> availForums;
	private static ArrayList<ThreadInfo> threads;
	//End

	private EventPool()
	{
		availForums = new ArrayList<String>();
		threads = new ArrayList<ThreadInfo>();
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
	public ThreadInfo newPost(String[] postInfo)
	{
		//Begin
		//0:	new post
		//1:	[user name]
		//2:	[forum name]
		//3:	[thread title]
		//4:	[post text]
		ThreadInfo thread;

		//Check if forum exists
		if (searchForums(postInfo[2]) != -1)
		{
			//If so, check if thread exists in that forum
			int index = searchThreads(postInfo[3], postInfo[2]);
			
			//If not, create a new thread
			if(index == -1)
			{
				thread = new ThreadInfo(postInfo[2], postInfo[3]);
				threads.add(thread);
				index = threads.size() - 1;
			}
			else
				thread = threads.get(index);

			//add a post to the new/found thread
			threads.get(index).addPost(postInfo);
		}
		else
			thread = null;

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
		int threadNum = -1;
		
		//Check if forum exists
		if(searchForums(forum) != -1)
		{
			//If so, check if thread exists
			
			//Apparently this is one way to do a for loop?
			//idk, but I found it while checking StackOverflow for something
			//And I'm not getting errors, so...
			for(ThreadInfo t : threads)
			{
				if(t.getTitle().equalsIgnoreCase(thread))
					//If a thread with the same title is found, check if it's
					//in the right forum
					if(t.getForum().equalsIgnoreCase(forum))
						//If it's in the right forum, get the index
						threadNum = threads.indexOf(t);
			}			
		}
		//Else, no one cares

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
		int index = -1;
		
		for(String f : availForums)
			if(f.equalsIgnoreCase(forum))
				index = availForums.indexOf(f);
		
		return index;
		//End
		//return 0;
	}

}
