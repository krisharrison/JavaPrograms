import java.util.Scanner;

public class SixPoint7 {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial investment amount: ");
        double initialInvestment = input.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        displayFutureInvestments(initialInvestment, monthlyInterestRate, years);


    }
    public static void displayFutureInvestments(double investmentAmount, double monthlyInterestRate, int numOfYears){
        /*System.out.print("\n\nYears     Future Value");
        for(int i = 1; i <= numOfYears; i ++){
            System.out.printf("\n %d\t\t\t%.2f", i, calcFutureInvestment(investmentAmount,monthlyInterestRate,i));
        }*/

        System.out.printf("\n %.2f", calcFutureInvestment(investmentAmount,monthlyInterestRate,numOfYears));
    }
    public static double calcFutureInvestment(double investmentAmount, double monthlyInterestRate, int numOfYears) {

        return investmentAmount * Math.pow((1 + monthlyInterestRate), numOfYears);
    }

}
