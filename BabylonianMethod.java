import java.util.Random;
import java.util.Scanner;

public class BabylonianMethod {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);//Scanner

        while(true){//While
            try{//Try
                System.out.print("\nPlease enter in a positive integer greater than 0: ");
                int n = input.nextInt();//Gain input from user as in. Stored in n

                if(n < 1) {//If n is less than 1
                    System.out.print("\nInvalid!");//User input is invalid
                }
                else {//else
                    System.out.printf("\nApproximate square root of %d is: %.4f", n, sqrt(n));//Output results to console
                    break;//break while
                }
            }//End try
            catch(Exception e){//catch
                System.out.println("\nInvalid!");
                input.next();
            }//end catch
        }//End while


    }

    /**
     * Finds the approximate square root of n using the babylonian method
     * @param n
     * @return double
     */
    public static double sqrt(int n){
        double sqrt = 0.0; //Declare sqt as a double. Init  to 0.0
        int guess = 1 + n; //Declare guess as an Integer. Init to n + 1
        Random num = new Random(); // Create random object
        double lastGuess = 10; //num.nextInt(guess); // Store random number to last guess. Pass guess through nextInt
        double nextGuess = 0.0; // Declare nextGuess as a double. Init nextGuess to 0


        while (true){//While loop

            nextGuess = (lastGuess + n / lastGuess) / 2;//Babylonian formula to approximate square root

            if(((lastGuess - nextGuess) < 0.001)){//If nextGuess and lastGuess is similar
                sqrt = nextGuess;// Init sqrt to nextGuess
                break;//Break while loop
            }//End if
            else {//Else
                lastGuess = nextGuess; //Init lastGuess to nextGuess
            }//End else

        }//End While
        return sqrt;//Return sqrt as a double
    }
}
