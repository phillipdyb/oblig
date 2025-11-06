package oppgave2;

import java.util.ArrayList;

public class Testklient {
    public static void main(String[] args) {
        // Oppretter menyregister
        MenyRegister register = new MenyRegister();

        // Registrerer retter
        System.out.println("Retter");
        Rett forrett1 = new Rett("Bruschetta", "forrett", 89.0, "Grill brød, legg på tomat og basilikum");
        Rett forrett2 = new Rett("Rekesalat", "forrett", 125.0, "Bland reker, salat og dressing");
        Rett hovedrett1 = new Rett("Biff med potetmos", "hovedrett", 285.0, "Stek biff, kok poteter og lag mos");
        Rett hovedrett2 = new Rett("Laks med grønnsaker", "hovedrett", 265.0, "Stek laks, damp grønnsaker");
        Rett dessert1 = new Rett("Sjokoladekake", "dessert", 95.0, "Bland ingredienser, stek kaken");
        Rett dessert2 = new Rett("Pannacotta", "dessert", 85.0, "Kok fløte og sukker, la stivne");

        register.registrerRett(forrett1);
        register.registrerRett(forrett2);
        register.registrerRett(hovedrett1);
        register.registrerRett(hovedrett2);
        register.registrerRett(dessert1);
        register.registrerRett(dessert2);
        System.out.println("6 retter registrert!\n");

        // Finn en rett
        System.out.println("Finn rett");
        Rett funnetRett = register.finnRett("Laks med grønnsaker");
        System.out.println("Funnet: " + funnetRett);
        System.out.println("Oppskrift: " + funnetRett.getOppskrift() + "\n");

        // Finn alle retter av en type
        System.out.println("Finn alle forretter");
        ArrayList<Rett> forretter = register.finnRetterAvType("forrett");
        for (Rett rett : forretter) {
            System.out.println("- " + rett);
        }
        System.out.println();

        // Registrer menyer
        System.out.println("Menyer");
        ArrayList<Rett> meny1Retter = new ArrayList<>();
        meny1Retter.add(forrett1);
        meny1Retter.add(hovedrett1);
        meny1Retter.add(dessert1);
        Meny meny1 = new Meny("Kjøttmeny", meny1Retter);
        register.registrerMeny(meny1);
        System.out.println(meny1);

        ArrayList<Rett> meny2Retter = new ArrayList<>();
        meny2Retter.add(forrett2);
        meny2Retter.add(hovedrett2);
        meny2Retter.add(dessert2);
        Meny meny2 = new Meny("Fiskmeny", meny2Retter);
        register.registrerMeny(meny2);
        System.out.println(meny2);

        ArrayList<Rett> meny3Retter = new ArrayList<>();
        meny3Retter.add(forrett1);
        meny3Retter.add(hovedrett2);
        Meny meny3 = new Meny("Lunsjmeny", meny3Retter);
        register.registrerMeny(meny3);
        System.out.println(meny3 + "\n");

        // Finn menyer i prisintervall
        System.out.println("Finn menyer mellom 300-400kr");
        ArrayList<Meny> menyerIPrisintervall = register.finnMenyerIPrisintervall(300, 400);
        for (Meny meny : menyerIPrisintervall) {
            System.out.println("- " + meny);
        }
        System.out.println();

        System.out.println("Finn menyer mellom 450-500kr");
        menyerIPrisintervall = register.finnMenyerIPrisintervall(450, 500);
        for (Meny meny : menyerIPrisintervall) {
            System.out.println("- " + meny);
        }
    }
}
