import Old Class Diagrams.IThread;

public class ThreadInfo implements Old Class Diagrams.IThread {

	private int numPosts;

	private String forum;

	private String title;

	private Post[] posts;

	/**
	 * Creates a post object, increases numPosts attribute by one, updates posts attribute
	 */
	public boolean addPost(String post) {
		return false;
	}


	/**
	 * @see Old Class Diagrams.IThread#getForum()
	 * 
	 *  
	 */
	public String getForum() {
		return null;
	}


	/**
	 * @see Old Class Diagrams.IThread#getNumPosts()
	 */
	public int getNumPosts() {
		return 0;
	}


	/**
	 * @see Old Class Diagrams.IThread#getThreadTitle()
	 * 
	 *  
	 */
	public String getThreadTitle() {
		return null;
	}


	/**
	 * @see Old Class Diagrams.IThread#addPost()
	 */
	public boolean addPost() {
		return false;
	}

}
