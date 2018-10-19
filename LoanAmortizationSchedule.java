import java.text.DecimalFormat;
import java.util.Scanner;

public class LoanAmortizationSchedule {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        double remainingBalance;
        int numberOfYears;
        double interestRate;
        double principal;
        double monthlyInterest;


        System.out.print("Please enter the loan Amount: ");
        remainingBalance = input.nextDouble();

        System.out.print("\nPlease enter the number of years: ");
        numberOfYears = input.nextInt();

        System.out.print("\nPlease enter the annual interest rate: ");
        interestRate = input.nextDouble();

        double monthlyInterestRate = interestRate / 1200;
        double monthlyPayment = remainingBalance * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;



        System.out.printf("\nMonthly Payment: %.2f\nTotal Payment: %.2f\n",monthlyPayment,totalPayment);


        System.out.println("Payment#\t\t Interest\t\t\t Principal\t\t Balance");

        for(int paymentNumber = 1; paymentNumber <= 12; paymentNumber++){

            monthlyInterest = monthlyInterestRate * remainingBalance;
            principal = monthlyPayment  - monthlyInterest;
            remainingBalance = remainingBalance - principal;


            System.out.printf("%d\t\t\t\t %.2f\t\t\t %.2f\t\t %.2f\n",paymentNumber, monthlyInterest, principal, remainingBalance);


        }

    }
}
