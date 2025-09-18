/*
Øving 4
Oppgave 2
*/

import java.util.Random;

public class oppg4_2 {
    public static void main(String[] args) {

        int maxPoints = 100;

        player player1 = new player("Spiller 1");
        player player2 = new player("Spiller 2");

        while (!player1.isDone() && !player2.isDone()) {
            player1.throwDice();
            System.out.println(player1.name + " har " + player1.getSumPoints() + " poeng.");
            if (player1.isDone()) {
            break;
            }
            player2.throwDice();
            System.out.println(player2.name + " har " + player2.getSumPoints() + " poeng.");
        }

        if (player1.isDone()) {
            System.out.println(player1.name + " vinner!");
        }
        else {
            System.out.println(player2.name + " vinner!");
        }
    }

    public static class player {
        int points = 0;
        public String name;

        // Konstruktør
        public player(String name) {
            this.name = name;
        }

        public void throwDice() {
            Random random = new java.util.Random();
            int diceRandom = random.nextInt(6)+1;
            points = points + diceRandom;

            if (diceRandom == 1) {
                points = 0;
                System.out.println(name + " rullet 1 og poengsummen ble nullstilt.");
            }
        }

        public int getSumPoints() {
            return points;
        }

        public boolean isDone() {
            return points >= 100;
        }
    }
}

/*
Random diceRandom= new java.util.Random();

      final int limit4 = 100;
  
      Random numberGen = new Random();
      int number = numberGen.nextInt(limit4 + 1); 
      while (number < limit4 ) {
        System.out.println(number);
        number = numberGen.nextInt(limit4 + 1);
      }
      System.out.println("tall til vi fant et ugyldig: " + number);



kastTerningen()
Java.util.Random terning= new java.util.Random();
Int terningkast = terning.nextint(6);
Java.util.Random terning= new java.util.Random(); // vi lager en tilfeldigtallgenerator
I metoden kastTerningen() henter du et tilfeldig tall i intervallet (0, 5) på følgende måte:
Int terningkast = terning.nextint(6);

Du skal programmere terningspillet 100 med to spillere, A og B.

Reglene er som følger:
A og B kaster terningen annenhver gang. Antall øyne på terningen er antall poeng oppnådd i
denne runden. Poengene summeres fortløpende. Dersom en spiller kaster 1, settes summen
tilbake til 0. Den som først passerer 100 poeng, har vunnet spillet.

Lag en klasse som simulerer en spiller. Den kan han sumPoeng som objektvariabel og
metoder som heter getSumPoeng(), kastTerningen() og erFerdig().
For å simulere terningen skal du bruke klassen java.util.Random fra java-API-et. Denne
klassen brukes til å lage rekker med tilfeldige tall. La et objekt av klassen være
objektvariabel:
Java.util.Random tering= new java.util.Random(); // vi lager en tilfeldigtallgenerator
I metoden kastTerningen() henter du et tilfeldig tall i intervallet (0, 5) på følgende måte:
Int terningkast = terning.nextint(6);

Legg til 1 for å få et gyldig terningkast.
Lag et klientprogram som oppretter to objekter av klassen, ett for hver av spillerne. Lag en
løkke som kjører inntil en av spillerne har vunnet. I hvert gjennomløp av løkken skal hver
spiller kaste terningen en gang. Skriv ut rundenummer og poengsummene til hver av spillerne
i hvert gjennomløp. Det er sannsynligvis mest praktisk å skrive til kommandovinduet her.

## En raffinering av spillet kan være å kreve at man skal komme akkurat til 100. Dersom denne
grensa er passert, skal neste kast trekkes fra poengsummen. Hvis man nå havner akkurat på
100, er man ferdig. Ellers legges neste kast til, og slik holder man på og legger til og trekker
fra inntil man kommer akkurat til 100.
*/
