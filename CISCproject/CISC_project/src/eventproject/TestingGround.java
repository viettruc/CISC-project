package eventproject;

public class TestingGround {

	public static void main(String[] args) {
		Day day1 = new Day(); 
		Event event1 = new Event("test1");
		Event event2 = new Event("test2", 1, 12);
		day1.addEvent(event1);
		day1.addEvent(event2);
		System.out.println(event1);
		System.out.println(day1);
		System.out.println(day1.returnEvent(0));
		System.out.println(day1.returnEvent(1));
		

	}

}
