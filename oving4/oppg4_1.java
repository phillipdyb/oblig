/*
Øving 4
Oppgave 1
*/

import java.util.Scanner;

public class oppg4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String valutaLest;
        String fraTilNOK_Lest;
        String antallPengerLest;

        // Hvilken valuta?
        System.out.println("Hvilken valuta? (1-dollar, 2-euro, 3-svenske kroner, 4-avslutt):"); 
        valutaLest = scanner.nextLine(); 

        // Hvilken valuta?
        System.out.println("Fra eller til norske kroner? (1-fra, 2-til):"); 
        fraTilNOK_Lest = scanner.nextLine();

        // Fra eller til norske kroner?
        System.out.println("Fra eller til norske kroner? (1-fra, 2-til):"); 
        fraTilNOK_Lest = scanner.nextLine();

        // Hvor mye penger?
        System.out.println("Hvor mye penger?"); 
        antallPengerLest = scanner.nextLine();

        // Endre fra String til Double
        double valuta= Double.parseDouble(valutaLest);
        double fraTilNOK= Double.parseDouble(fraTilNOK_Lest);
        double antallPenger= Double.parseDouble(antallPengerLest);

        // Valutakonvertering.
        public static boolean erPrimtall(int valuta) {
        if (valuta == 1) 
            return;

        }
        
        scanner.close();
    }
}
