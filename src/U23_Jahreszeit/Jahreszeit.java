package U23_Jahreszeit;
/*
    This program uses a user given date and gives out the associated season
 */

import java.util.Scanner;

public class Jahreszeit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String day = "Tag (1-31): ";
        String month = "Month (1-12): ";
        int userDay;
        int userMonth;
        do{
            userDay = ganzzahlInBereichLesen(console, day, 31);
            userMonth = ganzzahlInBereichLesen(console, month, 12);
            if(!checkDate(userDay, userMonth)){
                System.out.println("Datum ist ungültig. Wiederholen.");
            }
        }while(!checkDate(userDay, userMonth));
        printSeason(userDay, userMonth);
    }
    // checks if input number is in give interval, if it is not, repeatedly asks for new input until it is
    public static int ganzzahlInBereichLesen(Scanner console, String prompt, int max){
        while(true){
            int number = ganzZahlLesen(console, prompt);
            if(number >= 1 && number <= max){
                return number;
            }else{
                System.out.println("Nicht im geforderten Bereich.");
            }
        }
    }
    // asks user to input a number, repeats if number is not integer
    public static int ganzZahlLesen(Scanner console, String prompt){
        int number;
        while(true) {
            System.out.print(prompt);
            if(console.hasNextInt()){
                return number=console.nextInt();
            }else{
                System.out.println("Bitte ganze Zahl eingeben.");
                console.next();
            }
        }
    }
    // checks if the entered Date is a valid combination
    public static boolean checkDate(int day, int month){
        boolean valid;
        if((month ==4 || month == 6 || month == 9 || month == 11) && day == 31){
            return valid = false;
        }else if(month == 2 && day >=30){
            return valid = false;
        }else{
            return valid = true;
        }
    }
    // compares the date and prints out associated season
    public static void printSeason(int day, int month){
        if((month <= 2) || (month == 3 && day <=20)){
            System.out.println("Frühling");
        }else if((month <= 5) || (month == 6 && day <= 21)){
            System.out.println("Sommer");
        }else if((month <= 8) || (month == 9 && day <= 22)){
            System.out.println("Herbst");
        }else{
            System.out.println("Winter");
        }

    }
}
