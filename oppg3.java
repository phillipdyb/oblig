/*
Øving 1
Oppgave 3
 */

import java.util.Scanner; // import the Scanner class

public class oppg3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        // Legg til hvor mange sekunder
        System.out.println("Hvor mange sekunder?"); 
        int totaltSekunder = myObj.nextInt();   

        // Matte
        int timer = totaltSekunder / 3600; // Finner timer
        int restEtterTimer = totaltSekunder % 3600; // Resten etter timer
        int minutter = restEtterTimer / 60;        // Finner minutter
        int sekunder = restEtterTimer % 60;        // Resten etter minutter

        // Print
        System.out.println(totaltSekunder + " sekunder = " 
            + timer + " t " 
            + minutter + " m " 
            + sekunder + " s");

    }
}
