package eiendom;

public class Property {

    // Variables
    private String name;
    private String nameOfOwner;
    private String municipalityName;
    private int municipalityNumber;
    private int lotNumber;
    private int sectionNumber;
    private int area;

    // Contructor
    public Property(String name, String nameOfOwner, String municipalityName,
                    int municipalityNumber, int lotNumber, int sectionNumber) {
        this.name = name;
        this.nameOfOwner = nameOfOwner;
        this.municipalityName = municipalityName;
        this.municipalityNumber = municipalityNumber;
        this.lotNumber = lotNumber;
        this.sectionNumber = sectionNumber;
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
    public int getArea() {
        return area;
    }

    // toString (Return kommunenr-gnr/bnr (t.d. "1445"-"54"/"73"))
    @Override
    public String toString() {
        return String.format("%d-%d/%d", municipalityNumber, lotNumber, sectionNumber);
    }

}
