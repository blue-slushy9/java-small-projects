import java.util.Scanner;

// The Main class must be public in order for the JVM to find it and begin the
// execution of a Java program, as main() is the entry point to a Java program
public class Main {

    private static void main(String[] args) {
        // Scanner object block
        Scanner read = new Scanner(System.in);
        String firstName = read.nextLine();
        String secondName = read.nextLine();
        int age = read.nextInt();
        int roomNumber = read.nextInt();
       
        // Create Customer object instance then call Setter methods
        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setSecondName(secondName);
        customer.setAge(age);
        customer.setRoomNumber(roomNumber);
        
        // Use Getter method to print user-input data
        System.out.println("First name: " + getFirstName());
        System.out.println("Second name: " + getSecondName());
        System.out.println("Age: " + getAge());
        System.out.println("Room number: " + getRoomNumber());
    }
}

// Default access modifier is package-private
class Customer {

    // Declare customer attributes, in this program they get set in class Main
    private String firstName;
    private String secondName;
    private int age;
    private int roomNumber;

    // Setter method for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    // Getter method for firstName
    public String getFirstName() {
        return firstName;
    }

    // Setter method for secondName
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    // Getter method for secondName
    public String getSecondName() {
        return secondName;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }
    // Getter method for secondName
    public int getAge() {
        return age;
    }

    // Setter method for roomNumber
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    // Getter method for roomNumber
    public int getRoomNumber() {
        return roomNumber;
    }
}