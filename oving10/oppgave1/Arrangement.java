package oppgave1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Arrangement {

    public String eventName;
    private String eventLocation;
    private String eventType;
    private String eventOrganizer;
    private long eventDate;

//    // Constructor
//    public Arrangement(String eventName, String eventLocation, long eventDate) {
//        this.eventName = eventName;
//        this.eventLocation = eventLocation;
//        this.eventType = eventType;
//        this.eventOrganizer = eventOrganizer;
//        this.eventDate = eventDate;
//    }

    public Arrangement(String eventName) {
        this.eventName = eventName;
    }

    // Get eventName
    public String getEventName() {
        return eventName;
    }

    // Get eventLocation
    public String getEventLocation() {
        return eventLocation;
    }

    // Get eventType
    public String getEventType() {
        return getEventType();
    }

    // Get eventOrganizer
    public String getEventOrganizer() {
        return getEventOrganizer();
    }

    // Get eventDate
    public long getEventDate() {
        return eventDate;
    }

    @Override
    public String toString() {
        return String.format("Navn: %s%nSted: %s%nDato: %s%n",
                eventName, eventLocation, eventDate);
    }
}
