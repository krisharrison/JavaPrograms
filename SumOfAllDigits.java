import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfAllDigits{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);


        while(true){
            try {

                System.out.print("\nEnter a number: \n");
                int usrNum = input.nextInt();

                if (usrNum > 1){
                    System.out.println("\nThe sum of all the digits you have entered is " + sumOfAllDigits(usrNum));
                    break;
                }
                else{
                    System.out.print("\nPlease enter a number greater than 0!\n");
                }

            } catch (InputMismatchException e) {
                System.out.println("\nPlease enter an interger!\n ");
                input.next();
            }
        }




    }
    public static int sumOfAllDigits(int num){
        int sum = 0;
        int firstDigit;

        while(num != 0){

            firstDigit = num % 10;
            num = num / 10;

            sum = sum + firstDigit;


        }

        return sum;
    }
}
