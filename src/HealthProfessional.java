public class HealthProfessional {
    // equired instance variables
    private int ID; // doctor's id
    private String name; // doctor's name
    private String department; // doctor's department

    // Default constructor
    public HealthProfessional() {
        this.ID = 0; // Initial id
        this.name = ""; // Initial name
        this.department = ""; // Initial depatment
    }

    // The second constructor, which initializes all instance variables
    public HealthProfessional(int ID, String name, String department) {
        this.ID = ID; // Set the doctor's id
        this.name = name; // Set the doctor's name
        this.department = department; // Set the doctor's department
    }

    // A method to print all instance variables
    public void printDetails() {
        System.out.println("ID: " + this.ID); // Print the doctor's id
        System.out.println("Name: " + this.name); // Print the doctor's name
        System.out.println("Department: " + this.department); // Print the doctor's department
    }

    // Getter and Setter methods to access and modify the values of instance variables
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}