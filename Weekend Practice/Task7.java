
// To calculate the compound interest :
//Formula => A = P(1+r/100)^n
import java.util.*;
import java.lang.*;

public class Task7 {

    public static void main(String args[]) {
        Scanner comp = new Scanner(System.in);
        System.out.print("Enter the principle amount:");
        double P = comp.nextDouble();
        System.out.print("Enter the interest rate:");
        double r = comp.nextDouble();
        System.out.print("Enter n number of years:");
        double n = comp.nextDouble();
        double A = P * Math.pow(1 + r / 100, 2); // correct formula;
        System.out.println("Compound interest is " + A);
    }
}
