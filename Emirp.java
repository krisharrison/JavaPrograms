import java.util.Scanner;

public class Emirp {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        while(true){//While
            try {//Try

                System.out.print("\nEnter the number of Emirp you would like: ");
                int numOfPrimes = input.nextInt();//Gain input from user

                if (numOfPrimes > 0) {//If numOfPrimes greater than 0
                    System.out.println("Emirp numbers:");
                    displayEmirp(numOfPrimes);//Call displayEmirp
                    break;
                }//End if
                else{//else
                    System.out.println("Please enter a number that is greater than 0");
                }//End else

            }//End try
            catch (Exception e) {//Catch
                System.out.println("Invalid! Please enter a valid integer!");
                input.next();
            }//End catch
        }//End while*


    }

    /**
     *  Display Emirp numbers
     * @param numOfPrimes
     */
    public static void displayEmirp(int numOfPrimes){
        final int NUMBERS_PER_LINE = 10; //Number of numbers per line
        int count = 0; // count = 0
        int num = 2;// num = 2
        int reverseNum; //Reverse num

        while(count < numOfPrimes){//While
            reverseNum = reverseNum(num);//Store returned value from reverseNum
            if(isPrime(num) == true && isPrime(reverseNum) == true && isPalindrome(num) == false){//If reverseNum && num is prime && palindromic
                count++;//Increase counter by 1

                if(count % NUMBERS_PER_LINE == 0){//Inner If
                    System.out.printf("%10d\n", num);//Display number, move cursor to next line
                }//End inner If
                else{//Inner else
                    System.out.printf("%10d", num);//Display number
                }//End inner else
            }//End outer if

            num++;//Increase num by 1
        }//End while
    }

    /**
     * Reverse number
     * @param num
     * @return Int
     */
    public static int reverseNum(int num){
        int remainingDigits = num; //Num stored in remainingDigits
        int reverseNum = 0;//Store number in reverse

        while(remainingDigits != 0){//While
            reverseNum *= 10;//Shift digits to the left
            reverseNum += (remainingDigits % 10);//add furthest digit to the right to reverseNum
            remainingDigits /= 10;//Eliminate furthest digit to the right
        }//End while



        return reverseNum; //Return reverseNum
    }
    /**
     * Is a number a palindrome
     * @param num
     * @return boolean
     */
    public static boolean isPalindrome(int num){
        int remainingDigits = num;//RemainingDigits declared as int, init as num(user input)
        int reverseNum = 0;//Reverse num declared as int, init as 0

        while(remainingDigits != 0){//While

            reverseNum *= 10;//Move decimal to the right
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
            if (num % divisor == 0) {//Determine whether number is prime
                return false;//return false
            }
        }//End of for loop

        return true; //return true
    }
}
