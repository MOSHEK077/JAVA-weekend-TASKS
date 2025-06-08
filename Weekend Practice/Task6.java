
// Find the Distance between two Points (2D-plane);
//Formula : Distance = square root of (x2-x1)^2 + (y2-y1)^2
import java.util.*;
import java.lang.*;

public class Task6 {

    public static void main(String args[]) {
        Scanner point2d = new Scanner(System.in);
        System.out.print("Enter the value for x1:");
        int x1 = point2d.nextInt();
        System.out.print("Enter the value for y1:");
        int y1 = point2d.nextInt();
        System.out.print("Enter the value for x2:");
        int x2 = point2d.nextInt();
        System.out.print("Enter the value for y2:");
        int y2 = point2d.nextInt();
        double distance = Math.sqrt((Math.pow(x2 - x1, 2)) + Math.pow(y2 - y1, 2));
        System.out.println("Distance between the two 2d-points is:" + distance);
    }
}