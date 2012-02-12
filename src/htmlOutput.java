import java.io.File;
import java.util.ArrayList;

import com.hp.gagawa.java.elements.Body;
import com.hp.gagawa.java.elements.Html;
import com.hp.gagawa.java.elements.Text;


public class htmlOutput {
    //input is list of events.
    
    public File makeOutput(ArrayList<Event> processedEvents) {
        File out = new File("~/Desktop/TiVOOoutput.html");
        
        for (Event e : processedEvents) {
            //TODO: take string from outputEvent(e), write it to File out.
            outputEvent(e);
        }
        return out;
    }
    
    public String outputEvent(Event e) {
        //creates string of html
        Html html = new Html();
        Body body = new Body();
        
        Text eventText = new Text("Name of Event:" + e.myName + "\n" + "Location:" + e.myLocation + "\n" + "Description:" + e.myDescription);
        body.appendChild(eventText);
        html.appendChild(body);
        return html.write();
       
        
    }
    
}
