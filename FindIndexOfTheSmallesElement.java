import java.util.Scanner;

public class FindIndexOfTheSmallesElement {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);//Scanner
        int i =0;//i = 0
        int numbers[] = new int[10];//Init numbers[] of size 10

        System.out.print("Enter 10 digits: ");//Display messge

        while(i<10){//While i < 10
            try{//Try

                int userNum = input.nextInt();//User input

                if(isValid(userNum)){//If userNum is valid
                    numbers[i] = userNum;//numbers[i] = userNum
                }//End if
                else{//Else
                    System.out.print("\n" + userNum + " is not a valid number!" + "\nEnter a valid Numbers: ");//Display error message
                    i--;//Decrement 1
                }//End else

                i++;//Increment by 1
            }//End try
            catch(Exception e){//Catch
                System.out.print("\nError! Enter a valid numbers!");//Error message
                input.next();//Next line
            }//End catch
        }//End while

        displayResults(numbers);

    }
    /**
     * Display results
     * @param array
     */
    public static void displayResults(int array[]){
        System.out.printf("\nThe index of the smallest element is:%d\n",indexOfSmallestElement(array));
    }
    /**
     * Find index of the smalles element
     * @param array
     * @return
     */
    public static int indexOfSmallestElement(int array[]){
        int minNum = array[0];//minNum = array[0]
        int minIndex = 0;//minIndex = 0

        for(int i=0;i<array.length;i++){//For
            if(array[i]<minNum) {
                minNum = array[i];//minNum = array[i]
                minIndex = i;//minIndex = i
            }

        }//End for

        return minIndex;//Return minIdex
    }

    /**
     * Determine whether number is valid
     * @param num
     * @return
     */
    public static boolean isValid(int num){
        if(num > 0)//If Num > 0
            return true;//Return true

        return false;//Else return false
    }
}
