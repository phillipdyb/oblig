package oving10.oppgaveNy1;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    private static ArrangementRegister register = new ArrangementRegister();
    private static Scanner scanner = new Scanner(System.in);

    // Interaktiv meny
    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            visMenu();
            int valg = lesInt("Velg alternativ: ");

            switch (valg) {
                case 1:
                    registrerNyttArrangement();
                    break;
                case 2:
                    finnArrangementerPaSted();
                    break;
                case 3:
                    finnArrangementerPaDato();
                    break;
                case 4:
                    finnArrangementerIIntervall();
                    break;
                case 5:
                    visListeSortertPaSted();
                    break;
                case 6:
                    visListeSortertPaType();
                    break;
                case 7:
                    visListeSortertPaTidspunkt();
                    break;
                case 8:
                    running = false;
                    System.out.println("Avslutter programmet. Ha en fin dag!");
                    break;
                default:
                    System.out.println("Ugyldig valg. Prøv igjen.");
            }
        }

        scanner.close();
    }

    // Viser menyvalg
    private static void visMenu() {
        System.out.println("1. Registrer nytt arrangement");
        System.out.println("2. Finn arrangementer på et sted");
        System.out.println("3. Finn arrangementer på en dato");
        System.out.println("4. Finn arrangementer i tidsintervall");
        System.out.println("5. Vis alle arrangementer sortert på sted");
        System.out.println("6. Vis alle arrangementer sortert på type");
        System.out.println("7. Vis alle arrangementer sortert på tidspunkt");
        System.out.println("8. Avslutt");
    }

    // Registrerer arrangement
    private static void registrerNyttArrangement() {
        System.out.println("\nRegistrer nytt arrangement");

        System.out.print("Navn: ");
        String navn = scanner.nextLine();

        System.out.print("Sted: ");
        String sted = scanner.nextLine();

        System.out.print("Arrangør: ");
        String arrangor = scanner.nextLine();

        System.out.print("Type (konsert/barneteater/foredrag/etc): ");
        String type = scanner.nextLine();

        System.out.print("Tidspunkt (format: yyyyMMddhhmm, eks: 202511051800): ");
        long tidspunkt = scanner.nextLong();
        scanner.nextLine(); // Konsumer newline

        Arrangement nyttArrangement = new Arrangement(navn, sted, arrangor, type, tidspunkt);
        register.registrerArrangement(nyttArrangement);
    }

    // Finner arrangement på sted
    private static void finnArrangementerPaSted() {
        System.out.print("\nOppgi sted: ");
        String sted = scanner.nextLine();

        ArrayList<Arrangement> resultat = register.finnArrangementerPaSted(sted);
        visResultat(resultat, "Arrangementer på " + sted);
    }

    // Finner arrangement på dato
    private static void finnArrangementerPaDato() {
        System.out.print("\nOppgi dato (format: yyyyMMdd, eks: 20251105): ");
        long dato = scanner.nextLong();
        scanner.nextLine();

        ArrayList<Arrangement> resultat = register.finnArrangementerPaDato(dato);
        visResultat(resultat, "Arrangementer på dato " + dato);
    }

    // Finner arrangement i tidsintervall
    private static void finnArrangementerIIntervall() {
        System.out.print("\nFra dato (format: yyyyMMddhhmm): ");
        long fraDato = scanner.nextLong();

        System.out.print("Til dato (format: yyyyMMddhhmm): ");
        long tilDato = scanner.nextLong();
        scanner.nextLine();

        ArrayList<Arrangement> resultat = register.finnArrangementerIIntervall(fraDato, tilDato);
        visResultat(resultat, "Arrangementer i intervallet (sortert på tid)");
    }

    // Liste sortert på sted
    private static void visListeSortertPaSted() {
        ArrayList<Arrangement> resultat = register.listeEtterSted();
        visResultat(resultat, "Alle arrangementer sortert på sted");
    }

    // Liste sortert på type arrangement
    private static void visListeSortertPaType() {
        ArrayList<Arrangement> resultat = register.listeEtterType();
        visResultat(resultat, "Alle arrangementer sortert på type");
    }

    // Liste sortert på tidspunkt
    private static void visListeSortertPaTidspunkt() {
        ArrayList<Arrangement> resultat = register.listeEtterTidspunkt();
        visResultat(resultat, "Alle arrangementer sortert på tidspunkt");
    }

    // Viser antall arrangementer
    private static void visResultat(ArrayList<Arrangement> arrangementer, String tittel) {
        System.out.println("\n" + tittel + ":");

        if (arrangementer.isEmpty()) {
            System.out.println("Ingen arrangementer funnet.");
        } else {
            for (Arrangement a : arrangementer) {
                System.out.println(a);
            }
            System.out.println("\nAntall arrangementer: " + arrangementer.size());
        }
    }

    // Returnerer feil om man velger noe utenfor valgene i menyen
    private static int lesInt(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("Ugyldig input. " + prompt);
        }
        int verdi = scanner.nextInt();
        scanner.nextLine(); // Konsumer newline
        return verdi;
    }
}
