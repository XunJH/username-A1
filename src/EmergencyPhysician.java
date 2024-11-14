// EmergencyPhysician.java
public class EmergencyPhysician extends HealthProfessional {
    // Used to distinguish between general practitioners and emergency departments
    private String specialty; // Emergency department expertise

    // Default constructor
    public EmergencyPhysician() {
        super(); // Call the default constructor of the parent class
        this.specialty = ""; // Initialize to an empty string
    }

    // The second constructor initializes all instance variables
    public EmergencyPhysician(int ID, String name, String department, String specialty) {
        super(ID, name, department); // Call the constructor of the parent class
        this.specialty = specialty; // Set up emergency department expertise
    }

    // A way to print health professional details
    public void printDetails() {
        super.printDetails(); // Print the details of the parent class
        System.out.println("Specialty: " + specialty); // Print emergency department expertise
    }

    // Getter and Setter methods
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}