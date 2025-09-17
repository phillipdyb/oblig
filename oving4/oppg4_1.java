/*
Øving 4
Oppgave 1
*/

import java.util.Scanner;

// Klassen Valuta
class Valuta {
    private String navn;
    private double kurs; // Hvor mange NOK per 1 enhet av valutaen

    // Konstruktør
    public Valuta(String navn, double kurs) {
        this.navn = navn;
        this.kurs = kurs;
    }

    // Fra valuta til NOK
    public double tilNok(double belop) {
        return belop * kurs;
    }

    // Fra NOK til valuta
    public double fraNok(double belop) {
        return belop / kurs;
    }

    public String getNavn() {
        return navn;
    }
}

// Klientprogram
public class oppg4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Oppretter valuta-objekter (eksempel med omtrentlige kurser)
        Valuta dollar = new Valuta("Dollar", 10.50);
        Valuta euro = new Valuta("Euro", 11.20);
        Valuta sek = new Valuta("Svenske kroner", 1.02);

        boolean fortsett = true;

        while (fortsett) {
            // Meny
                System.out.println(
                    "\nVelg valuta:\n" +
                    "1: Dollar\n" +
                    "2: Euro\n" +
                    "3: Svenske kroner\n" +
                    "4: Avslutt"
                );

            int valg = in.nextInt();

            Valuta valgtValuta = null;

            switch (valg) {
                case 1:
                    valgtValuta = dollar;
                    break;
                case 2:
                    valgtValuta = euro;
                    break;
                case 3:
                    valgtValuta = sek;
                    break;
                case 4:
                    fortsett = false;
                    System.out.println("Avslutter...");
                    continue;
                default:
                    System.out.println("Ugyldig valg, prøv igjen.");
                    continue;
            }

            // Spør brukeren
            System.out.println("Vil du regne fra (1) valuta til NOK eller (2) NOK til valuta?");
            int retning = in.nextInt();

            System.out.println("Oppgi beløp:");
            double belop = in.nextDouble();

            if (retning == 1) {
                double resultat = valgtValuta.tilNok(belop);
                System.out.printf("%.2f %s = %.2f NOK%n", belop, valgtValuta.getNavn(), resultat);
            } else if (retning == 2) {
                double resultat = valgtValuta.fraNok(belop);
                System.out.printf("%.2f NOK = %.2f %s%n", belop, resultat, valgtValuta.getNavn());
            } else {
                System.out.println("Ugyldig valg for retning.");
            }
        }

        in.close();
    }
}
