import java.util.Scanner;

// The main class must be public in order for the JVM to find it and begin the
// execution of a Java program, as main() is the entry point to a Java program
public class Main {

    public static void main(String[] args) {
       // Scanner object block
       Scanner read = new Scanner(System.in);
       String firstName = read.nextLine();
       String secondName = read.nextLine();
       int age = read.nextInt();
       int roomNumber = read.nextInt();
       
       // Customer object block
       Customer customer = new Customer();
       customer.firstName = firstName;
       customer.secondName = secondName;
       customer.age = age;
       customer.roomNumber = roomNumber;
      
       // Call method
       customer.printCustomerInfo();
    }
}

// Default class is package-private
class Customer {

    // Declare customer attributes, in this program they get set in class Main
    public String firstName;
    public String secondName;
    public int age;
    public int roomNumber;
    
    // Define method that prints customer info to terminal
    public void printCustomerInfo() {
        System.out.println("First name: " + firstName);
        System.out.println("Second name: " + secondName);
        System.out.println("Age: " + age);
        System.out.println("Room number: " + roomNumber);
    }
}