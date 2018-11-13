import java.util.Scanner;
import java.util.Random;

public class Craps{
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        while(true) {
            try {

            } catch (Exception e) {

            }
        }


    }

    /**
     * Display results
     */
    public static void displayResults(){
        int die1 = rollDie();
        int die2 = rollDie();
        int diceTotal = die1 + die2;//Dice total




    }
    /**
     * Roll Die
     * @return Integer
     */
    public static int rollDie(){
        Random die = new Random();

        return die.nextInt((6-1) + 1) + 1;//return random number between 1 and 6
    }
}
