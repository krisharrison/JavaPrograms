import java.util.Scanner;
import java.util.InputMismatchException;

public class SixPoint5{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        while(true){
            try{
                System.out.println("Enter a number: ");
                double num1 = input.nextDouble();

                System.out.println("Enter a second number: ");
                double num2 = input.nextDouble();

                System.out.println("Enter a third number: ");
                double num3 = input.nextDouble();

                if(num1 IntegerReverse< 0 || num2 < 0 || num3 < 0){
                    System.out.println("Please enter a positive value");
                }
                else{
                    sort(num1, num2, num3);
                    break;
                }

            }catch(InputMismatchException e){

                System.out.println("Please enter a  number");

            }
        }

    }
    public static void sort(double num1, double num2, double num3){

        double temp;

        for(int i = 0; i < 3; i ++){

            if(num1 > num2 && num1 > num3){
                temp = num1;
                num1 = num3;
                num3 = temp;
            }
            if(num1 > num2 && num1 < num3){
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
            if(num2 > num1 && num2 > num3){
                temp = num2;
                num2 = num3;
                num3 = temp;
            }
        }

        System.out.println(num1 + " " + num2 + " " + num3);
    }
}
