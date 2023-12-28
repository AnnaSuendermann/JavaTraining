package U12_Vertical;
/* This program prints a string in a vertical line
 */

public class Vertical {
    public static void main(String[] args) {
        String holz = ("This is my String!");
        vertical(holz);
    }
    //gives out the characters one at a time until the String ends
    public static void vertical(String x) {
        for(int i = 0; i < x.length(); i++) {
            System.out.println(x.charAt(i));
        }

    }
}
