import java.util.Scanner;
import java.util.Arrays;

public class CountOccurenceOfNumber {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        int numbers[] = new int[50];
        int count[] = new int[50];
        int i = 0;
        int num = 0;

        while(true){
            try{
                System.out.print("Enter the integers. Enter 0 when transaction if finished: ");

                while(true){
                    num = input.nextInt();
                    if(num == 0){
                        break;
                    }
                    else if(num < 0 || num > 100){
                        i--;
                        System.out.println("\nInvalid number! Enter a number greater than 0: ");
                    }
                    else{
                        numbers[i] = num;
                    }

                    i++;
                }


                displayArray(numbers);
                break;
            }
            catch(Exception e){
                System.out.print("Error!Enter a valid number!");
                input.next();
            }
        }
    }

    /**
     * Display Array
     * @param array
     */
    public static void displayArray(int array[]){
        for(int num:array) {
            if(num == 0)
                break;

            System.out.print(num + " ");
        }
    }
    public static int[] sort(int[] array){
        
    }
   /*public static int[] count(int[] array){


    }*/
    public static void displayResults(int[] array){

    }

}
