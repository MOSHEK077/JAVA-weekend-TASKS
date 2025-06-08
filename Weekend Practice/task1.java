
//To calculate the Area of circle;
//Formula : pr*r^2
import java.util.*;
import java.lang.*;

public class task1 {
    public static void main(String args[]) {
        Scanner circle = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        int r = circle.nextInt();
        double pi = Math.PI;
        double a = pi * (r * r);
        System.out.println("Area of circle is : " + a);
    }
}
