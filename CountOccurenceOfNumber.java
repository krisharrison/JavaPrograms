import java.util.Scanner;//Import Scanner

public class CountOccurenceOfNumber {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);//Scanner
        int numbers[] = new int[100];//numbers[] size 100
        int distinct[];//distinct[]
        int processedNumbers[];//processedNumbers[]
        int count[];//count []
        int i = 0;//i = 0;
        int num = 0;//num = 0;

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

                sortAscending(numbers);//Call sortAscending(numbers)
                processedNumbers= eliminateZeros(numbers);// processedNumbers = Call eliminateZeros(numbers)
                count = count(processedNumbers);//count = count(processedNumbers
                distinct = distinctArray(processedNumbers);//distinct = distinctArray(processNumbers)
                displayNumbers(count,distinct);//DisplayNumbers

                break;
            }
            catch(Exception e){
                System.out.print("Error! Enter a valid number!");//Display error message
                input.next();//Next Line
            }
        }



    }
    /**
     * Sort array in ascending order
     * @param array
     * @return
     */
    public static int[] sortAscending(int[] array){

        for(int i =0; i < array.length - 1; i++){//Outer for loop: process array
            int currentMin = array[i];//currentMin = array[i]

            int currentMinIndex = i;//CurrentMinIndex = i
            for(int j=i + 1; j<array.length;j++){//Inner for loop: process araay
                if(array[j] < currentMin) {//If
                    currentMin = array[j];
                    currentMinIndex = j;
                }//End if
            }//end inner loop

            if(currentMinIndex != i)//If currentMinIndex does not equal i
                array[currentMinIndex] = array[i];//Switch lowest index with most left digit
                array[i] = currentMin;
        }//end outer loop

        return eliminateZeros(array);//Return eliminateZeros(array)

    }

    /**
     * Count occurences
     * @param array
     * @return
     */
   public static int[] count(int[] array){
        int count[] = new int[100];

        for(int i=0;i<array.length;i++){//Process array
            if(array[i] != 0)
            count[array[i] - 1]++;//Count appearance of each numbers
        }//End for


        return eliminateZeros(count);//return eliminateZeros(count)

    }

    /**
     * Eliminate 0's in an array
     * @param array
     * @return
     */
    public static int[] eliminateZeros(int array[]){
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
    public static int[] distinctArray(int numbers[]){
        int copy[] = new int[numbers.length];//Copy array length of numbers.length
        int index= 0;//index = 0
        int num= 0;//num = 0

        for(int i=0;i<numbers.length;i++){//process numbers array

            if(numbers[i] != num){//If number[i] == num
                copy[index++] = numbers[i];//copy[index++] = numbers[i]
                num = numbers[i];//num = numbers[i]
            }

        }

        return eliminateZeros(copy);//Return copy
    }

    /**
     *Displays results
     * @param count
     * @param numbers
     */
   public static void displayNumbers(int count[], int numbers[]){
       System.out.println("\n");//Next Line

        for(int i = 0;i<count.length;i++){//Process array
            char plural = 's';//plural = 's'
            if(count[i] > 1)//if count > 1
                System.out.printf("%d occurs %d time%c\n",numbers[i],count[i],plural);//time += plural
            else
                System.out.printf("%d occurs %d time\n",numbers[i],count[i]);//time
        }//End for loop
    }

}
