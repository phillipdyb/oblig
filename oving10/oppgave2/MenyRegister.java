package oppgave2;

import java.util.HashMap;
import java.util.ArrayList;

public class MenyRegister {
    private HashMap<String, Rett> retter;
    private ArrayList<Meny> menyer;

    // Konstruktør
    public MenyRegister() {
        this.retter = new HashMap<>();
        this.menyer = new ArrayList<>();
    }

    // Registrerer rett
    public void registrerRett(Rett rett) {
        retter.put(rett.getNavn(), rett);
    }

    // Finn rett
    public Rett finnRett(String navn) {
        return retter.get(navn);
    }

    // Finn retter av definert type
    public ArrayList<Rett> finnRetterAvType(String type) {
        ArrayList<Rett> resultat = new ArrayList<>();
        for (Rett rett : retter.values()) {
            if (rett.getType().equalsIgnoreCase(type)) {
                resultat.add(rett);
            }
        }
        return resultat;
    }

    // Registrerer meny
    public void registrerMeny(Meny meny) {
        menyer.add(meny);
    }

    // Finner menyer i definert prisintervall
    public ArrayList<Meny> finnMenyerIPrisintervall(double minPris, double maxPris) {
        ArrayList<Meny> resultat = new ArrayList<>();
        for (Meny meny : menyer) {
            double totalpris = meny.hentTotalpris();
            if (totalpris >= minPris && totalpris <= maxPris) {
                resultat.add(meny);
            }
        }
        return resultat;
    }
}
