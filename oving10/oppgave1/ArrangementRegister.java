package oving10.oppgave1;

public class ArrangementRegister {

    private Arrangement[] events;
    private double fromDate;
    private double toDate;


    // Register new events - Constructor
    public ArrangementRegister() {
        events = new Arrangement[20];
    }

    // Find all events in one location
    public String findEventsLocation() {
        return findEventsLocation();
    }


    // Find all events in one date


    // Find all events in a given date interval (to-from), sort on date
    public String eventsDateInterval(double fromDate, double toDate) {
        this.fromDate = fromDate;
        this.toDate = toDate;

        // for (int i;  (fromDate, toDate)); {

    }

    // Make a list for all events, sorted after location, type and date
    @Override
    public String toString() {
        return eventName + eventLocation + eventDate;
    }
}
