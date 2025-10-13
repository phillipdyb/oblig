/*
Øving 7
Oppgave 1
 */

package oving7;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class NyString {

    String regex = "[,\\.\\s]";
    String[] myArray;
    
    // Constructor for First Letter in every word in the sentence
    public NyString(String text) {
        myArray = text.split(regex);
    }

    // Function to return the first letter of words in the "myArray"
    public String firstLetter() {
        String firstLetter = "";

        for (String s : myArray) {
            firstLetter += s.charAt(0);
        }
        return firstLetter;
    }

    // Function that removes certain letters from a sentence
    public String removedLetters(char letter) {
        List<String> newArray = new ArrayList<>();

        for (String s : myArray) {
            newArray.add(s.replace(String.valueOf(letter), ""));
        }
        return String.join(" ", newArray);
    }
}

class Client{
    static void main(String[] args) {

        // Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv en setning du vil forkorte: ");
        String text = scanner.nextLine();

        // Calling the constructor
        NyString modified = new NyString(text);

        // Print first letters for the sentence
        System.out.print(modified.firstLetter());

        // Remove and print the removed letters from the sentence
        System.out.println("\nFjern en bokstav fra setningen: ");
        char letter = scanner.nextLine().charAt(0);
        System.out.println(modified.removedLetters(letter));

        scanner.close();

    }
}

/*
Klassen String inneholder mange metoder. Vi skal nå lage noen flere.
Lag en klasse som heter NyString. Den skal ha en objektvariabel av klassen String. Klassen
NyString skal være immutabel og tilby følgende tjenester:
• Konstruktør som tar et objekt av klassen String som argument.
• Forkorting. Forkortingen skal skje ved at første tegn i hvert ord plukkes ut. Bruk
mellomrom som skille mellom ordene. Eksempel: «denne setningen kan forkortes»
skal forkortes til «dskf». Tips: Bruk String-metoden split(), som returnerer en tabell
med ordene som teksten består av: String() ord = tekst.split()
• Fjerning av tegn. Eksempel: Dersom tegnet ‘e’ fjernes fra teksten «denne setningen
kan forkortes», står vi igjen med «dnn stningn kan forkorts». Tips: Bruk en whileløkke og for eksempel String-metodene indexOf() og substring().
*/
