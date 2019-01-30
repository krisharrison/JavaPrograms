import java.util.Random;
import java.util.Scanner;

public class RandomNumberChooser {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);//Scanner;
        System.out.print("Enter 4 digits: ");//Display Message



        while(true){//While
            try{//Try

                int userNum = input.nextInt();//userNum = input.nextInt()

                if(!isValid(userNum) || userNum == 0){//Else //34 45 1 20
                    break;
                }//End else
                else{//If userNum is valid
                    displayResults(userNum);//Call displayResults
                }//End if



            }//End try
            catch(Exception e){//Catch
              System.out.print("\nError!Enter a number! ");//Error message
              input.next();//Next line
            }//End catch
        }//End while
    }


    /**
     * Dispaly results
     * @param numbers
     */
    public static void displayResults(int...numbers){
        //Display results
        for(int e:numbers){
            System.out.printf(" %d", getRandom(e));
        }
    }

    /**
     * Return random number that hasn't been passes as a parameter and between 1 && 54
     * @param numbers
     * @return
     */
    public static int getRandom(int...numbers){
        Random rand = new Random();//Random object
        int randNum = 0;//randNum
        int count = 0;//Count = 0
        int index = 0;


        while(count < numbers.length){//While
            randNum = (rand.nextInt(54) + 1);//Random number between 1 and 54


            /*
            Does not matter if random numbers being returned are the same, as long as they're between 1 and 54
            and not the numbers that are entered

            Try to compare random number to each number in the numbers array.
            If random number does not match any of the numbers in the array.
            return randNum.
            Else assign a new random number to randNum until a random number is stored in randNum does not equal
            any of the numbers stored in the numbers array
             */

            for(int i=0;i<numbers.length;i++){//for
               if(numbers[i] == randNum){
                    break;
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
