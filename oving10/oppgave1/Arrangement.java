package oving10.oppgave1;

public class Arrangement {

    private String eventName;
    private String eventLocation;
    private int eventDate;

    // Constructor
    public Arrangement(String eventName, String eventLocation, int eventDate) {
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventDate = eventDate;
    }

    // Get eventName
    public String getEventName() {
        return eventName;
    }

    // Get eventLocation
    public String getEventLocation() {
        return eventLocation;
    }

    // Get eventDate
    public int getEventDate() {
        return eventDate;
    }

}
