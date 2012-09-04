package swtTestApp;

public class State2 {
	private Integer requestsInterval = 7000;

	public Integer getRequestsInterval() {
		System.out.println("getting requestsInterval");
		return requestsInterval;
	}

	public void setRequestsInterval(Integer requestsInterval) {
		System.out.println("setting requestsInterval: " + requestsInterval);
		this.requestsInterval = requestsInterval;
	}

}
