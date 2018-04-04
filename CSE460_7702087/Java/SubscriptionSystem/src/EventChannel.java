import java.util.ArrayList;

public class EventChannel {

	private ArrayList subs;

	private ArrayList availForums;

	private ArrayList threads;

	public boolean newSub(String user, String forum) {
		return false;
	}

	public boolean sendAlert() {
		return false;
	}

	public boolean createForum(String name) {
		return false;
	}

	public boolean newPost(String user, String forum, String title, String text) {
		return false;
	}

}
