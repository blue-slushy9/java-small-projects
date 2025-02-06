// Used to take user input via terminal
import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        // Create instance of a Scanner object called 'read'
        Scanner read = new Scanner(System.in);
        System.out.print("Please enter the name of the movie: ");
        String movie = read.nextLine();
        System.out.print("Please enter your row letter: ");
        // We need to use charAt(0) because next() is for strings
        char row = read.next().charAt(0);
        System.out.print("Please enter your seat number: ");
        int seat = read.nextInt();
        // Close scanner to preserve system resources
        read.close();
        // Blank line for legibility
        System.out.println();
        
        // Create instance of a Ticket object called 'ticket'
        Ticket ticket = new Ticket(movie, row, seat);
        // Define string that will confirm user's ticket details
        String confirmation = ("Okay, so your ticket says you are going to see " +
                              ticket.getMovie() + ", and that you'll be sitting " +
                              "in row " + ticket.getRow() + " in seat number " + 
                              ticket.getSeat() + ". Is this correct?");
        
        System.out.println(confirmation);
    }
}

class Ticket {
    
    // Declare class variables
    private String movie;
    private char row;
    private int seat;

    // Constructor is used to create an instance of the Ticket object,
    // in this case a parameterized constructor with specific values
    public Ticket(String movie, char row, int seat) {
        // 'this' refers to variables specific to the object instance
        this.movie = movie;
        this.row = row;
        this.seat = seat;
    }

    // Getter methods for user-input data
    public String getMovie() {
        return movie;
    }
    public char getRow() {
        return row;
    }
    public int getSeat() {
        return seat;
    }
}