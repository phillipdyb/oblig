/*
Øving 3
Oppgave 2
*/

import java.util.Scanner;

public class oppg3_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Spør brukeren hvilket tall som skal sjekkes
        System.out.print("Hvilket tall vil du sjekke om det er primtall?: ");
        int number = scanner.nextInt();
        scanner.close();

        // Sjekk og skriv ut resultatet
        boolean erPrimtall = erPrimtall(number);
        System.out.println("Er " + number + " et primtall? " + erPrimtall);
    }

    // Egen metode for å sjekke om et tall er primtall
    public static boolean erPrimtall(int number) {
        if (number <= 1) 
            return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}