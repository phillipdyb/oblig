/*
Øving 6
Oppgave 3
 */

package oving6;

import java.util.Arrays;

class Matrise {
    public static void main(String[] args) {

        int[][] m1 = {
                {0, 5, 1},
                {9, 6, 7}
        };

        int[][] m2 = {
                {1, 2, 1},
                {1, 4, 1}
        };

        System.out.println("m1: " + Arrays.deepToString(m1));
        System.out.println("m2: " + Arrays.deepToString(m2));

        int[][] m3 = new int[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                m3[i][j] = m1[i][j] + m2[i][j];
            }
        }

        System.out.println("m1 + m2: " + Arrays.deepToString(m3));

        int rows = m2.length;
        int cols = m2[0].length;
        int[][] m2T = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                m2T[j][i] = m2[i][j];
            }
        }

        System.out.println("m2 transponert: " + Arrays.deepToString(m2T));

        int[][] m4 = new int[m1.length][m2T[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2T[0].length; j++) {
                for (int k = 0; k < m2T.length; k++) {
                    m4[i][j] += m1[i][k] * m2T[k][j];
                }
            }
        }

        System.out.println("m1 * m2^T: " + Arrays.deepToString(m4));

    }
}


/*
Lag en klasse Matrise. Den skal inneholde en todimensjonal tabell som svarer til en matrise i
matematikken. Lag metoder for å
• Addere en matrise til denne matrisen
• Multiplisere denne matrisen med en annen matrise
• Transponere matrisen.
Klassen skal være immutabel. Det vil si at alle metodene må lage nye metoder som returneres.
Dersom operasjonene er umulige, skal metodene returnere null.
Lag et enkelt klientprogram som kan brukes til å teste klassen.
*/
