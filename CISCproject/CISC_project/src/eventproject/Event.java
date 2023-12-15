package eventproject;
//create Event class
public class Event {
	private String event;
	private int hour;
	private int minute;
	private boolean urgency;
	
// create null constructor
	public Event() {
		System.out.print("empty input, try again");
	}
	
	public Event(String input) {
		event = input;
		hour = 0;
		minute =0;
		setUrgency(false);
	}
	
	public Event (String input, int hour, int minute) {
		event = input;
		this.hour = hour;
		this.minute = minute;
		
	}
	
	public void changeevent(String input) {
		event = input;
	}
	
	public void changetime(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
	
	public String getevent() {
		return event;
	}
	
	public int gethour() {
		return hour;
	}
	
	public int getminute() {
		return minute;
	}

	public boolean isUrgency() {
		return urgency;
	}

	public void setUrgency(boolean urgency) {
		this.urgency = urgency;
	}
	
	public String toString() {
		return event + " " + hour + " " + minute;
	}
	


}
