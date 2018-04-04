public abstract interface IThread {

	/**
	 * Gets name of forum a thread is in
	 */
	public abstract String getForum();

	/**
	 * Gets number of posts in a thread
	 */
	public abstract int getNumPosts();

	/**
	 * Gets title of thread
	 */
	public abstract String getThreadTitle();

	/**
	 * Adds a post to the thread
	 */
	public abstract boolean addPost();

}
