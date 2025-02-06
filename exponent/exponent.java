import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
        // Scanner block
        Scanner read = new Scanner(System.in);
        int num1 = read.nextInt();
        int num2 = read.nextInt();

        // Create instance of Calculation object and call method
        Calculation calc = new Calculation();
        double result = calc.raise(num1, num2);
        System.out.println(result);
    }
}

class Calculation {

    // Define function that performs the calculations
    private static double raise(int base, int exponent) {
        // 'pow' method raises 'base' to the 'exponent' power
        double result = Math.pow(base, exponent);
        return result;
    }
}