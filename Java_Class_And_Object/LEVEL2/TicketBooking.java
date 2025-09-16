class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    boolean booked;
    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = 0; 
        this.price = 0;
        this.booked = false;
    }

    void bookTicket(int seatNum, double price) {
        if (!booked) {
            this.seatNumber = seatNum;
            this.price = price;
            this.booked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Ticket already booked.");
        }
    }
    void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
        System.out.println("Booking Status: " + (booked ? "Booked" : "Not Booked"));
    }
}

public class TicketBooking {
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Avengers: Endgame");
        ticket1.displayDetails();
        ticket1.bookTicket(12, 250.0);
        ticket1.displayDetails();
    }
}
