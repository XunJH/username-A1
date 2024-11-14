// GeneralPractitioner.java
public class GeneralPractitioner extends HealthProfessional {
    // Used to distinguish between general practitioners and emergency departments
    private boolean acceptsChildren; // Whether to accept pediatric patients

    // Default constructor
    public GeneralPractitioner() {
        super(); // Call the default constructor of the parent class
        this.acceptsChildren = true; // Initialized to accept pediatric patients
    }

    // The second constructor initializes all instance variables
    public GeneralPractitioner(int ID, String name, String department, boolean acceptsChildren) {
        super(ID, name, department); // Call the constructor of the parent class
        this.acceptsChildren = acceptsChildren; // Set whether to accept child patients
    }

    // A way to print health professional details
    public void printDetails() {
        super.printDetails(); // Print the details of the parent class
        System.out.println("Accepts Children: " + (acceptsChildren ? "Yes" : "No")); // Print whether to accept child patients
    }

    // Getter and Setter methods
    public boolean isAcceptsChildren() {
        return acceptsChildren;
    }

    public void setAcceptsChildren(boolean acceptsChildren) {
        this.acceptsChildren = acceptsChildren;
    }
}