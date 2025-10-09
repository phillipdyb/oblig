/*
Øving 6
Oppgave 2
 */

package oving6;

import java.util.Scanner;

class TextAnalysis {

    private int[] characterCount = new int[30];

    public TextAnalysis(String text) {
        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));

            if (ch >= 'a' && ch <= 'z') {
                characterCount[ch - 'a']++;
            }
            else if (ch == 'æ') {
                characterCount[26]++;
            }
            else if (ch == 'ø') {
                characterCount[27]++;
            }
            else if (ch == 'å') {
                characterCount[28]++;
            }
            else {
                characterCount[29]++;
            }
        }
    }

    public int getNumberOfDifferentLetters() {
        int count = 0;
        for (int i = 0; i < 29; i++) {
            if (characterCount[i] > 0) count++;
        }
        return count;
    }

    public int getTotalLetters() {
        int total = 0;
        for (int i = 0; i < 29; i++) {
            total += characterCount[i];
        }
        return total;
    }

    public double getPercentageNonLetters() {
        int total = getTotalLetters() + characterCount[29];
        return total == 0 ? 0 : (characterCount[29] * 100.0) / total;
    }

    public int getOccurrences(char letter) {
        char ch = Character.toLowerCase(letter);
        if (ch >= 'a' && ch <= 'z') return characterCount[ch - 'a'];
        if (ch == 'æ') return characterCount[26];
        if (ch == 'ø') return characterCount[27];
        if (ch == 'å') return characterCount[28];
        return 0;
    }

    public String getMostFrequentLetters() {
        int max = 0;
        for (int i = 0; i < 29; i++) {
            if (characterCount[i] > max) max = characterCount[i];
        }

        if (max == 0) return "Ingen";

        String result = "";
        String letters = "abcdefghijklmnopqrstuvwxyzæøå";

        for (int i = 0; i < 29; i++) {
            if (characterCount[i] == max) {
                result += letters.charAt(i) + " ";
            }
        }
        return result + "(" + max + " ganger)";
    }
}

class Client {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Skriv inn tekst: ");
            String text = scanner.nextLine();

            TextAnalysis analysis = new TextAnalysis(text);

            System.out.println("\nForskjellige bokstaver: " + analysis.getNumberOfDifferentLetters());
            System.out.println("Totalt antall bokstaver: " + analysis.getTotalLetters());
            System.out.printf("Prosent ikke-bokstaver: %.1f%%\n", analysis.getPercentageNonLetters());
            System.out.println("Mest brukt: " + analysis.getMostFrequentLetters());

            System.out.print("\nSjekk bokstav: ");
            char letter = scanner.nextLine().charAt(0);
            System.out.println("'" + letter + "' forekommer " + analysis.getOccurrences(letter) + " ganger");

            scanner.close();
    }
}

/*
I denne oppgaven skal du lage en klasse for tekstanalyse. Teksten er et objekt av klassen
String, og du får tak i tegnet på en bestemt posisjon ved å bruke metoden charAt(). Lengden
av teksten er gitt ved metoden length(). Følgende kodebit illustrerer bruken av metodene
charAt() og length() og gir også tips om hvordan resten av oppgaven kan løses (a-z og A-Z
ligger rett etter hverandre i Unicode-tegnsettet).
Som objektvariabel i klassen Tekstanalyse skal du ha en tabell av int:
Int antallTegn = new int(30)
I denne tabellen gjelder at indeks 0-28 inneholder antall forekomster i en tekst av bokstavene
a-å, mens indeks 29 inneholder antall forekomster av alle andre tegn enn bokstaver, for
eksempel mellomrom, komma og punktum. Vi skiller ikke mellom store og små utgaver av en
bokstav.
Konstruktøren skal ta den aktuelle teksten som argument og fylle opp tabellen antallTegn med
antall tegn av hver type. Etter at tabellen antallTegn er fylt opp, skal en klient kunne få utført
følgende tjenester:
• Finn antall forskjellige bokstaver i teksten. Her ser vi altså bort fra alle andre tegn enn
bokstaver.
• Finn totalt antall bokstaver i teksten.
• Hvor stor del av teksten (prosent) er ikke bokstaver?
• Finn antall forekomster av en bestemt bokstav. Bokstaven skal være parameter til
metoden.
• Hvilken – eller hvilke, om det er flere som forekommer like ofte – bokstaver
forekommer oftest i teksten?
Lag et klientprogram som går i løkke. I hvert løkkegjennomløp skal klienten skrive inn en
tekst, og resultatet av alle analysene foran skal skrives ut.
*/
