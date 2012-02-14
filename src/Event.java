
public class Event {
    public String myName;
    public String myLocation;
    public String myDescription;
    public String myStartTime;
    public String myEndTime;
    
    public Event(String name, String location, String description, String startTime, String endTime) {
        myName = name;
        myLocation = location;
        myDescription = description;
        myStartTime = startTime;
        myEndTime = endTime;
    }
    
    public String toString(){
    	return "Event[" + myName + ", " + myLocation + ", " + myDescription + "]\n";
    }
    
}
