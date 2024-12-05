import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);
	    int a = read.nextInt();
	    
	    Pupil pupil =  new Pupil();
            pupil.setAge(a);
	}
}

class Pupil {
    private int age;
    
    //complete setter method
    public void  setAge(int a) {
        if (a > 6) {
            this.age = a;
            System.out.println("Welcome");
        } else {
            System.out.println("Sorry");
        }
    }
    
    public int getAge(){
        return age;
    }
}