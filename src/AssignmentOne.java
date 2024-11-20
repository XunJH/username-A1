import java.util.ArrayList;
public class AssignmentOne {

    // Part 3 – Using classes and objects
    public static void main(String[] args) {
        // Create three general practitioner objects
        GeneralPractitioner gp1 = new GeneralPractitioner();
        gp1.setID(1);
        gp1.setName("Dr. Lily");
        gp1.setDepartment("General Practice");
        gp1.setAcceptsChildren(true);

        GeneralPractitioner gp2 = new GeneralPractitioner();
        gp2.setID(2);
        gp2.setName("Dr. Jack");
        gp2.setDepartment("General Practice");
        gp2.setAcceptsChildren(false);

        GeneralPractitioner gp3 = new GeneralPractitioner();
        gp3.setID(3);
        gp3.setName("Dr. Hao");
        gp3.setDepartment("General Practice");
        gp3.setAcceptsChildren(true);

        // Create two emergency department doctor objects
        EmergencyPhysician ep1 = new EmergencyPhysician();
        ep1.setID(4);
        ep1.setName("Dr. Davis");
        ep1.setDepartment("Emergency Medicine");
        ep1.setSpecialty("Trauma Surgery");

        EmergencyPhysician ep2 = new EmergencyPhysician();
        ep2.setID(5);
        ep2.setName("Dr. Faker");
        ep2.setDepartment("Emergency Medicine");
        ep2.setSpecialty("Critical Care");

        // Print details for all health professionals
        System.out.println("General Practitioner 1 Details:");
        gp1.printDetails();

        System.out.println("\nGeneral Practitioner 2 Details:");
        gp2.printDetails();

        System.out.println("\nGeneral Practitioner 3 Details:");
        gp3.printDetails();

        System.out.println("\nEmergency Physician 1 Details:");
        ep1.printDetails();

        System.out.println("\nEmergency Physician 2 Details:");
        ep2.printDetails();

        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        ArrayList<Appointment> appointments = new ArrayList<>();

        // Create and add appointments (assuming createAppointment method is implemented elsewhere)
        // Note: We're using hypothetical doctor objects here for demonstration; in a real scenario, you'd use gp1, gp2, ep1, etc.
        createAppointment(appointments, "Alice", "1234567890", "10:00-11:00", gp1); // Using gp1 as an example
        createAppointment(appointments, "Bob", "0987654321", "11:30-12:30", gp2); // Using gp2 as an example

        // Print existing appointments
        printExistingAppointments(appointments);

        // Cancel a booking (using patient's mobile number)
        cancelBooking(appointments, "0987654321");

        // Print existing appointments again to show the updated list
        printExistingAppointments(appointments);

        System.out.println("------------------------------");
    }

    // Helper method to create an appointment and add it to the list
    public static void createAppointment(ArrayList<Appointment> appointments, String patientName, String patientMobileNumber, String selectTimeInterval, HealthProfessional selectedDoctor) {
        Appointment appointment = new Appointment(patientName, patientMobileNumber, selectTimeInterval, selectedDoctor);
        appointments.add(appointment);
    }

    // Helper method to print existing appointments
    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printDetails();
                System.out.println("------------------------------");
            }
        }
    }

    // Helper method to cancel a booking using the patient's mobile number
    public static void cancelBooking(ArrayList<Appointment> appointments, String patientMobileNumber) {
        boolean found = false;
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPatientMobileNumber().equals(patientMobileNumber)) {
                appointments.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No appointment found with that mobile number.");
        }
    }
}

//Onedrive： https://scuonline-my.sharepoint.com/:v:/g/personal/j_xun_10_student_scu_edu_au/ESfk4jxyZEFGizl7XcaG6T4BhyF7DogonXMZq8nT4E7oMg
//GIthub： https://github.com/XunJH/username-A1