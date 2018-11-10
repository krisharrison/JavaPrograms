import java.util.Scanner;

public class PalindromicPrime {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int numOfPrimes = input.nextInt();

        displayPalindromicPrime(numOfPrimes);





    }
    public static void displayPalindromicPrime(int numOfPrimes){
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int num = 2;

        while(count < numOfPrimes){

            if(isPrime(num) == true && isPalindrome(num) == true) {
                count++;


                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.printf("%-10d\n", num);
                } else {
                    System.out.printf("%-10d", num);
                }
            }
            num++;
        }
    }
    public static boolean isPalindrome(int num){
        boolean isPalindrome = false;
        int remainingDigits = num;
        int reverseNum = 0;

        while(remainingDigits != 0){

            reverseNum *= 10;
            reverseNum += (remainingDigits % 10);
            remainingDigits /= 10;
        }

        if(num == reverseNum){
            isPalindrome = true;
        }

        return isPalindrome;
    }
    public static boolean isPrime(int num){

        for(int divisor = 2; divisor <= num/2; divisor++) {
            if (num % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
