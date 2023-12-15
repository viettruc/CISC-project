package eventproject;

import java.util.ArrayList;

public class Day {
	private ArrayList<Event> Day;
	
	public Day() {
		Day = new ArrayList<Event>();
	}
	
	public Day(Event input) {
		Day = new ArrayList<Event>();
		Day.add(input);
	}
	
	public void addEvent(Event input) {
		Day.add(input);
	}
	
	public Event returnEvent() {
		return Day.get(0);
	}
	
	public Event returnEvent(int input) {
		return Day.get(input);
	}
	
	public String toString() {
		String result = "";
		for (int i = 0; i < Day.size(); i++) {
			result = result + Day.get(i) + " ";
		}
		return result;
	}

}
