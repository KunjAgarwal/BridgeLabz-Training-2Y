public class Hospital_Management {

    public static void main(String[] args) {
        Patient patient1 = new Patient("John Doe", "P001", 35, "Fever");
        Patient patient2 = new Patient("Jane Smith", "P002", 50, "Cough");

        System.out.println("--- Patient Details ---");
        patient1.displayDetails();
        System.out.println();
        patient2.displayDetails();
        System.out.println();

        System.out.println("--- Instanceof Check ---");
        Object anObject = patient1;
        if (anObject instanceof Patient) {
            Patient patient = (Patient) anObject;
            System.out.println("Object is an instance of Patient. Displaying details:");
            patient.displayDetails();
        } else {
            System.out.println("Object is not an instance of Patient.");
        }
        System.out.println();
        Patient.getTotalPatients();
    }
}
class Patient {
    private static String hospitalName = "CodInClub Hospital";
    private static int totalPatients = 0;
    private final String patientID;
    private String name;
    private int age;
    private String ailment;
    public Patient(String name, String patientID, int age, String ailment) {
        this.name = name;
        this.patientID = patientID;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }
    public void displayDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Name: " + this.name);
        System.out.println("Patient ID: " + this.patientID);
        System.out.println("Age: " + this.age);
        System.out.println("Ailment: " + this.ailment);
    }
    public static void getTotalPatients() {
        System.out.println("Total patients admitted: " + totalPatients);
    }
}
