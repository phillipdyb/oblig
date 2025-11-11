package eiendom;

public class Property {

    // Variables
    private String name;
    private String nameOfOwner;
    private String municipalityName;
    private int municipalityNumber;
    private int lotNumber;
    private int sectionNumber;
    private double area;

    // Contructor
    public Property(String name, String nameOfOwner, String municipalityName,
                    int municipalityNumber, int lotNumber, int sectionNumber, double area) {
        this.name = name;
        this.nameOfOwner = nameOfOwner;
        this.municipalityName = municipalityName;
        this.municipalityNumber = municipalityNumber;
        this.lotNumber = lotNumber;
        this.sectionNumber = sectionNumber;
        this.area = area;
    }

    // Get name
    public String getName() {
        return name;
    }

    // Get nameOfOwner
    public String getNameOfOwner() {
        return nameOfOwner;
    }

    // Get municipalityName
    public String getMunicipalityName() {
        return municipalityName;
    }

    // Get municipalityNumber
    public int getMunicipalityNumber() {
        return municipalityNumber;
    }

    // Get lotNumber
    public int getLotNumber() {
        return lotNumber;
    }

    // Get sectionNumber
    public int getSectionNumber() {
        return sectionNumber;
    }

    // Get area
    public double getArea() {
        return area;
    }

    // Oppgave 2b)
    // Return kommunenr-gnr/bnr (t.d. "1445"-"54"/"73")
    public String getPropertyID() {
        return String.format("%d-%d/%d", municipalityNumber, lotNumber, sectionNumber);
    }

    // toString
    @Override
    public String toString() {
        return String.format(
                "Name: %s%n" +
                "Name of owner: %s%n" +
                "Municipality Name: %s%n" +
                "Kommunenr-gnr/brn: %s-%s/%s%n" +
                "Area: %.1f m² %n",
                name,
                nameOfOwner,
                municipalityName,
                municipalityNumber,
                lotNumber,
                sectionNumber,
                area);
    }

//    // toString
//    @Override
//    public String toString() {
//        return String.format(
//                "Name: %s%n" +
//                "Name of owner: %s%n" +
//                "Municipality Name: %s%n" +
//                "Municipality Number: %s%n" +
//                "Lot Number: %s%n" +
//                "Section Number: %d%n" +
//                "Area: %f%n",
//                name,
//                nameOfOwner,
//                municipalityName,
//                municipalityNumber,
//                lotNumber,
//                sectionNumber,
//                area);
//    }
}
