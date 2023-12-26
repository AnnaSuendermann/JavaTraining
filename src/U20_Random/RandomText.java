package U20_Random;

import java.util.*;

/**
 *   this program prints a random combination of vowels "aeiou" (between 4-7 characters long)
 *   a random number of times (between 5-8 lines)
 */
public class RandomText {
    public static void main(String[] args) {
        printRandomTimes();
    }
    // generate random amount of Vowels
    public static String randomVowels(){
        Random rand = new Random();
        String vowels = "aeiou";
        int length = vowels.length();
        String addedVowels = "";
        for(int i = 0; i <= (rand.nextInt(3) + 3); i++){
            char c = vowels.charAt(rand.nextInt(length));
            addedVowels += c;
        }
        return addedVowels;
    }

    // print random amount of rows
    public static void printRandomTimes(){
        Random rand = new Random();
        for(int i = 0; i <= (rand.nextInt(4) + 4); i++){
            System.out.println(randomVowels());
        }
    }
}