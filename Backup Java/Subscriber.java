import java.util.ArrayList;

public class Subscriber {

	private ArrayList forums;

	private String username;

	private EventNotification eventNotification;

	private Event[] event;

	public boolean Notify() {
		return false;
	}

	/**
	 * Calls attachSubscriber, adds forum to forums attribute
	 */
	public boolean subscribe(String forum) {
		return false;
	}

	/**
	 * Calls detachSubscriber, adds forum to forums attribute
	 */
	public boolean unsubscribe(String forum) {
		return false;
	}

}
