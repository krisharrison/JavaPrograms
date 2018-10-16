import java.util.Scanner;

public class CompoundValue {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly amount: ");
        double monthlyAmount = input.nextDouble();

        System.out.print("Please enter the annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Please enter the number of months: ");
        int numOfMonths = input.nextInt();

        displayMonthlySavings(monthlyAmount, annualInterestRate, numOfMonths);

    }
    public static void  displayMonthlySavings(double monthlyAmount, double annualInterestRate, int numOfMonths){

        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlySavings = monthlyAmount * (1 + monthlyInterestRate);
        double result;

        System.out.printf("\nMonth 1: %.2f", monthlySavings);
        for(int i = 2; i <= numOfMonths; i++){

            result = (monthlyAmount + monthlySavings);
            monthlySavings = result * (1 + monthlyInterestRate);

            System.out.printf("\nMonth %d: %.2f", i, monthlySavings);

        }
    }

}
