package U16_Range;

public class Range {
    public static void main(String[] args) {
        printRange(2,7);
        printRange(19,11);
        printRange(5,5);
    }

    // prints out all number in the given interval
    public static void printRange(int x, int y) {

        if(x < y) {
            System.out.print("[");
            for(int i = x; i < y; i++ ) {
                System.out.print(i + ",");
            }
            System.out.println(y + "]");
        } else {
            System.out.print("[");
            for(int i = x; i > y; i-- ) {
                System.out.print(i +",");
            }
            System.out.println(y+"]");
        }
    }
}
