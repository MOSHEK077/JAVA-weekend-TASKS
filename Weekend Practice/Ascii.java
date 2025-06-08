// ASCII Values : (American Standard Code for Information Interchange)
/*
 * What is ASCII Value?
 * ASCII stands for American Standard Code for Information Interchange,
 * A character encoding standard that assigns unique
 * numerical values to letters, digits, punctuation marks, and other symbols
 */
public class Ascii {

    public static void main(String args[]) {
        char ch = 'a';
        int ascii = ch;
        // You can also cast char to int
        int castAscii = (int) ch;
        System.out.println("The ASCII value of" + ch + " is: " + ascii);
        System.out.println("The ASCII value of: " + ch + "is: " + castAscii);
    }
}