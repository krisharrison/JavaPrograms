import java.util.Scanner;

public class DaysInAYear{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a year: ");
        int year = input.nextInt();

        displayNumOfDays(year);

    }
    public static void displayNumOfDays(int year){
        System.out.printf("\nThe number of days in %d is %d\n", year, numberOfDaysInYear(year));
    }
    public static int numberOfDaysInYear(int year){
        int numberOfDays = 0;

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            numberOfDays = 366;
        else
            numberOfDays = 365;

        return numberOfDays;
    }
}
