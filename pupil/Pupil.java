import java.util.Scanner;

public class Pupil {

	public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);
        System.out.print("Please enter the age of the prospective pupil: ");
        // Open the scanner to take user input
        int age = read.nextInt();
        // Close the scanner to release system resources
        read.close();
	    
        // Create instance of object and call its methods
	    PupilDetails pupil =  new PupilDetails();
        // Call setter method
        pupil.setAge(age);
        // Print result and user input using getter method
        System.out.println(pupil.getResult());
	}
}

class PupilDetails {

    // Default value for integers is 0
    private int age;
    // Default value for strings is null
    private String result;
    
    // Define conditional setter method
    public void setAge(int a) {
        // Set age according to argument
        this.age = a;
        if (age > 6) {
            this.result = ("Welcome, %d is old enough to study.".formatted(age));
        // Not old enough
        } else if (age <= 6 && age >= 0) {
            this.result = ("Sorry, %d isn't old enough to study.".formatted(age));
        // Invalid age
        } else {
            this.result = ("%d is not a valid age, please enter a real age.".formatted(age));
        }
    }

    // Define getter method
    public String getResult() {
        return result;
    }
}