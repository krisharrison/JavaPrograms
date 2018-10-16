import java.util.Scanner;

public class  CdValue{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial amount: ");
        double amount = input.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter the maturity period: ");
        int maturityPeroid = input.nextInt();

        displayCD(amount, annualInterestRate, maturityPeroid);

    }
    public static void displayCD(double amount, double annualInterestRate, int numOfMonths){
        double cd = amount + amount * annualInterestRate / 1200;
        double result;

        System.out.printf("\nMonth 1: %.2f", cd);
        for(int i = 2; i <= numOfMonths; i++){


            cd = cd + cd * annualInterestRate / 1200;

            System.out.printf("\nMonth %d: %.2f", i, cd);

        }

    }
}