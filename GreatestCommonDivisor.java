import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter a second digit: ");
        int num2 = input.nextInt();

        int gcd = 1;
        int k = 2;

        while(k <= num1 && k <= num2){
            if(num1 % k == 0 && num2 % k == 0){
                gcd = k;
            }

            k++;
        }

        System.out.println("\nThe greatest common divisor between " + num1 + " and " + num2 + " is " + gcd);


    }
}
