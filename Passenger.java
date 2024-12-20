// Passenger.java
public class Passenger {
    private String name;
    private String passportNumber;
    private String nationality;

    public Passenger(String name, String passportNumber, String nationality) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.nationality = nationality;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPassportNumber() { return passportNumber; }
    public void setPassportNumber(String passportNumber) { this.passportNumber = passportNumber; }

    public String getNationality() { return nationality; }
    public void setNationality(String nationality) { this.nationality = nationality; }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
