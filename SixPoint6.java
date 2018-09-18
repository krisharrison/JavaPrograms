import java.util.Scanner;
import java.util.InputMismatchException;

public class SixPoint6 {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            try {

                System.out.print("Please enter an integer: ");
                int num = input.nextInt();

                if(num < 2){
                    System.out.println("Please enter a number greater than 1");
                }
                else{

                    displayPattern(num);
                    break;
                }

            } catch (InputMismatchException e) {

                System.out.println("Please enter a valid number");
                input.next();
            }
        }
    }
        public static void displayPattern(int num){

        for(int i = 1; i < num; i++){
                System.out.println(i);
                for(int j = 0; num > j; num--){

                    System.out.print(num + " ");
                }
                System.out.println("");
            }
    }
}
