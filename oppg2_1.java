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
        int leapCenturies = year / 400; // Delelig på 400
        int restAfterCenturies = year % 400; // Resten etter skuddårhundre
        int leapYears = restAfterCenturies / 4; // Finner resten av skuddårene
        int restAfterLeapYears = restAfterCenturies % 4; // Resten etter skuddår

        // Print
        System.out.println(leapCenturies + " antall skuddårhundre, " 
            + "plus " + leapYears + " antall skuddår. " 
            + restAfterLeapYears + " rest.");

    }
}
