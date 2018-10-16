import java.util.Scanner;


public class InterestRates {
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);


        double annualInterestRate = 5;
        double monthlyInterestRate = annualInterestRate / 1200 ;
        double monthlyPayment;
        double totalPayment;
        double loanAmount;
        double numberOfYears;
        final double MAX_INTEREST_RATE = 8;




        System.out.print("Enter a loan amount: ");
        loanAmount = input.nextDouble();


        System.out.print("Please enter the number of years: ");
        numberOfYears = input.nextDouble();

        System.out.println();
        System.out.print("Interest Rate     Monthly Payment     Total Payment\n");
        while(annualInterestRate <= MAX_INTEREST_RATE){

            monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
            totalPayment = monthlyPayment * numberOfYears * 12;



            System.out.printf("%.3f\t\t\t\t%.2f\t\t\t\t%3.2f\n", annualInterestRate, monthlyPayment, totalPayment);


            annualInterestRate = annualInterestRate + 0.125;
            monthlyInterestRate = annualInterestRate / 1200;
        }

    }

}
