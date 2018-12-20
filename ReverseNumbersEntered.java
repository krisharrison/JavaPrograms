import java.util.Scanner;

public class ReverseNumbersEntered {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        int numbers [] = new int[10];

        while(true){
            try{
                System.out.print("Enter 10 integers: ");
                for(int i=0;i<numbers.length;i++){
                        numbers[i] = input.nextInt();
                }

                for(int num:reverseArray(numbers)){
                    System.out.print(num + " ");
                }

                break;
            }
            catch(Exception e){
                System.out.println("Error! Enter a valid integer");
                input.next();
            }
        }


    }

    /**
     * Reverse Array
     * @param array
     * @return
     */
    public static int[] reverseArray(int [] array){
        int [] copy = new int[array.length];

        for(int i= 0,j=array.length -1 ;i < array.length; i++, j--){
            copy[j] = array[i];
        }

        return copy;
    }
}
