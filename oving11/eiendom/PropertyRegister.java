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
}
