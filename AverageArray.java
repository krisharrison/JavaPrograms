import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//New Scanner called input

        System.out.print("Enter 10 digits: ");//Display message

        int i = 0;//i = 0
        double numbers[] = new double[10];//Init numbers[]

        while(i < 10){//While
            try{

                double num = input.nextDouble();

                if(isNumValid(num) == true){//If
                    numbers[i] = num;//Numbers[i] = num
                }//End if
                else{//Else
                    System.out.print("\n" + num + " is an invalid Number!");
                    i--;
                }//End else


               i++;// increment by 1
            }
            catch(Exception e){//Catch
                System.out.print("\nError! Enter a valid numbers!");//Error message
                input.next();//Next line
            }
        }//End while

        double average = average(numbers);//Call average. Store in average
        System.out.printf("\nThe average of the array is %.2f", average);//Display results
    }

    /**
     * Calculate average
     * @param array
     * @return
     */
    public static int average(int array[]){
        int total = 0;//Total = 0
        int average;//Average

        for(int i = 0; i<array.length;i++){//For
            total += array[i];//Total = total + array[i]
        }//End for

        average = total / array.length;//Calculate average

        return average;//Return average
    }

    /**
     * Calculate average
     * @param array
     * @return
     */
    public static double average(double array[]){
        double total = 0;//Total = 0
        double average;//Average

        for(int i = 0; i<array.length;i++){//For
            total += array[i];//Total = total + array[i]
        }//End for

        average = total / array.length;//Calculate average

        return average;//Return average
    }

    /**
     * Is number valid
     * @param num
     * @return
     */
    public static boolean isNumValid(double num){
        if(num > 0)//If num > 0
            return true;//Return true

       return false;//Else return false
    }
}
