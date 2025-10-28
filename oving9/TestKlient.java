package oving9;

public class TestKlient {

    public static void main(String[] args) {

        // Oppretter en student
        Student s1 = new Student("Ole Hansen");


        System.out.println("Ny student opprettet:");
        System.out.println(s1);

        // Øker antall oppgaver
        s1.økAntOppg(3);
        System.out.println("\nEtter å ha levert 3 oppgaver:");
        System.out.println(s1);

        s1.økAntOppg(2);
        System.out.println("\nEtter å ha levert 2 oppgaver til:");
        System.out.println(s1);

        // Tester get-metodene
        System.out.println("\nNavn: " + s1.getNavn());
        System.out.println("Antall oppgaver: " + s1.getAntOppg());
    }
}
