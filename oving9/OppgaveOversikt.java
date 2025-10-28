package oving9;

public class OppgaveOversikt {

    // Antall studenter
    private Student[] studenter;
    private int antStud = 0;

    // Konstruktør
    public OppgaveOversikt(int kapasitet) {
        studenter = new Student[kapasitet];
    }

    // Get antall studenter
    public int getAntStud() {
        return antStud;
    }

    // Finner antall oppgaver løst til studenter, returnerer -1 hvis student ikke eksisterer
    public int finnAntOppg(String navn) {
        for (int i = 0; i < antStud; i++) {
            if (studenter[i].getNavn().equals(navn)) {
                return studenter[i].getAntOppg();
            }
        }
        return -1;
    }

    // Registrerer studenter
    public boolean registrerStudent(String navn) {
        for (int i = 0; i < antStud; i++) {
            if (studenter[i].getNavn().equals(navn)) {
                return false;
            }
        }
        if (antStud >= studenter.length) {
            return false;
        }
        studenter[antStud] = new Student(navn);
        antStud++;
        return true;
    }

    // Øker antall oppgaver løst
    public boolean økOppgaver(String navn, int økning) {
        for (int i = 0; i < antStud; i++) {
            if (studenter[i].getNavn().equals(navn)) {
                studenter[i].økAntOppg(økning);
                return true;
            }
        }
        return false;
    }

    // d
    public String toString() {
        String resultat = "Antall studenter: " + antStud + "\n";
        for (int i = 0; i < antStud; i++) {
            resultat += studenter[i].toString() + "\n";
        }
        return resultat;
    }
}
