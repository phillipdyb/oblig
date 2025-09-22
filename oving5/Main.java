/*
Øving 5
Oppgave 1
 */

public class Main {
    public static void main(String[] args) {


        // Klasse Brøk
        class Fraction {
            public int teller;
            public int nevner;

            // Konstruktør
            public Fraction(int teller, int nevner) {
                if (nevner == 0) {
                    throw new IllegalArgumentException();
                }
                this.teller = teller;
                this.nevner = nevner;
            }

            // Konstruktør
            public Fraction(int teller) {
                this.teller = teller;
                this.nevner = 1;
            }

            // Summering brøk
            public void add(Fraction fraction2) {
                if (this.nevner == fraction2.nevner) {
                    this.teller += fraction2.teller;
                }
                else {
                    this.teller = this.teller * fraction2.nevner;
                    this.nevner = this.nevner * fraction2.nevner;
                    this.teller += fraction2.teller * this.nevner;
                }
            }

            // Subtrahere brøk
            public void subtract(Fraction fraction3) {
                if (this.nevner == fraction3.nevner) {
                    this.teller -= fraction3.teller;
                }
                else {
                    this.teller = this.teller * fraction3.nevner;
                    this.nevner = this.nevner * fraction3.nevner;
                    this.teller = this.teller - (fraction3.teller * this.nevner);
                }
            }

            // Multiplisere brøk
            public void multiply(Fraction fraction4) {
                this.teller = this.teller * fraction4.teller;
                this.nevner = this.nevner * fraction4.nevner;
            }

            // Dividere brøk
            public void divide(Fraction fraction5) {
                this.teller = this.teller * fraction5.nevner;
                this.nevner = this.nevner * fraction5.teller;
            }
        }

        Fraction full_fraction = new Fraction(2, 2);
        Fraction partial_fraction = new Fraction(5);

        full_fraction.add(partial_fraction);
        System.out.println("Summert brøk = " + full_fraction.teller + " / " + full_fraction.nevner);

        full_fraction.subtract(partial_fraction);
        System.out.println("Subtrert brøk = " + full_fraction.teller + " / " + full_fraction.nevner);

        full_fraction.multiply(partial_fraction);
        System.out.println("Multiplisert brøk = " + full_fraction.teller + " / " + full_fraction.nevner);

        full_fraction.divide(partial_fraction);
        System.out.println("Dividert brøk = " + full_fraction.teller + " / " + full_fraction.nevner);

    }
}

/*
Klassen skal ha to konstruktører:
• Den ene konstruktøren tar teller og nevner som argument. Hvis nevneren er 0, skal et
unntaksobjekt av typen IllegalArgumentException kastes.
• Den andre konstruktøren tar kun telleren som argument. Da skal nevneren settes lik 1.
Klassen skal ha get-metoder, men ikke set-metoder.

Klassen skal ha metoder for å summere, subtrahere, multiplisere og dividere en brøk (this)
med en annen brøk (parameter til metoden). Metodene har ikke returverdi, men etter at
operasjonen er utført, ligger resultatet i this.
Lag testklient som del av klassen.
 */
