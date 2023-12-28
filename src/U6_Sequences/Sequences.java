package U6_Sequences;
/**
 * This program gives out a sequence of numbers following a pattern
 */


public class Sequences {
    public static void main(String[] args) {

        //Subtask a
        for(int count = 1; count <= 10; count++) {
            System.out.print( 7 * count-1 + " ");
        }

        System.out.println();

        //Subtask b
        for(int ccount = 8; ccount >= -1; ccount--){
            System.out.print(10 * ccount + " ");
        }

        System.out.println();

        //Subtask c
        for(int dcount = 1; dcount <= 10; dcount++){
            System.out.print(dcount * dcount + " ");
        }


    }
}
