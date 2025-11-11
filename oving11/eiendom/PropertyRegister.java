package eiendom;

import java.util.ArrayList;

public class PropertyRegister {
    private ArrayList<Property> properties;

    // Constructor
    public PropertyRegister() {
        this.properties = new ArrayList<>();
    }

    // Oppgave 3a)
    // Register new property
    public void registerProperty(Property p) {
        properties.add(p);
    }

    // Print all properties
    public ArrayList<Property> allProperties() {
        return new ArrayList<>(properties);
    }

    // Oppgave 3a)
    // Delete property
    public boolean deleteProperty(int municipalityNumber, int lotNumber, int sectionNumber) {
        for (int i = 0; i < properties.size(); i++) {
            Property p = properties.get(i);
            if (p.getMunicipalityNumber() == municipalityNumber
                    && p.getLotNumber() == lotNumber
                    && p.getSectionNumber() == sectionNumber) {
                properties.remove(i);
                return true;
            }
        }
        return false;
    }

    // Oppgave 3a)
    // Find property with Municipality, Lot and Section number
    public ArrayList<Property> findProperty(int municipalityNumber, int lotNumber, int sectionNumber) {
        ArrayList<Property> results = new ArrayList<>();
        for (Property p : properties) {
            if (p.getMunicipalityNumber() == municipalityNumber && p.getLotNumber() == lotNumber && p.getSectionNumber() == sectionNumber) {
                results.add(p);
            }
        }
        return results;
    }

    // Oppgave 3c)
    // Find property with Lot Number
    public ArrayList<Property> findPropertyLotNumber(int lotNumber) {
        ArrayList<Property> results = new ArrayList<>();
        for (Property p : properties) {
            if (p.getLotNumber() == lotNumber) {
                results.add(p);
            }
        }
        return results;
    }

    // Oppgave 3b)
    // Find average size of the property in m2
    public double averageAreaSize() {
        double sum = 0;
        for (Property p : properties) {
            sum += p.getArea();
        }
        return sum / properties.size();
    }
}
