package eiendom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PropertyUI {
    public static void main(String[] args) {
        PropertyUI ui = new PropertyUI();
        ui.start();
    }

    private static PropertyRegister register = new PropertyRegister();
    private final Scanner scanner = new Scanner(System.in);

    // Constants representing the different menu choices
    private final int ADD_PROPERTY = 1;
    private final int LIST_ALL_PROPERTIES = 2;
    private final int FIND_PROPERTY = 3;
    private final int CALCULATE_AVERAGE_AREA = 4;
    private final int EXIT = 5;

    private int showMenu () {
        int menuChoice = 0;
        System.out.println("\n***** Property Register Application v0.1 *****\n");
        System.out.println("1. Add property");
        System.out.println("2. List all properties");
        System.out.println("3. Search property");
        System.out.println("4. Calculate average area");
        System.out.println("5. Quit");
        System.out.println("\nPlease enter a number between 1 and 5.\n");

        if (scanner.hasNextInt()) {
            menuChoice = scanner.nextInt();
        } else {
            System.out.println("You must enter a number, not text");
        }
        scanner.nextLine(); // Consumes newline
        return menuChoice;
    }

    public void start () {
        boolean finished = false;
        // The while-loop will run as long as the user has not selected
        // to quit the application
        while (!finished) {
            int menuChoice = this.showMenu();
            switch (menuChoice) {
                case ADD_PROPERTY:
                    registerNewProperty();
                    break;
                case LIST_ALL_PROPERTIES:
                    listAllProperties();
                    break;
                case FIND_PROPERTY:
                    findProperty();
                    break;
                case CALCULATE_AVERAGE_AREA:
                    averageAreaSize();
                    break;
                case EXIT:
                    System.out.println("Thank you for using the Properties app!\n");
                    finished = true;
                    break;
                default:
                    System.out.println("Unrecognized menu selected..");
                    break;
            }
        }
    }

    // Register property
    private void registerNewProperty() {
        System.out.println("\nRegister a new property");

        System.out.print("Name of property: ");
        String name = scanner.nextLine();

        System.out.print("Name of owner: ");
        String nameOfOwner = scanner.nextLine();

        System.out.print("Municipality name: ");
        String municipalityName = scanner.nextLine();

        System.out.print("Municipality number: ");
        int municipalityNumber = scanner.nextInt();

        System.out.print("Lot number: ");
        int lotNumber = scanner.nextInt();

        System.out.print("Section number: ");
        int sectionNumber = scanner.nextInt();

        System.out.print("Size of area in m2: ");
        double area = scanner.nextInt();

        scanner.nextLine(); // Konsumer newline

        Property p = new Property(name, nameOfOwner, municipalityName, municipalityNumber, lotNumber, sectionNumber, area);
        register.registerProperty(p);
        System.out.println("Property is registered.");
    }

    private void listAllProperties() {
        System.out.println("\nAll properties:\n");
        List<Property> results = register.allProperties();
        if (results.isEmpty()) {
            System.out.println("No properties found.");
        } else {
            for (Property p : results) {
                System.out.println(p);
            }
            System.out.println("\nTotal properties: " + results.size());
        }
    }

    // Finds property on Municipality, Lot and Section number
    private void findProperty() {
        System.out.println("\nFind a property based on Municipality, Lot and Section Number");

        System.out.print("Municipality Number: ");
        int municipalityNumber = scanner.nextInt();

        System.out.print("Lot Number: ");
        int lotNumber = scanner.nextInt();

        System.out.print("Section Number: ");
        int sectionNumber = scanner.nextInt();

        ArrayList<Property> results = register.findProperty(municipalityNumber, lotNumber, sectionNumber);
        printFoundProperties(results);
    }

    private void printFoundProperties(ArrayList<Property> list) {
        if (list.isEmpty()) {
            System.out.println("No properties found.");
            return;
        }

        System.out.println("\n--- Matching Properties ---");

        for (Property p : list) {
            System.out.println(p);   // Prints using Property.toString()
            System.out.println();    // Blank line between entries
        }
    }

    private void averageAreaSize() {
        double average = register.averageAreaSize();
        System.out.printf("Average size of a property: %.2f m²%n", average);
    }
}

/*
Kravspesifikasjoner:
- Registrere eiendom
- Skrive ut alle eiendommer som er registrert
- Soke etter eiendom basert pa kommunenr, gnr og bnr (alle 3 samtidig)
- Regne ut og vise gjennomsnittsareal av alle eiendommene i registeret

Alle eiendommer i Norge er registrert med blant annet folgende informasjon:
- Kommunenummer (municipality number)
- Kommunenavn (municipality name)
- Gardsnummer - gnr (lot number)
- Bruksnummer - bnr (section number)
- Bruksnavn (name)
- Areal i m2 (area)
- Navn pa eier (Name of owner)

Funksjoner
- Return kommunenr-gnr/bnr (t.d. "1445"-"54"/"73")
- Regner ut gjennomsnittsareal av alle eiendommene i registeret
- Returner alle eiendommer med et gitt gardsnummer

Brukergrensesnitt
-
*/