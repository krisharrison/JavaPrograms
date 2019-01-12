import java.util.Scanner;

public class FindTheSmallestElement {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);//Scanner called input
        int i = 0;//i = 0
        double numbers[] = new double[10];//Init numbers[10] array as double

        System.out.print("Enter 10 digits: ");

        while(i < 10) {//While i < 10
            try{//Try

                double num = input.nextDouble();

                if(isValid(num) == true){//If
                    numbers[i] = num;//numbers[i] = num
                }//End if
                else{//Else
                    System.out.println("\n" + num + " is an invalid numbers ");//Display error message
                    i--;//Decrement by 1
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
    public static void displayResults(double array[]){
            System.out.printf("\nThe smallest number:%.1f",min(array));
    }

    /**
     * Finds minimum value in array
     * @param array
     * @return
     */
    public static double min(double array[]){
        double min = array[0];

        for(double e:array)
            if(e < min)
                min = e;


        return min;
    }

    /**
     * Number is valid if num > 0
     * @param num
     * @return
     */
    public static boolean isValid(double num){
        if(num > 0)
            return true;

        return false;
    }
}
