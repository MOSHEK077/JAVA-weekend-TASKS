
//Convert temperature in fahreheit to celsius;
import java.util.*;

public class Task4 {
    public static void main(String args[]) {

        Scanner temp = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit:");
        int f = temp.nextInt();
        double cel = 5.0 / 9.0 * (f - 32);
        System.out.println("Temperature in celsius: " + cel);
    }
}
