import java.util.ArrayList;



public class Main {
	
	public static void main (String args[]) {
		ArrayList<Event> myEvents = xmlParse.parse("http://www.cs.duke.edu/courses/cps108/current/assign/02_tivoo/data/dukecal.xml");
		System.out.println(myEvents.toString());
	}
}
