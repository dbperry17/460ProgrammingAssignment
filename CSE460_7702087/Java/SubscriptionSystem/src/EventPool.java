public class EventPool {

	private String availForums[0..*];

	private ThreadInfo[] threads;

	/**
	 * Adds a post to a thread, updates relevant ThreadInfo, adds the thread to threads attribute (if thread does not already exist).
	 */
	public ThreadInfo newPost(String postInfo) {
		return null;
	}

	/**
	 * Creates a new forum to add to availForums attribute
	 */
	public String newForum(String name) {
		return null;
	}

	/**
	 * Checks to see if given thread exists in the given forum.
	 * 
	 * If it does exist, method returns its index from the threads attribute.
	 * 
	 * If it does not exist, method returns -1.
	 */
	private int searchThreads(String thread, String forum) {
		return 0;
	}

}
