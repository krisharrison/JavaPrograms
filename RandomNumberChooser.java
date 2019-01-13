import java.util.Random;
import java.util.Scanner;

public class RandomNumberChooser {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);//Scanner;
        System.out.print("Enter 10 digits: ");//Display Message



        while(true){//While
            try{//Try

                int userNum = input.nextInt();//userNum = input.nextInt()

                if(!isValid(userNum) || userNum == 0){//Else
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


        //34 45 1 20
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
        int randNum = 0;
        int count = 0;
        /*for(int i = 0; i < numbers.length;i++)//Process array
         if(randNum == numbers[i]){//Outer If
             if(randNum == 54) {//Inner If randNum == 54
                 randNum -= 1;
             }//End inner if
             else{//Else
                 randNum++;//Increment by 1
             }//Else
         }//End outer if*/


        while(count != numbers.length){//While
            randNum = (rand.nextInt(54) + 1);//Random number between 1 and 54
            count = 0;//Reset count



            for(int i=0;i<numbers.length;i++){//for
                if(randNum != numbers[i]) {//if randNum != numbers[i]
                    count++;//increment by 1
                }
                else if(randNum == numbers[i]){
                    count--;
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
