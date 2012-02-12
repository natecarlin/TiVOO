import java.io.IOException;
import java.util.ArrayList;



public class Main {
	
	public static void main (String args[]) throws IOException {
		ArrayList<Event> myEvents = xmlParse.parse("http://www.cs.duke.edu/courses/cps108/current/assign/02_tivoo/data/dukecal.xml");
		//TODO: Gang or Nathan: implement the Processing part.  The input is myEvents, the output should also be myEvents.
		htmlOutput.makeOutput(myEvents);
		System.out.println(myEvents.toString());
	}
}
