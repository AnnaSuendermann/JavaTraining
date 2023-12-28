package U14_Winkel;
import java.util.Scanner;
/* This program takes three lengths of a triangle, then calculates and prints out its angles
 */

public class Winkel {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Dieses Programm errechnet die drei Winkel eines Dreiecks.");
        printTextSideLength('a');
        double a = getSideLength(console);
        printTextSideLength('b');
        double b = getSideLength(console);
        printTextSideLength('c');
        double c = getSideLength(console);

        double alpha = calcAngle(a, b, c);
        double beta = calcAngle(b, a, c);
        double gamma = 180 - alpha - beta;

        printResult(alpha, beta, gamma);
    }

    // asks for user input
    public static void printTextSideLength(char x) {
        System.out.println("Bitte Seitenlänge " + x + " eingeben: ");
    }

    // prints the calculated angles
    public static void printResult(double alpha, double beta, double gamma) {
        System.out.println("alpha = " + alpha);
        System.out.println("beta = " + beta);
        System.out.println("gamma = " + gamma);
    }

    // user input
    public static double getSideLength(Scanner console) {
        return console.nextDouble();
    }

    // calculates the angle
    public static double calcAngle(double a, double b, double c) {
        double angle = Math.acos(((a*a)-(b*b)-(c*c))/(-2*b*c));
        angle = Math.toDegrees(angle);
        return round1(angle);
        // optional: return round1(Math.toDegrees(Math.acos(((a*a)-(b*b)-(c*c))/(-2*b*c))));
    }

    //rounds the given number
    public static double round1(double value) {
        if (Double.isNaN(value)) return value;
        if (Double.isInfinite(value)) return value;
        return Math.round(value * 10)/10.0;
    }
}
