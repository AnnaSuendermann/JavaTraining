package U7_VierQuadrate;
/* This program prints a figure, the figure will scale when its size is changed
 */
public class VierQuadrate {

    // Class constant to change size
    public static final int SIZE = 3;

    public static void main(String[] args) {
        equalLines();
        amountRhombus();
        equalLines();
        amountRhombus();
        equalLines();

    }

    // prints the lines containing '='
    public static void equalLines() {
        innerEqualLines();
        System.out.print("+");
        innerEqualLines();
        System.out.println();
    }

    // prints the inner '='
    public static void innerEqualLines() {
        for (int innequal = 1; innequal <= SIZE+1; innequal++) {
            System.out.print("=");
        }
    }

    // prints the inner lines containing '#'
    public static void rhombusLines() {
        System.out.print ("#");
        emptySpaces();
        System.out.print("|");
        emptySpaces();
        System.out.print("#");
    }

    // prints the empty spaces
    public static void emptySpaces() {
        for(int empty = 1; empty <= SIZE; empty++){
            System.out.print(" ");
        }
    }

    // prints '#'
    public static void amountRhombus() {
        for(int repeat = 1; repeat <= SIZE; repeat++) {
            rhombusLines();
            System.out.println();
        }
    }

}
