class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}

public class CircleArea {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0); 
        c1.displayDetails();
    }
}
