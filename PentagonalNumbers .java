import java.util.Scanner;

public class PentagonalNumbers{
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        int n = 5;

        while (n != 0) {
            try {
                System.out.print("Enter a value to display a pentagonal number:\n");
                 n = input.nextInt();

                System.out.println("Pentagonal Number: \n" + getPentagonalNumber(n));
                break;

            } catch (Exception exception) {
                System.out.println("Please enter an Integer \n");
                input.next();
            }


        }
    }
    public static int getPentagonalNumber(int n){

        int pentNum = n * (3 * n - 1) / 2;

        return pentNum;
    }
}
