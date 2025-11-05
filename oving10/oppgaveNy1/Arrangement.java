package oving10.oppgaveNy1;

class Arrangement {
    private static int nesteNummer = 1;

    private int nummer;
    private String navn;
    private String sted;
    private String arrangor;
    private String type;
    private long tidspunkt; // Format: yyyyMMddhhmm (eks: 200210301800)

    public Arrangement(String navn, String sted, String arrangor, String type, long tidspunkt) {
        this.nummer = nesteNummer++;
        this.navn = navn;
        this.sted = sted;
        this.arrangor = arrangor;
        this.type = type;
        this.tidspunkt = tidspunkt;
    }

    public int getNummer() {
        return nummer;
    }

    public String getNavn() {
        return navn;
    }

    public String getSted() {
        return sted;
    }

    public String getArrangor() {
        return arrangor;
    }

    public String getType() {
        return type;
    }

    public long getTidspunkt() {
        return tidspunkt;
    }

    @Override
    public String toString() {
        return String.format("Nr: %d%n - %s%n - Sted: %s%n - Arrangør: %s%n - Type: %s%n - Tid: %d%n",
                nummer, navn, sted, arrangor, type, tidspunkt);
    }
}
