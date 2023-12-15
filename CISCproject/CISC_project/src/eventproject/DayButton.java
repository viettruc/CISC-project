package eventproject;

import javax.swing.JButton;

public class DayButton extends JButton{
	private int daynumber;
	private int xcoordinate;
	private int ycoordinate;
	
	public DayButton(int row, int column) {
		daynumber = row * 6 + (column + 1);
		xcoordinate = row;
		ycoordinate = column;
	}
	
	public int getday() {
		return daynumber;
	}

}
