package oving10.oppgaveNy1;

public class Arrangement {
    private static int nesteNummer = 1;
    private int nummer;
    private String navn;
    private String sted;
    private String arrangor;
    private String type;
    private long tidspunkt; // Format: yyyyMMddhhmm (eks: 200210301800)

    // Konstruktør
    public Arrangement(String navn, String sted, String arrangor, String type, long tidspunkt) {
        this.nummer = nesteNummer++;
        this.navn = navn;
        this.sted = sted;
        this.arrangor = arrangor;
        this.type = type;
        this.tidspunkt = tidspunkt;
    }

    // Get nummer
    public int getNummer() {
        return nummer;
    }

    // Get navn
    public String getNavn() {
        return navn;
    }

    // Get sted
    public String getSted() {
        return sted;
    }

    // Get arrangør
    public String getArrangor() {
        return arrangor;
    }

    // Get Type
    public String getType() {
        return type;
    }

    // Get Tidspunkt
    public long getTidspunkt() {
        return tidspunkt;
    }

    // toString
    @Override
    public String toString() {
        return String.format("Nr: %d%n - %s%n - Sted: %s%n - Arrangør: %s%n - Type: %s%n - Tid: %d%n",
                nummer, navn, sted, arrangor, type, tidspunkt);
    }
}
