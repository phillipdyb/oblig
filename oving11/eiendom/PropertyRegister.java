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

    // Find average size of the property in m2
    public double averageAreaSize() {
        double sum = 0;
        for (Property p : properties) {
            sum += p.getArea();
        }
        return sum / properties.size();
    }
}
