class Vehicle {
    String ownerName;
    String vehicleType;

    static double registrationFee;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

public class Vehicle_Registration {
    public static void main(String[] args) {
        Vehicle.updateRegistrationFee(1500.0);

        Vehicle v1 = new Vehicle("Kunj Agarwal", "Car");
        Vehicle v2 = new Vehicle("Riya Sharma", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(2000.0);
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
