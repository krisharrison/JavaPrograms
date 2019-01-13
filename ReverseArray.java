import java.util.Scanner;

public class ReverseArray{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);//Scanner declared as input
        int i = 0;//i = 0
        int count = 0;//count = 0
        int numbers[] = new int[10];//Init array numbers[] size of 10

        System.out.print("Enter 10 digits: ");//Display message

        while(i<10){
            try{

                int userNum = input.nextInt();//User input

                if(isValid(userNum)){//If
                    numbers[i] = userNum;//numbers[i] = userNum
                }//End if
                else{//Else
                    System.out.println("\n" + userNum + " is invalid " + "\nEnter a valid numbers: ");//Error message
                    i--;//let user enter
                }//End else

                i++;//Increment by 1
            }
            catch(Exception e){//Catch
                System.out.println("\nError! Enter a valid numbers!");//Error message
                input.next();//Next line
            }//End Catch
        }

        displayResults(numbers);//Call displayResults
    }

    /**
     * Dipslay results
     * @param array
     */
    public static void displayResults(int array[]){
            int reverseArray[] = reverseArray(array);//call and store reverseArray

            System.out.println();//Next line
            for(int e:reverseArray)//Process array
                System.out.print(e + " ");//Display results
    }

    /**
     * Reverse array
     * @param array
     * @return
     */
    public static int[] reverseArray(int array[]){
        int copy[] = new int[10];//Init copy[] with a size of 10

        //Reverse array
        for(int i=0, j=copy.length-1;i<array.length;i++,j--){
            copy[j] = array[i];
        }

        return copy;//Return copy
    }

    /**
     * Determines whether numbers is valid
     * @param num
     * @return
     */
    public static boolean isValid(int num){
        if(num > 0)//If num > 0
            return true;//Return true

        return false;//Return false
    }

    /**
     * Sort array in ascending order using selection sort
     * @param array
     */
    public static void sortAscending(int array[]){

        //Sort array in ascending order
        for(int i=0;i<array.length-1;i++){
            int minNum = array[i];
            int minNumIndex = i;
            for(int j=i+1;j<array.length;j++){
                if(array[j] < minNum)
                    minNum = array[j];
                    minNumIndex = j;
            }

            //Switch values
            if(minNumIndex != i)
                array[minNumIndex] = array[i];
                array[i] = minNum;
        }
    }
}
