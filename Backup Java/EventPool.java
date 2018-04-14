
//Begin
import java.util.ArrayList;
//End

public class EventPool
{

	// ADDED BY ASTAH
	// private String availForums[0..*];
	// private ThreadInfo[] threads;

	// Begin
	private ArrayList<String> availForums = new ArrayList<String>();
	private ArrayList<ThreadInfo> threads = new ArrayList<ThreadInfo>();
	// End

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
		// return null;
	}

	/**
	 * Creates a new forum to add to availForums attribute
	 */
	public String newForum(String name)
	{
		//Begin
		String ComeUpWithBetterName = "";
		
		return ComeUpWithBetterName;
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
		int ThinkOfGoodNameLater = 0;
		
		return ThinkOfGoodNameLater;
		//End
		//return 0;
	}

}
