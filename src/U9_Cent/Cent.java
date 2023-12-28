package U9_Cent;
/*
    This Program counts the amount of 20 cent coins in a whole number, disregarding numbers over 99
 */
public class Cent {
    public static void main(String[] args) {
        count20Cent(1235);

    }
    //takes the last two numbers and counts the amount of 20 cent coins from that number
    public static void count20Cent(int cents) {
        cents = cents % 100;
        System.out.print(cents/20);
    }
}
