package oving10.oppgaveNy1;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrangementRegister {
    private ArrayList<Arrangement> arrangementer;

    // Konstruktør
    public ArrangementRegister() {
        this.arrangementer = new ArrayList<>();
    }

    // Registrere nytt arrangement
    public void registrerArrangement(Arrangement arrangement) {
        arrangementer.add(arrangement);
        System.out.println("Arrangement registrert med nummer: " + arrangement.getNummer());
    }

    // Finn alle arrangementer på et gitt sted
    public ArrayList<Arrangement> finnArrangementerPaSted(String sted) {
        ArrayList<Arrangement> resultat = new ArrayList<>();
        for (Arrangement a : arrangementer) {
            if (a.getSted().equalsIgnoreCase(sted)) {
                resultat.add(a);
            }
        }
        return resultat;
    }

    // Finn alle arrangementer på en gitt dato
    public ArrayList<Arrangement> finnArrangementerPaDato(long dato) {
        ArrayList<Arrangement> resultat = new ArrayList<>();
        long datoDel = dato / 10000; // Fjern klokkeslett, behold kun dato

        for (Arrangement a : arrangementer) {
            long arrangementDato = a.getTidspunkt() / 10000;
            if (arrangementDato == datoDel) {
                resultat.add(a);
            }
        }
        return resultat;
    }

    // Finn arrangementer innenfor tidsintervall (sortert på tid)
    public ArrayList<Arrangement> finnArrangementerIIntervall(long fraDato, long tilDato) {
        ArrayList<Arrangement> resultat = new ArrayList<>();

        for (Arrangement a : arrangementer) {
            long tid = a.getTidspunkt();
            if (tid >= fraDato && tid <= tilDato) {
                resultat.add(a);
            }
        }

        // Sorter på tidspunkt
        resultat.sort(Comparator.comparingLong(Arrangement::getTidspunkt));
        return resultat;
    }

    // Liste sortert på sted
    public ArrayList<Arrangement> listeEtterSted() {
        ArrayList<Arrangement> sortert = new ArrayList<>(arrangementer);
        sortert.sort(Comparator.comparing(Arrangement::getSted));
        return sortert;
    }

    // Liste sortert på type
    public ArrayList<Arrangement> listeEtterType() {
        ArrayList<Arrangement> sortert = new ArrayList<>(arrangementer);
        sortert.sort(Comparator.comparing(Arrangement::getType));
        return sortert;
    }

    // Liste sortert på tidspunkt
    public ArrayList<Arrangement> listeEtterTidspunkt() {
        ArrayList<Arrangement> sortert = new ArrayList<>(arrangementer);
        sortert.sort(Comparator.comparingLong(Arrangement::getTidspunkt));
        return sortert;
    }

    // Om arrayen er tom
    public boolean isEmpty() {
        return arrangementer.isEmpty();
    }
}
