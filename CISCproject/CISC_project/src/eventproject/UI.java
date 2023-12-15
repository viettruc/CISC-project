package eventproject;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Choice;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextField;



public class UI extends JFrame{
	
	private JPanel calendar_month;
	private JLabel title;
	private BoxLayout calendar_layer;
	private JButton prevmonth;
	private JButton nextmonth;
	private Choice monthchoice;
	private JButton setmonth;
	private JPanel pane;
	
	private JPanel daypanel;
	private GridLayout daygrid;
	
	
	
	public UI(Month month) {
	
// setup panel shape
	pane = new JPanel();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
	setTitle("Calendar App");
	title = new JLabel("Calendar Reminder app");
	pane.add(title);
	add(pane, BorderLayout.NORTH);

	
	
	
// create the first panel, which contain button to choose the month
	calendar_month = new JPanel();
	calendar_month.setLayout(new BoxLayout(calendar_month, BoxLayout.LINE_AXIS));
	prevmonth = new JButton("Previous Month");
	monthchoice = new Choice();
	monthchoice.add("January");
	monthchoice.add("Februrary");
	nextmonth = new JButton("Next Month");
	
	calendar_month.add(prevmonth);	
	calendar_month.add(monthchoice);
	calendar_month.add(nextmonth);
	
	// add button functionality
	
	pane.add(calendar_month);
	
	setmonth = new JButton("set month");
	pane.add(setmonth);
	
// create the center panel, which will contain the days of the month
	daypanel = new JPanel();
	daygrid = new GridLayout(6, 6);
	daypanel.setLayout(daygrid);
	
	for (int row = 0; row< 6; row++) {
		if (row < 5) {
			for (int col = 0; col< 6; col++) {
				// create a button
				DayButton day = new DayButton(row, col);
				// add the functionality to the buttons
			
			
				// set the text of the button
				Integer num = day.getday();
				day.setText(num.toString());
				// add the button to the panel
				daypanel.add(day);
			}
		}
		else {
			DayButton day = new DayButton(row, 0);
			// add the functionality to the buttons
		
			
			// set the text of the button
			Integer num = day.getday();
			day.setText(num.toString());
		
			// add the button to the panel
			daypanel.add(day);
				
		}
	}
	
	add(daypanel,BorderLayout.CENTER);
	
	
	
// create the bottom panel, which will contain the list of events
	
	

	
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	setSize(800, 400);
	pack();
	setVisible(true);
	}


	public static void main(String[] args)
	{
		new UI(new Month());
	}


	public void updateUI()
	{
		
	}
}


