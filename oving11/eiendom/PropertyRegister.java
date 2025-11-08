package eiendom;

import java.util.ArrayList;

public class PropertyRegister {
    private ArrayList<Property> properties;

    // Konstruktør
    public PropertyRegister() {
        this.properties = new ArrayList<>();
    }

    // Registrere nytt arrangement
    public void registerProperty(Property p) {
        properties.add(p);
    }

    // Print all properties
    public ArrayList<Property> allProperties() {
        return new ArrayList<>(properties);
    }

    public ArrayList<Property> findProperty(int municipalityName, int lotNumber, int sectionNumber) {
        ArrayList<Property> results = new ArrayList<>();
        for (Property p : properties) {
            if (p.getMunicipalityNumber() == municipalityName && p.getLotNumber() == lotNumber && p.getSectionNumber() == sectionNumber) {
                results.add(p);
            }
        }
        return results;
    }
}
