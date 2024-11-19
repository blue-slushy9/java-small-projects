// Allows you to take user input
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        // Create new scanner object called 'read'
        Scanner read = new Scanner(System.in);
        // Take input for name
        String name = read.nextLine();
        // Take input for age
        int age = read.nextInt();
        // Create new Student object called 'student'
        Student student = new Student();
       
        // Set the name via Setter method
        student.setName(name);
        // Set the age via Setter method
        student.setAge(age);
        // Print fields and user input
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
   }
}

// Default class is default, i.e. package-private, which means the class
// is available only to other classes within the same package
class Student {
   
    // Private scope means variables will only be accessible within this class
    private String name;
    private int age;

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }
    // Getter method for name
    public String getName() {
        return name;
    } 

    // Setter method for age
    public void setAge(int age) {
        // Verify age entered is valid, i.e. no negative numbers
        if (age >= 0) {
            this.age = age;
        }
        // Negative numbers just get overwritten to zero
        else {
            this.age = 0;
        }
    }
    // Getter method for age
    public int getAge() {
        return age;
    }   
}