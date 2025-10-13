/*
Øving 7
Oppgave 2
 */

package oving7;


import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TextProcessing {

    private String originalText;

    // Konstruktør
    public TextProcessing(String text) {
        this.originalText = text;
    }

    // Finne antall ord i teksten
    public int getWordCount() {
        String[] words = originalText.split("[,\\.\\s]+");
        int count = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }
        return count;
    }

    // Gjennomsnittlig ordlengde
    public double getAverageWordLength() {
        String[] words = originalText.split("[^\\p{L}]+");
        int totalLength = 0;
        int wordCount = 0;

        for (String word : words) {
            if (!word.isEmpty()) {
                totalLength += word.length();
                wordCount++;
            }
        }

        if (wordCount == 0) {
            return 0.0;
        }
        return (double) totalLength / wordCount;
    }

    // Gjennomsnittlig antall ord per periode
    public double getAverageWordsPerPeriod() {
        // Splitt på punktum, utropstegn, kolon og spørsmålstegn
        String[] periods = originalText.split("[.!:?]");

        int totalWords = 0;
        int periodCount = 0;

        for (String period : periods) {
            String[] words = period.split("[^\\p{L}]+");
            int wordsInPeriod = 0;

            for (String word : words) {
                if (!word.isEmpty()) {
                    wordsInPeriod++;
                }
            }

            if (wordsInPeriod > 0) {
                totalWords += wordsInPeriod;
                periodCount++;
            }
        }

        if (periodCount == 0) {
            return 0.0;
        }
        return (double) totalWords / periodCount;
    }

    // Find and replace
    public String replaceWord(String oldWord, String newWord) {
        return originalText.replaceAll("\\b" + oldWord + "\\b", newWord);
    }

    // Hente ut tekst uten endring
    public String getText() {
        return originalText;
    }

    // Bytte hele tkesten til CAPS
    public String getTextUpperCase() {
        return originalText.toUpperCase();
    }

}

// Klasse "Client"
public class Oppg7_2 {
    public static void main(String[] args) {

        // Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv en setning: ");
        String text = scanner.nextLine();

        // Calling the constructor
        TextProcessing modified = new TextProcessing(text);

        // Menu thingy
        Scanner in = new Scanner(System.in);

        boolean fortsett = true;

        while (fortsett) {
            // Meny
            System.out.println(
                    "\nHva vil du gjøre?:\n" +
                            "1: Finne antall ord i teksten\n" +
                            "2: Finne gjennomsnittlig ordlengde\n" +
                            "3: Finne gjennomsnittlig antall ord per periode\n" +
                            "4: Finne og bytte ut et ord\n" +
                            "5: Hente ut tekst uten endring\n" +
                            "6: Hente ut tekst med alt i store bokstaver\n" +
                            "7: Avslutt program"
            );

            int valg = in.nextInt();

            // Valuta valgtValuta = null;

            switch (valg) {
                case 1:
                    System.out.println("\nAntall ord i teskten:\n" + modified.getWordCount());
                    break;
                case 2:
                    System.out.println("\nGjennomsnittlig ordlengde:\n" + modified.getAverageWordLength());
                    break;
                case 3:
                    System.out.println("\nGjennomsnittlig ord per periode:\n" + modified.getAverageWordsPerPeriod());
                    break;
                case 4:
                    System.out.print("Skriv ordet som skal byttes ut: ");
                    String oldWord = scanner.nextLine();
                    System.out.print("Skriv det nye ordet: ");
                    String newWord = scanner.nextLine();
                    modified.replaceWord(oldWord, newWord);
                    System.out.println("Ordet er byttet ut!");
                    System.out.println("\nNy tekst:\n" + modified.replaceWord(oldWord, newWord));
                    break;
                case 5:
                    System.out.println("\nOriginal tekst::\n" + modified.getText());
                    break;
                case 6:
                    System.out.println("\nTekst i store bokstaver:\n" + modified.getTextUpperCase());
                    break;
                case 7:
                    fortsett = false;
                    System.out.println("Avslutter...");
                    continue;
                default:
                    System.out.println("Ugyldig valg, prøv igjen.");
                    continue;
            }
        }
        scanner.close();
    }
}

/*
Lag en klasse for enkel tekstbehandling. Konstruktøren skal ta en tekst som argument.
Klassen skal tilby følgende tjenester:
• Å finne antall ord i teksten.
• Å finne gjennomsnittlig ordlengde. Skilletegn er ikke en del av ordene.
• Å finne gjennomsnittlig antall ord per periode. Bruk punktum, utropstegn, kolon og
spørretegn som skilletegn mellom periodene. Anta at teksten er feilfri, slik at ikke to
eller flere slike tegn følger etter hverandre.
• Å skifte ut et ord med et annet gjennom hele teksten. For eksempel kan en ønske å
skifte ut ordet «finnes» med «fins».
• Å hente ut teksten slik den står, uten endringer.
• Å hente ut teksten, men slik at alle bokstaver er store.
Lag en enkel testklient. Husk å prøve klassen for tekster som inneholder æ, ø og å.
*/
