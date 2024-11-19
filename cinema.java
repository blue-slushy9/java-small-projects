// Used to take user input via terminal
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        // Create instance of a Scanner object called 'read'
        Scanner read = new Scanner(System.in);
        String movie = read.nextLine();
        int row = read.nextInt();
        int seat = read.nextInt();
        
        // Create instance of a Ticket object called 'ticket'
        Ticket ticket = new Ticket(movie, row, seat);
        // Print out ticket details, including user input
        System.out.println("Movie: " + ticket.getMovie());
        System.out.println("Row: " + ticket.getRow());
        System.out.println("Seat: " + ticket.getSeat());
    }
}

class Ticket {
    
    // Declare class variables
    private String movie;
    private int row;
    private int seat;

    // Constructor is used to create an instance of the Ticket object,
    // in this case a parameterized constructor with specific values
    public Ticket(String movie, int row, int seat) {
        // 'this' refers to variables specific to the object instance
        this.movie = movie;
        this.row = row;
        this.seat = seat;
    }

    // Getter methods for user-input data
    public String getMovie() {
        return movie;
    }
    public int getRow() {
       return row;
    }
    public int getSeat() {
       return seat;
    }
}