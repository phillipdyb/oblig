package oppgave2;

import java.util.ArrayList;

public class Meny {
    private String navn;
    private ArrayList<Rett> retter;

    // Konstruktør
    public Meny(String navn, ArrayList<Rett> retter) {
        this.navn = navn;
        this.retter = retter;
    }

    // Get navn
    public String getNavn() {
        return navn;
    }

    // Get retter
    public ArrayList<Rett> getRetter() {
        return retter;
    }

    // Get hentTotalpris
    public double hentTotalpris() {
        double totalpris = 0;
        for (Rett rett : retter) {
            totalpris += rett.getPris();
        }
        return totalpris;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(navn).append(": [");
        for (int i = 0; i < retter.size(); i++) {
            sb.append(retter.get(i).getNavn());
            if (i < retter.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("] - Total: ").append(hentTotalpris()).append(" kr");
        return sb.toString();
    }
}
