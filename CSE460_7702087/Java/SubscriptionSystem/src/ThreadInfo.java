import java.util.ArrayList;

public class ThreadInfo
{
	private int numPosts;
	private String forum;
	private String title;
	//private ArrayList posts;

	//Begin
	private ArrayList<Post> posts;

	/**
	 * Constructor
	 */
	public ThreadInfo(String forum, String title)
	{
		this.forum = forum;
		this.title = title;
		this.numPosts = 0;
		posts = new ArrayList<Post>();
	}
	//End

	/**
	 * Creates a post object, increases numPosts attribute by one, updates posts
	 * attribute
	 */
	public boolean addPost(String[] post)
	{
		//Begin
		boolean succeeded = false;
		
		numPosts++;		
		Post newPost = new Post(post[1], post[2], numPosts);
		
		posts.add(newPost);
		
		
		
		return succeeded;
		//End
		//return false;
	}
	
	//Begin
	public String getForum()
	{
		return this.forum;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public int getNumPosts()
	{
		return this.numPosts;
	}
	
	public ArrayList<Post> getPosts()
	{
		return posts;
	}
	//End
}
