/*
Øving 4
Oppgave 2
*/

import java.util.Random;

public class oppg4_2 {
    public static void main(String[] args) {

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
