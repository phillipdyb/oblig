/*
Øving 6
Oppgave 1
 */

package oving6;

import java.util.Random;

public class Oppg6_1 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] antall = new int[10]; // array for å telle forekomster
        int count = 0;

        // Generer 1000 tilfeldige tall
        while (count < 1000) {
            int tall = random.nextInt(10); // generer nytt tall for hver iterasjon
            antall[tall]++; // øk telleren for dette tallet
            count++;
        }

        // Skriv ut resultatene
        System.out.println("Antall forekomster av hvert tall:");
        for (int i = 0; i < antall.length; i++) {
            System.out.println("Tall " + i + ": " + antall[i] + " ganger");
        }
    }
}

/*
Fra programmeringsoppgaver kjenner du kanskje nå klassen java.util.Random.
Lag et objekt av klassen:
Java.util.Random random = new java.util.Random(); // vi lager en tilfeldigtallgenerator
Setningen
Int tall = random.nextInt(10);
gir en verdi i intervallet (0, 9).
Opprett en tabell
Int antall = new int(10);
Lag et program som går i løkke for eksempel 1000 ganger og henter ut tilfeldige tall. I
tabellen antall skal du lagre antall ganger hvert enkelt av tallene 0, 1, …, 9 er hentet ut.
Til slutt skriver du ut en liste over antall forekomster av hvert enkelt av de ti tallene. Prøv
gjerne også programmet med 5000 og 10 000 gjennomløp av løkken
*/
