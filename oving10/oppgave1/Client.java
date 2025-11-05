package oppgave1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {

        // Calling the constructor
        ArrangementRegister mod1 = new ArrangementRegister();
        System.out.println("Arrangement registrert!");


        // Register event
        mod1.registrerArrangement("Festningen");
        mod1.registrerArrangement("");
        mod1.registrerArrangement();

        // Print event in a specific place


        // Print events on a specific date


        // Print all events in a specific date range


        // Print a list of all the arrangements, sorted on place, type and date


    }
}
