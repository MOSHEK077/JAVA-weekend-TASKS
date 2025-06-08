
// To calculate the Simple interest using java programming.

/* Formula : Simple_interest = p*r*n / 100;
 * 
 */
import java.util.*;

public class simple {

    public static void main(String args[]) {

        Scanner sm = new Scanner(System.in);
        System.out.print("Enter the Principle amount : ");
        int p = sm.nextInt();
        System.out.print("Enter the interest rate : ");
        int r = sm.nextInt();
        System.out.print("Enter the no.of year : ");
        int n = sm.nextInt();
        int simpelI = p * r * n / 100;
        System.out.println("Simple interest is : " + simpelI);

    }
}
