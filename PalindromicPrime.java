import java.util.Scanner;

public class PalindromicPrime {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        while(true){//While
            try {
                System.out.print("\nEnter a number: ");
                int numOfPrimes = input.nextInt();//Input from user as int

                if (numOfPrimes > 0) {//Begin If
                    System.out.println("\nPrimes:");
                    displayPalindromicPrime(numOfPrimes);//Call displayPalindromicPrime
                    break;//Break while loop
                } //End if
                else {//else
                    System.out.print("\nInvalid! Please enter a valid number");//Display error message
                }//End else
            } catch (Exception e) {//Catch
                System.out.print("\nInvalid! Please enter an integer"); //Display error message
                input.next();
            }//End of Catch
        }//End of While






    }

    /**
     * Displays palindromic numbers
     * @param numOfPrimes
     */
    public static void displayPalindromicPrime(int numOfPrimes){
        final int NUMBER_OF_PRIMES_PER_LINE = 10;//Number of primes per line declared as int, init as 10
        int count = 0;//count declared as int, init as 0
        int num = 2;//num declared as int, init as 2

        while(count < numOfPrimes){//While

            if(isPrime(num) == true && isPalindrome(num) == true) {//If
                count++;


                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {//If
                    System.out.printf("%-10d\n", num);//Display palindromic number, go to next line
                } //End if
                else {//Else
                    System.out.printf("%-10d", num);//Display palindromic number
                }//End else
            }//End if
            num++;
        }//End while
    }

    /**
     * Is a number a palindrome
     * @param num
     * @return boolean
     */
    public static boolean isPalindrome(int num){
        int remainingDigits = num;//RemainingDigits declared as int, init as num(user input)
        int reverseNum = 0;//Revese num declared as int, init as 0

        while(remainingDigits != 0){//While

            reverseNum *= 10;//Move decial to the right
            reverseNum += (remainingDigits % 10);//Extract digit furthest to the right
            remainingDigits /= 10;//Get rid of digit furthest to the right
        }//End while

        if(num == reverseNum){//if Begin
            return true; // return true
        }//End if

        return false;//return false
    }

    /**
     * Is number a prime
     * @param num
     * @return boolean
     */
    public static boolean isPrime(int num){

        for(int divisor = 2; divisor <= num/2; divisor++) {//For loop
            if (num % divisor == 0) {//Determine whether number
                return false;//return false
            }
        }//End of for loop

        return true; //return true
    }
}
