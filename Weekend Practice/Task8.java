
//To calculate the power of current:
//Formula : Power = voltage * current.
import java.util.*;

public class Task8 {
    public static void main(String args[]) {
        System.out.print("Enter the value of voltage:");
        Scanner pwr = new Scanner(System.in);
        float v = pwr.nextFloat();
        System.out.print("Enter the value of current:");
        float c = pwr.nextFloat();
        float power = v * c;
        System.out.println("The value of power is :" + power + " watt");

    }
}
