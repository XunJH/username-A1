public class Appointment {
    // Patient details
    private String patientName;
    private String patientMobileNumber; 

    // Selected time period
    private String SelectTimeInterval; 

    // Selected doctor
    private HealthProfessional selectedDoctor;

    // Default constructor
    public Appointment() {
        this.patientName = "";
        this.patientMobileNumber = ""; 
        this.SelectTimeInterval = ""; 
        this.selectedDoctor = null;
    }

    // The second constructor initializes all instance variables
    public Appointment(String patientName, String patientMobileNumber, String selectTimeInterval, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.patientMobileNumber = patientMobileNumber; 
        this.SelectTimeInterval = selectTimeInterval; 
        this.selectedDoctor = selectedDoctor;
    }

    // A method to print all instance variables
    public void printDetails() {
        System.out.println("Patient Name: " + this.patientName);
        System.out.println("Patient Mobile: " + this.patientMobileNumber); 
        System.out.println("Selected Time Interval: " + this.SelectTimeInterval); 
        System.out.println("Selected Doctor Details:");
        if (this.selectedDoctor != null) {
            this.selectedDoctor.printDetails();
        } else {
            System.out.println("No doctor selected.");
        }
    }

    // Getter and Setter methods
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientMobileNumber() { 
        return patientMobileNumber; 
    }

    public void setPatientMobileNumber(String patientMobileNumber) { 
        this.patientMobileNumber = patientMobileNumber; 
    }

    public String getSelectTimeInterval() { 
        return SelectTimeInterval;
    }

    public void setSelectTimeInterval(String selectTimeInterval) { 
        this.SelectTimeInterval = selectTimeInterval;
    }

    public HealthProfessional getSelectedDoctor() {
        return selectedDoctor;
    }

    public void setSelectedDoctor(HealthProfessional selectedDoctor) {
        this.selectedDoctor = selectedDoctor;
    }
}