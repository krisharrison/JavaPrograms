import java.util.Scanner;

public class CountOccurenceOfNumber {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        int numbers[] = new int[100];
        int processedNumbers[];
        int count[];
        int i = 0;
        int num = 0;

        /*while(true){
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

                sortAscending(numbers);
                displayArray(numbers);
                eliminateZeros(numbers);
                count = count(processedNumbers);


                break;
            }
            catch(Exception e){
                System.out.print("Error! Enter a valid number!");
                input.next();
            }
        }*/


        int array[] = new int[6];
        array[0] = 2;
        array[1] = 3;
        array[2] = 2;
        array[3] = 3;
        array[4] = 5;
        array[5] = 1;

        displayArray(array);

        for(int number:array)
            System.out.print(number + " ");
    }

    /**
     * Display Array
     * @param array
     */
    public static void displayArray(int array[]){

        for(int num:array) {//For Loop: process array

                System.out.print(num + " ");//Display element

        }//End for loop
    }

    /**
     * Sort array in ascending order
     * @param array
     * @return
     */
    public static void sortAscending(int[] array){

        for(int i =0; i < array.length - 1; i++){//Outer for loop: process array
            int currentMin = array[i];//currentMin = array[i]

            int currentMinIndex = i;//CurrentMinIndex = i
            for(int j=i + 1; j<array.length;j++){//Inner for loop: process araay
                if(array[j] < currentMin) {//If
                    currentMin = array[j];
                    currentMinIndex = j;
                }
            }//end inner loop

            if(currentMinIndex != i)
                array[currentMinIndex] = array[i];
                array[i] = currentMin;

        }//end outer loop

    }

    /**
     * Count occurences
     * @param array
     * @return
     */
   public static int[] count(int[] array){
        int count[] = new int[100];

        for(int i=0;i<array.length;i++){
            if(array[i] != 0)
            count[array[i] - 1]++;
        }

       eliminateZeros(count);

        return count;
    }

    /**
     * Eliminate 0's in an array
     * @param array
     * @return
     */
    public static void eliminateZeros(int array[]){
        int count = 0;//count = 0
        for(int num:array) {//Determine size of array without zeros
            if (num != 0)
                count++;//count increment + 1
        }//End for loop

        int copy[] = new int[count];//New array of size count
        int index = 0;
        for(int i = 0; i < array.length; i++) {//copy array[] to copy[]
            if (array[i] != 0) {//If array at i != 0
                copy[index++] = array[i];//Copy at index i = array
            }
        }//End For Loop

    }

    /**
     * Eliminates duplicates from array
     * @param numbers
     */
    public static int[] distinctArray(int numbers[]){
        int copy[] = new int[numbers.length];//Copy array length of numbers.length
        int index= 0;//index = 0
        int num= 0;//num = 0

        for(int i=0;i<numbers.length;i++){//process numbers array
            num = numbers[i + 1];
            if(){
                copy[index++] = numbers[i];
            }
        }

        return copy;
    }

    /**
     *Displays results
     * @param count
     * @param numbers
     */
   public static void displayNumbers(int count[], int numbers[]){

    }

}
