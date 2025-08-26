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
        boolean erSkuddAr = erSkuddAr(number);
        System.out.println("Er " + number + " et skuddår? " + erSkuddAr);
    }

    // Egen metode for å sjekke om årstallet er et skuddår
    public static boolean erSkuddAr(int number) {
        if (number % 400 == 0) {
            return true;
        }
        else if (number % 4 == 0) {
            return true;
        }
        return false;
    }
}
