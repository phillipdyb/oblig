/*
Øving 2
Oppgave 2
 */

public class oppg2_2 {
    public static void main(String[] args) {
        
        // Definisjoner
        double kjottdeigA = 35.90;
        double kjottdeigB = 39.50;
        double gramA = 450;
        double gramB = 500;

        // Pris per gram for kjøttdeig
        double prisA = gramA / kjottdeigA;
        double prisB = gramB / kjottdeigB;

        // True/False billigest
        boolean billigst;
        billigst = prisA < prisB;

        System.out.println("Er merke A billigere enn merke B? " + billigst);

    }
}
