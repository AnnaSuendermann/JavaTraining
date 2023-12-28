package U15_KumulProd;
import java.util.Scanner;
/* This program takes the numbers provided and calculates a cumulative product
 */

public class KumulProd {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int amount = howMany(console);
        System.out.print("Das kumulative Produkt ist: " + getAmount(console, amount));
    }

    // asks for user input
    public static int howMany(Scanner console) {
        System.out.print("Wieviele Zahlen? ");
        return console.nextInt();
    }

    // calculates the cumulative product
    public static int getAmount (Scanner console, int amount) {
        int kumProd = 1;
        for(int i = 1; i <= amount; i++) {
            System.out.print(i+"-te Zahl: ");
            kumProd *= console.nextInt();
        }
        return kumProd;
    }
}
