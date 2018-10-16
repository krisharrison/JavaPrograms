import java.util.InputMismatchException;
import java.util.Scanner;


public class IntegerReversed{

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter An Integer: ");
                int num = input.nextInt();

                if (num > 0 && num < 9){
                    System.out.println("Please enter a number greater than" +
                            " 9: ");
                }
                else if(num < 0){
                    System.out.println("Please enter a positive integer: ");
                }
                else{
                    System.out.println(reverseNum(num));
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please Enter An Interger!");
                input.next();
            }

        }
    }
    public static int reverseNum(int num){

        int reverseNum = 0;

        while(num != 0){

            reverseNum = reverseNum * 10 + num % 10;
            num = num / 10;
        }

        return reverseNum;
    }
}
