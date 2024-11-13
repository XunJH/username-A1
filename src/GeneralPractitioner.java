// GeneralPractitioner.java
public class GeneralPractitioner extends HealthProfessional {
    private String specialty; 

    public GeneralPractitioner() {
        super();
        this.specialty = "";
    }

    public GeneralPractitioner(int ID, String name, String department, String specialty) {
        super(ID, name, department);
        this.specialty = specialty;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Specialty: " + this.specialty);
        System.out.println("Type: General Practitioner");
    }
}