package eventproject;

import java.awt.Color;

public class Urgentevent extends Event{

	private Color color;
	
	public Urgentevent() {
		super();
		setUrgency(true);
	}
	
	public Urgentevent(String event) {
		super(event);
		setUrgency(true);
	}
	
	public Urgentevent(String event, int hour, int minute) {
		super(event, hour, minute);
	}

}
