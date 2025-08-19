class oppgtavle {
public static void main (String[] args){

        final int ANTALL_ÅR = 35;
        double Beløp = 40.95;
        final double EN_KONSTANT = 789.6;
        double tall = 15.7;
        Beløp = Beløp * 100;

        int a = 10;
        int b = 5;
        int c = 3;
        int d = 2;
        double p = 2.8;
        double q = 3.3;

        int oppga = c + d * a;
        int oppgb = a * b / c + a;
        int oppgc = c % d;
        int oppgd = d % c;
        double oppge = p % q;
        double oppgf = q % p;
        int oppgg = c % d % a + b / c;
        int oppgh = a = b = 16;

        double en = 0.1;
        double to = 0.2;

        double valuta = en + to;

        System.out.println(valuta);

    }
}