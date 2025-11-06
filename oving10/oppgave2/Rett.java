package oppgave2;

public class Rett {
    private String navn;
    private String type;
    private double pris;
    private String oppskrift;

    // Konstruktør
    public Rett(String navn, String type, double pris, String oppskrift) {
        this.navn = navn;
        this.type = type;
        this.pris = pris;
        this.oppskrift = oppskrift;
    }

    // Get navn
    public String getNavn() {
        return navn;
    }

    // Get type
    public String getType() {
        return type;
    }

    // Get pris
    public double getPris() {
        return pris;
    }

    // Get oppskrift
    public String getOppskrift() {
        return oppskrift;
    }

    // toString
    @Override
    public String toString() {
        return navn + " (" + type + ") - " + pris + " kr";
    }
}
