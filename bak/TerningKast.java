/*
Øving 4
Oppgave 2 - Terningspill 100
*/

import java.util.Random;

public class TerningKast {
    public static void main(String[] args) {
        int maxPoints = 100;
        int rundeNummer = 0;

        Player player1 = new Player("Spiller 1");
        Player player2 = new Player("Spiller 2");

        System.out.println("=== TERNINGSPILL 100 ===");
        System.out.println("Første spiller til 100 poeng vinner!\n");

        // Spill til en spiller når 100 poeng
        while (player1.getSumPoeng() < maxPoints && player2.getSumPoeng() < maxPoints) {
            rundeNummer++;
            System.out.println("--- Runde " + rundeNummer + " ---");

            // Spiller 1 kaster
            int kast1 = player1.kastTerningen();
            System.out.println(player1.navn + " kastet " + kast1 + " og har nå " + player1.getSumPoeng() + " poeng");

            // Sjekk om spiller 1 har vunnet
            if (player1.getSumPoeng() >= maxPoints) {
                break;
            }

            // Spiller 2 kaster
            int kast2 = player2.kastTerningen();
            System.out.println(player2.navn + " kastet " + kast2 + " og har nå " + player2.getSumPoeng() + " poeng");

            System.out.println();
        }

        // Finn vinneren
        System.out.println("=== SPILLET ER FERDIG ===");
        if (player1.getSumPoeng() >= maxPoints) {
            System.out.println(player1.navn + " vinner med " + player1.getSumPoeng() + " poeng!");
        } else {
            System.out.println(player2.navn + " vinner med " + player2.getSumPoeng() + " poeng!");
        }

        System.out.println("Spillet tok " + rundeNummer + " runder.");
    }

    public static class Player {
        private int sumPoeng = 0;
        private Random terning = new Random();
        public String navn;

        // Konstruktør
        public Player(String navn) {
            this.navn = navn;
        }

        public int kastTerningen() {
            int terningkast = terning.nextInt(6) + 1; // 1-6

            if (terningkast == 1) {
                System.out.println("  " + navn + " kastet 1 - summen nullstilles!");
                sumPoeng = 0;
            } else {
                sumPoeng += terningkast;
            }

            return terningkast;
        }

        public int getSumPoeng() {
            return sumPoeng;
        }

        public boolean erFerdig() {
            return sumPoeng >= 100;
        }
    }
}
