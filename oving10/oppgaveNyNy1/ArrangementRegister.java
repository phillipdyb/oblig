package oppgaveNyNy1;

import java.util.ArrayList;

class ArrangementRegister {
    private ArrayList<Arrangement> arrangementer;

    public ArrangementRegister() {
        arrangementer = new ArrayList<>();
    }

    public void registrerArrangement(Arrangement arr) {
        arrangementer.add(arr);
    }

    public ArrayList<Arrangement> finnArrangementerPaSted(String sted) {
        ArrayList<Arrangement> resultat = new ArrayList<>();
        for (Arrangement arr : arrangementer) {
            if (arr.getSted().equalsIgnoreCase(sted)) {
                resultat.add(arr);
            }
        }
        return resultat;
    }

    public ArrayList<Arrangement> finnArrangementerPaDato(long dato) {
        ArrayList<Arrangement> resultat = new ArrayList<>();
        for (Arrangement arr : arrangementer) {
            if (arr.getDato() == dato) {
                resultat.add(arr);
            }
        }
        return resultat;
    }

    public ArrayList<Arrangement> finnArrangementerIIntervall(long fraDato, long tilDato) {
        ArrayList<Arrangement> resultat = new ArrayList<>();
        for (Arrangement arr : arrangementer) {
            long dato = arr.getDato();
            if (dato >= fraDato && dato <= tilDato) {
                resultat.add(arr);
            }
        }
        // Sorter listen
        for (int i = 0; i < resultat.size() - 1; i++) {
            for (int j = i + 1; j < resultat.size(); j++) {
                if (resultat.get(i).getTidspunkt() > resultat.get(j).getTidspunkt()) {
                    Arrangement temp = resultat.get(i);
                    resultat.set(i, resultat.get(j));
                    resultat.set(j, temp);
                }
            }
        }
        return resultat;
    }

    public ArrayList<Arrangement> sorterEtterSted() {
        ArrayList<Arrangement> resultat = new ArrayList<>(arrangementer);
        for (int i = 0; i < resultat.size() - 1; i++) {
            for (int j = i + 1; j < resultat.size(); j++) {
                if (resultat.get(i).getSted().compareToIgnoreCase(resultat.get(j).getSted()) > 0) {
                    Arrangement temp = resultat.get(i);
                    resultat.set(i, resultat.get(j));
                    resultat.set(j, temp);
                }
            }
        }
        return resultat;
    }

    public ArrayList<Arrangement> sorterEtterType() {
        ArrayList<Arrangement> resultat = new ArrayList<>(arrangementer);
        for (int i = 0; i < resultat.size() - 1; i++) {
            for (int j = i + 1; j < resultat.size(); j++) {
                if (resultat.get(i).getType().compareToIgnoreCase(resultat.get(j).getType()) > 0) {
                    Arrangement temp = resultat.get(i);
                    resultat.set(i, resultat.get(j));
                    resultat.set(j, temp);
                }
            }
        }
        return resultat;
    }

    public ArrayList<Arrangement> sorterEtterTidspunkt() {
        ArrayList<Arrangement> resultat = new ArrayList<>(arrangementer);
        for (int i = 0; i < resultat.size() - 1; i++) {
            for (int j = i + 1; j < resultat.size(); j++) {
                if (resultat.get(i).getTidspunkt() > resultat.get(j).getTidspunkt()) {
                    Arrangement temp = resultat.get(i);
                    resultat.set(i, resultat.get(j));
                    resultat.set(j, temp);
                }
            }
        }
        return resultat;
    }

    public void skrivUtArrangementer(ArrayList<Arrangement> liste) {
        if (liste.isEmpty()) {
            System.out.println("Ingen arrangementer funnet.");
        } else {
            liste.forEach(System.out::println);
        }
    }
}

