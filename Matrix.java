import java.util.Random;
import java.util.Scanner;

public class Matrix{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the size of the matrix: ");
        int n = input.nextInt();


        printMatric(n);


    }
    public static void printMatric(int n){

        int[][] matrix = new int[n][n];
        Random rnd = new Random();

        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                matrix[row][column] += rnd.nextInt(2);
            }
        }

        for(int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
}
