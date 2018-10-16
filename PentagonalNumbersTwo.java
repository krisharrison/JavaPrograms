import java.util.Scanner;

<<<<<<< HEAD:PentagonalNumbersTwo.java
public class PentagonalNumbersTwo {
=======
public class PentagonalNumbersTwo{
>>>>>>> da761114ee7b5eecc0435747cc38436eb932e7d7:PentagonalNumbersTwo.java
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the amount of pentagonal numbers you would like to see: ");
        int pentNums = input.nextInt();

        displayPentNums(pentNums);

    }
    public static void displayPentNums(int n){

        int pentNum = 0;

        for(int i = 0; i < n; i++){
            pentNum = i * (3 * i - 1) / 2;
            System.out.print(pentNum);
            System.out.println("");
        }
    }
}
