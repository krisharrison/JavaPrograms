import java.util.Random;
import java.util.Scanner;

/*
I'm aware I could of passed an array through displayResults because it would be a lot less code and a lot cleaner
In the spirit of the exercise I chose to as for each individual digit and pass each digit using variable-length argument list.
 */

public class RandomNumberChooser {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);//Scanner;
        System.out.print("Enter 10 digits: ");//Display Message
        //34 45 1 20 12 4 8 40 18 39


        int userNum = input.nextInt();//userNum = input.nextInt()
        int userNum2 = input.nextInt();//userNum = input.nextInt()
        int userNum3 = input.nextInt();//userNum = input.nextInt()
        int userNum4 = input.nextInt();//userNum = input.nextInt()
        int userNum5 = input.nextInt();//userNum = input.nextInt()
        int userNum6 = input.nextInt();//userNum = input.nextInt()
        int userNum7 = input.nextInt();//userNum = input.nextInt()
        int userNum8 = input.nextInt();//userNum = input.nextInt()
        int userNum9 = input.nextInt();//userNum = input.nextInt()
        int userNum10 = input.nextInt();//userNum = input.nextInt()



        displayResults(userNum,userNum2, userNum3, userNum4, userNum5, userNum6, userNum7, userNum8, userNum9, userNum10);//Call displayResults


    }


    /**
     * Dispaly results
     * @param numbers
     */
    public static void displayResults(int...numbers){
        //Display results

        System.out.printf("\nYour number: %d\n", getRandom(numbers));
    }

    /**
     * Return random number that hasn't been passes as a parameter and between 1 && 54
     * @param numbers
     * @return
     */
    public static int getRandom(int...numbers){
        Random rand = new Random();//Random object
        int randNum = 0;//randNum
        int counter = 0;//counter = 0

        while(counter < numbers.length){//While
            randNum = (rand.nextInt(54) + 1);//Random number between 1 and 54
            counter = 0;//innerCounter = 0


            for(int i=0;i<numbers.length;i++){//for

                if(randNum != numbers[i]) {
                    counter++;
                }
            }//end for


        }//End while


         return randNum;//Return randNum
    }

    /**
     * Determine whether number is valid
     * @param num
     * @return
     */
    public static boolean isValid(int num){
        if(num >= 1 || num <= 54)//If num is between 1 and 54
            return true;//Return true

            return false;//Return false
    }
}
