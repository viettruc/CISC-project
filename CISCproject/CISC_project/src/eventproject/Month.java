package eventproject;

import java.util.ArrayList;
import java.util.Hashtable;

public class Month {
	private Hashtable<String, Day> month;
	
	public Month() {
		month = new Hashtable<String, Day>();

		
	}
	
//	public Month(String input1, Day input2) {
//		month = new Hashtable<String, Day>();
//		Month.addDay(input1, input2);
//	}
	
	public void addDay(String input1, Day input2) {
		month.put(input1, input2);
	}
	
//	public Calendar returnDay() {
//		return month.get();
//	}
	
	public Day returnDay(String input) {
		return month.get(input);
	}

}