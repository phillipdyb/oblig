package oppgaveNyNy1;

class Arrangement {
    private int nummer;
    private String navn;
    private String sted;
    private String arrangor;
    private String type;
    private long tidspunkt;

    public Arrangement(int nummer, String navn, String sted, String arrangor, String type, long tidspunkt) {
        this.nummer = nummer;
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

    public long getDato() {
        return tidspunkt / 10000;
    }

    @Override
    public String toString() {
        return String.format("Nr: %d - %s %nSted: %s %nType: %s %nTid: %d %nArrangør: %s %n",
                nummer, navn, sted, type, tidspunkt, arrangor);
    }
}
