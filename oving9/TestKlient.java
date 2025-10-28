package oving9;

public class TestKlient {

    public static void main(String[] args) {

        // Kaller konstruktøren
        OppgaveOversikt oversikt = new OppgaveOversikt();

        // Registrerer en student
        oversikt.registrerStudent("Ole Hansen");

        // Print
        System.out.println("Ny student registrert:");
        System.out.println(oversikt);

        // Øker antall oppgaver via oversikten
        oversikt.økOppgaver("Ole Hansen", 3);
        System.out.println("\nEtter å ha levert 3 oppgaver:");
        System.out.println(oversikt);

        // Print antall studenter
        System.out.println("Antall studenter: " + oversikt.getAntStud());

        // Øker antall oppgaver igjen
        oversikt.økOppgaver("Ole Hansen", 2);
        System.out.println("\nEtter å ha levert 2 oppgaver til:");
        System.out.println(oversikt);
    }
}
