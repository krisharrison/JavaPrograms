import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        int count = 0;//count = 0
        int userNum; // Init userNum
        int userArray [] = new int[10];//userArray


                System.out.print("\nEnter in 10 digits: ");//Ask for input

        while(true) {//While true
            try {
                    if(count == 10){ // if count > 10

                             int distinctNumbers[] = getDistinct(userArray);//call distinctNumbers
                            displayResults(distinctNumbers);//call displayResults*/

                             break; //break
                    }

                    userNum = input.nextInt();//Gain user input

                    if(isNumValid(userNum) == true){//If number is > 0

                        userArray[count] = userNum;//Add to array
                    }
                    else if(isNumValid(userNum) == false){
                        System.out.print("\nPlease enter a number greater than 0: ");
                        count--;
                    }



                    count++;//count increment by 1

            }//End while
            catch (Exception e) {//Catch
                System.out.println("\nError! Enter a valid number " +
                                  "\nError Message: " + e.toString());//Display error message
            }
        }


    }

    /**
     * Display Results
     * @param distinctNumbers
     */
    public static void displayResults(int distinctNumbers[]){
          System.out.println();

        System.out.print("The number of distinct numbers are: " + distinctNumbers.length);

        System.out.print("\nThe distinct numbers is: ");
        for(int element:distinctNumbers){
                System.out.print(element + " ");

        }
        System.out.println();

    }

    /**
     * Whether userNum is valid or invalid
     * @param userNum
     * @return boolean
     */
    public static boolean isNumValid(int userNum){
        if(userNum > 0) {
            return true;
        }

        return false;
    }

    /**
     * Eliminate 0's in an array
     * @param array
     * @return
     */
    public static int[] eliminateZeroes(int array[]){
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

        return copy;
    }
    /**
     * Eliminates duplicates from array
     * @param numbers
     */
    public static int[] getDistinct(int numbers[]){
        int copy[] = new int[numbers.length];//Copy array length of numbers.length
        int index= 0;//index = 0
        int num= 0;//num = 0
        sortAscending(numbers);

        for(int i=0;i<numbers.length;i++){//process numbers array

            if(numbers[i] != num){//If number[i] == num
                copy[index++] = numbers[i];//copy[index++] = numbers[i]
                num = numbers[i];//num = numbers[i]
            }

        }

        return eliminateZeroes(copy);//Return copy
    }


    /**
     * Return array sorted in ascended order using selection sort
     * @param array
     */
    public static void sortAscending(int array[]){

        //Sort array in ascending order
        for(int i = 0; i<array.length-1;i++){

            int currentMin = array[i];
            int currentMinIndex = i;

            for(int j= i + 1;j<array.length;j++){
                if(array[j] < currentMin){
                    currentMin = array[j];
                    currentMinIndex = j;
                }
            }

            //If currentMinIndex != i
            if(currentMinIndex != i)
                array[currentMinIndex] = array[i];
                array[i] = currentMin;

        }
    }
}
