
// Calculate the Speed :
//Formula , Speed = Distance / time;
import java.util.*;

public class Task5 {

    public static void main(String args[]) {
        Scanner sp = new Scanner(System.in);
        System.out.print("Enter the Distance:");
        float dis = sp.nextFloat();
        System.out.print("Enter the time:");
        float time = sp.nextFloat();
        float speed = dis / time;
        System.out.println("Speed is " + speed + "km^2");
    }
}
