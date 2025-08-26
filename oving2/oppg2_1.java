/*
Øving 2
Oppgave 1
*/

import java.util.Scanner;

public class oppg2_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Spør brukeren hvilket år som skal sjekkes
        System.out.print("Hvilket år vil du sjekke om det er skuddår?: ");
        int number = scanner.nextInt();
        scanner.close();

        // Sjekk og skriv ut resultatet
        String melding = erSkuddAr(number);
        System.out.println(melding);
    }

    // Egen metode for å sjekke om årstallet er et skuddår
    public static String erSkuddAr(int number) {
        if (number % 400 == 0) {
            return number + " er et skuddår!";
        }
        else if (number % 100 == 0) {
            return number + " er ikke et skuddår.";
        }
        else if (number % 4 == 0) {
            return number + " er et skuddår!";
        }
        return number + " er ikke et skuddår.";
    }
}
