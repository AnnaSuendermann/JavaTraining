package U21_Sentinel;
import java.util.*;
/*
    This program combines all given names and greets them.
 */

public class Sentinel {
    //sentinel value
    public static final String sentinel = "";
    public static void main(String[] args) {
        combineNames();
    }
    //takes a name, adds it to the endproduct and repeats until ended
    public static void combineNames(){
        String name = enterName();
        String combination = name;
        while(!name.equals(sentinel)){
            name = enterName();
            if(name.equals(sentinel)){
                break;
            }
            combination += "," + name;
        }
        System.out.println("Willkommen an alle: " + combination);
    }
    //asks for user input and returns
    public static String enterName(){
        Scanner names = new Scanner(System.in);
        System.out.println("Geben Sie einen Namen ein (oder eine leere Zeile zum Beenden): ");
        return names.nextLine();

    }
}
