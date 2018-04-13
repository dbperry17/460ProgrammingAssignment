public class Subscriber {

	private String forums[0..*];

	private String username;

	private EventNotification eventNotification;

	private Event[] event;

	public boolean Notify() {
		return false;
	}

	public boolean printOutput(Event e) {
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
