public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 – Using classes and objects

        // 创建三个全科医生对象
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

        // 创建两个急诊科医生对象
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

        // 打印所有健康专业人员的详细信息
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

        // 添加分隔线
        System.out.println("------------------------------");
    }
}