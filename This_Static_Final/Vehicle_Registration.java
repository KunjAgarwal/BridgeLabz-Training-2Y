public class Vehicle_Registration {

    public static void main(String[] args) {
        Vehicle.updateRegistrationFee(50.0);
        Vehicle vehicle1 = new Vehicle("Alice", "Car", "ABC-123");
        Vehicle vehicle2 = new Vehicle("Bob", "Motorcycle", "XYZ-789");

        System.out.println("--- Vehicle Details ---");
        vehicle1.displayDetails();
        System.out.println();
        vehicle2.displayDetails();
        System.out.println();
        System.out.println("--- Instanceof Check ---");
        Object anObject = vehicle1;
        if (anObject instanceof Vehicle) {
            Vehicle vehicle = (Vehicle) anObject;
            System.out.println("Object is an instance of Vehicle. Displaying details:");
            vehicle.displayDetails();
        } else {
            System.out.println("Object is not an instance of Vehicle.");
        }
        System.out.println();
    }
}
class Vehicle {
    private static double registrationFee;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    public void displayDetails() {
        System.out.println("Owner Name: " + this.ownerName);
        System.out.println("Vehicle Type: " + this.vehicleType);
        System.out.println("Registration Number: " + this.registrationNumber);
        System.out.println("Registration Fee: $" + registrationFee);
    }
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}
