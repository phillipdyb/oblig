package oppgaveNyNy1;

public class KlientProgram {
    public static void main(String[] args) {
        ArrangementRegister register = new ArrangementRegister();

        // Hardkodede eksempler
        register.registrerArrangement(new Arrangement(
                1,
                "Rockekonsert med DDE",
                "Trondheim",
                "Konserthuset AS",
                "Konsert",
                202512151930L
        ));

        register.registrerArrangement(new Arrangement(
                2,
                "Juleteater for barn",
                "Trondheim",
                "Trøndelag Teater",
                "Barneteater",
                202512201400L
        ));

        register.registrerArrangement(new Arrangement(
                3,
                "Foredrag om klimaendringer",
                "Kunstmuseet",
                "Vitenskapsmuseet",
                "Foredrag",
                202512151800L
        ));

        System.out.println("Alle arrangementer sortert etter tidspunkt");
        register.skrivUtArrangementer(register.sorterEtterTidspunkt());

        System.out.println("\nArrangementer i Trondheim");
        register.skrivUtArrangementer(
                register.finnArrangementerPaSted("Trondheim")
        );

        System.out.println("\nArrangementer på dato 20251215");
        register.skrivUtArrangementer(
                register.finnArrangementerPaDato(20251215L)
        );

        System.out.println("\nArrangementer mellom 20251210 og 20251220");
        register.skrivUtArrangementer(
                register.finnArrangementerIIntervall(20251210L, 20251220L)
        );

        System.out.println("\nSortert etter sted");
        register.skrivUtArrangementer(register.sorterEtterSted());

        System.out.println("\nSortert etter type");
        register.skrivUtArrangementer(register.sorterEtterType());
    }
}
