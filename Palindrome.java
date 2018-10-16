import java.util.InputMismatchException;
import java.util.Scanner;

<<<<<<< HEAD:Palindrome.java
public class Palindrome {
=======
public class Palindrome{
>>>>>>> da761114ee7b5eecc0435747cc38436eb932e7d7:Palindrome.java
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        while(true) {
            try {
                System.out.print("\nPlease Enter An Integer: ");
                int num = input.nextInt();

                if(num > 9){
                    System.out.print(reverseNum(num) + "\n");
                    System.out.print(isPalindrome(num) + "\n");
                    break;
                }
                else if(num > 0 && num < 10){
                    System.out.println("\n Please Enter an Interger That is Greater Than 9:");
                }
                else if(num < 0){
                    System.out.println("\nPlease  A Positive Integer:");
                }
            } catch (InputMismatchException E) {
                System.out.println("Please enter integer");
                input.next();
            }
        }



    }
    public static int reverseNum(int num){

        int reverseInt = 0;

        while(num != 0){

            reverseInt = reverseInt * 10 + num % 10;
            num = num / 10;

        }
        return reverseInt;
    }
    public static boolean isPalindrome(int num){

        boolean palindrome = false;

        if(reverseNum(num) == num){
            palindrome = true;
        }

        return palindrome;
    }
}
