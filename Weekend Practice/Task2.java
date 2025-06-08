
//Calculate the Volume of a Sphere
//Formula : v = 4 / 3 pi r^3
import java.util.*;
import java.lang.*;

public class Task2 {
    public static void main(String args[]) {
        Scanner volume_sphere = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int r = volume_sphere.nextInt();
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        System.out.println("Volume of sphere is :" + volume);
    }
}