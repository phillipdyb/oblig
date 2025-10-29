package oving10;

import java.util.Scanner;

public class Client {

    // Calling the constructor
    ArrangementRegister mod1 = new ArrangementRegister();
    Arrangement mod2 = new Arrangement();

    // Menu thingy
    Scanner in = new Scanner(System.in);

    boolean fortsett = true;

    while (fortsett) {
        // Meny
        System.out.println(
                "\nHva vil du gjøre?:\n" +
                        "1: Registrere nytt arrangement\n" +
                        "2: Finne arrangement på sted\n" +
                        "3: Finne arrangement på dato\n" +
                        "4: Finne arrangement innenfor tidsintervall\n" +
                        "5: Se alle arrangementer\n" +
                        "6: Avslutt program"
        );

        int valg = in.nextInt();

        switch (valg) {
            case 1:
                break;
            case 2:
                System.out.println("\nArrangementer på " +  + ": \n");
                break;
            case 3:
                System.out.println("\nArrangementer på " + dato + ": \n");
                break;
            case 4:
                System.out.print("Fra dato: ");
                String oldWord = scanner.nextLine();
                System.out.print("Til dato: ");
                String newWord = scanner.nextLine();
                mod1.eventsDateInterval(fraDato, tilDato);
                System.out.println("Arrangementer på dato :" + fraDato + tilDato ": \n");
                System.out.println("\nNy tekst:\n" + modified.replaceWord(fraDato, tilDato));
                break;
            case 5:
                System.out.println("\nOriginal tekst::\n" + modified.getText());
                break;
            case 6:
                fortsett = false;
                System.out.println("Avslutter...");
                continue;
            default:
                System.out.println("Ugyldig valg, prøv igjen.");
                continue;
        }
    }
    in.close();
}
