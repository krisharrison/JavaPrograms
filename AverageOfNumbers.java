import java.util.Scanner;
import java.util.InputMismatchException;

public class AverageOfNumbers {
    public static void main(String [] args){


        Scanner input = new Scanner(System.in);


        int num= -1;
        int numOfPosNums= 0;
        int numOfNegNums= 0;
        double numOfNums = 0;
        double total = 0;

       while(num != 0) {
           try {
               System.out.println("Enter a number: ");
               num = input.nextInt();

               if(num > 0){
                    numOfPosNums++;
                    numOfNums++;
                    total = total + num;
               }
               else if(num < 0){
                    numOfNegNums++;
                    numOfNums++;
                    total = total + num;
               }



           }catch(InputMismatchException E){
               System.out.println("Please enter an interger: ");
               input.next();
           }


       }

        double average = total / numOfNums;

        System.out.printf("%nNumber of positives: %d%n Number of Negatives: %d%n " +
                        "The total: %.1f%n The average is: %.2f%n", numOfPosNums, numOfNegNums, total,
                average);



    }

}
