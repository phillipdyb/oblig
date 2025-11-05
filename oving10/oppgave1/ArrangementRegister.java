package oppgave1;

import java.util.ArrayList;

public class ArrangementRegister {

    private ArrayList<Arrangement> events;

    public ArrangementRegister() {
        events = new ArrayList<>();
    }

    public void registrerArrangement(Arrangement newEvent) {
        events.add(newEvent);
    }

//    private ArrayList<Arrangement> events;

//    // Register new events - Constructor
//    public ArrangementRegister() {
//        this.events = new ArrayList<>();
//    }



//    public void registrerArrangement(String) {
//        events.add(arrangement);
//    }



}

//    // Find all events in one location
//    public String findEventsLocation() {
//        return findEventsLocation();
//    }
//
//
//    // Find all events in one date
//
//
//    // Find all events in a given date interval (to-from), sort on date
//    public String eventsDateInterval(double fromDate, double toDate) {
//        this.fromDate = fromDate;
//        this.toDate = toDate;
//
//        // for (int i;  (fromDate, toDate)); {
//
//    }
//
//    // Make a list for all events, sorted after location, type and date
