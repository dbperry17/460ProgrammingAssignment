public class EventNotification {

	private Subscriber[] subscribers;

	/**
	 * First index indicates index in availForums attribute in EventPool class.
	 * 
	 * Second index lists subscribers in order subscribed.
	 */
	private int[][] subscriptions;

	/**
	 * Attaches a new user as a publisher
	 */
	public boolean attachPublisher() {
		return false;
	}

	/**
	 * Subscribes a user to a forum
	 */
	public boolean attachSubscriber() {
		return false;
	}

	/**
	 * Calls Notify for Subscriber
	 */
	public boolean pushEvent(Event ev) {
		return false;
	}

	/**
	 * Unsubscribes a user to a forum
	 */
	public boolean detachSubscriber() {
		return false;
	}

}
