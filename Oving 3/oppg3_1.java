/*
Øving 3
Oppgave 1
*/

import java.util.Scanner;

public class oppg3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Spør brukeren hvilken tabell de vil ha
        System.out.print("Hvilken tabell? (13, 14, or 15): ");
        int number = scanner.nextInt();

        // Se om det er 13, 14, 15 eller ingen.
        if (number == 13 || number == 14 || number == 15) {
            System.out.println("Multiplikasjonstabell for " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }
        else
            System.out.println("Du kan kun velge 13, 14, or 15.");

        scanner.close();
    }
}
