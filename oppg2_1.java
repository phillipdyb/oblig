/*
Øving 2
Oppgave 1
 */

import java.util.Scanner;

public class oppg2_1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        // Input av årstall (antall år fra år 0)
        System.out.println("Årstall??"); 
        int year = myObj.nextInt();

        // Matte
        int leapYear = year / 4; // Delelig på 4
        int restAfterYear = year % 4; // Resten etter timer

        // Print
        System.out.println(leapYear + " antall skuddår, " 
            + restAfterYear + " rest år.");

    }
}
