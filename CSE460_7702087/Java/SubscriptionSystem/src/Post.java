/**
 * Keeps track of the posts for use in extra credit (just in case).
 */
public class Post
{
	private String username;
	private String postText;
	private int postNum;
	
	//Begin
	public Post(String name, String text, int num)
	{
		this.username = name;
		this.postText = text;
		this.postNum = num;
	}
	
	public String getName()
	{
		return this.username;
	}
	
	public String getText()
	{
		return this.postText;
	}
	
	public int getNum()
	{
		return this.postNum;
	}
	//End
}
