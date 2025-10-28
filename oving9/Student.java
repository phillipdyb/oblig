package oving9;

public class Student {

    private String navn; // entydig
    private int antOppg;

    // Konstruktør
    public Student(String navn) {
        this.navn = navn;
        this.antOppg = 0;
    }

    // Get navn
    public String getNavn() {
        return navn;
    }

    // Get antall oppgaver løst
    public int getAntOppg() {
        return antOppg;
    }

    // Øk antall oppgaver løst
    public void økAntOppg(int økning) {
        if (økning > 0) {
            antOppg += økning;
        }
    }

    // Setter sammen navn og antall løste oppgaver
    @Override
    public String toString() {
        return navn + " har løst " + antOppg + " oppgaver";
    }
}
