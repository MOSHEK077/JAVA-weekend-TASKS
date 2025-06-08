//Calculate the Body Mass Index (BMI) Calculation,
// BMI = Weight (kg) /  height * (m^2) m stands for metre;

import java.util.*;

public class Task3 {

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the weight:");
        double w = obj.nextDouble();
        System.out.print("Enter the height in metere:");
        double h = obj.nextDouble();
        double bmi = w / Math.pow(h, 2);
        System.out.println("Your BMI is : " + bmi);
    }
}
