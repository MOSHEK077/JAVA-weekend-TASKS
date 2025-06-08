// 

import java.util.*;

public class Mark {
    public static void main(String args[]) {
        Scanner av = new Scanner(System.in);
        System.out.print("Enter the Marks in Tamil: ");
        int T = av.nextInt();
        System.out.print("Enter the Marks in English:  ");
        int E = av.nextInt();
        System.out.print("Enter the Marks in Mathematics: ");
        int M = av.nextInt();
        System.out.print("Enter the Marks in Science: ");
        int S = av.nextInt();
        System.out.print("Enter the Marks in Social Science: ");
        int SS = av.nextInt();
        int no_of_sub = 5;
        int total_marks = T + E + S + SS + M;
        double average = total_marks / no_of_sub;
        System.out.println("Total Subjects: " + no_of_sub);
        System.out.println("Total Score: " + total_marks);
        System.out.println("Average :" + average + "%");

    }
}
