import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);
	    // 'a' is age
        int a = read.nextInt();
	    
	    Pupil pupil =  new Pupil();
            // Call setter method
            pupil.setAge(a);
	}
}

class Pupil {

    private int age;

    // Define conditional setter method
    public void setAge(int a) {
        // If age is greater than 6
        if (a > 6) {
            this.age = a;
            System.out.println("Welcome");
        // Not old enough
        } else {
            System.out.println("Sorry");
        }
    }
    
    // Define getter method
    public int getAge() {
        return age;
    }
}