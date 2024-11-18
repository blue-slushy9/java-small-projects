import java.util.Scanner;

class Main {
   // Define function that performs the calculations
   private static double raise(int base, int exponent) {
	    double result = Math.pow(base, exponent);
	    return result;
	}
   
   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       int num1 = read.nextInt();
       int num2 = read.nextInt();

       //your code goes here
       double result = raise(num1, num2);
       System.out.println(result);
       
   }
}