import java.util.Scanner;

public class ComputingGCD {
    public static void main(String [] args){
        int numbers [] = new int[5];//numbers array
        int i = 0;// i = 0
        int userNum;//24 96 144 84 60

        Scanner input = new Scanner(System.in);//Scanner object named input

        System.out.print("Enter five digits: ");//Display message

        while(i < numbers.length){//while i < numbers.length
            try{//Try

                userNum = input.nextInt();//Attain user input

                if(isValid(userNum)){//If number is valid
                    numbers[i] = userNum;//Add to numbers array
                }//end if
                else{//else
                    System.out.println("Error! Enter a number greater than 0\n");//Display error message
                    i--;//Decrement i by 1
                }

                i++;//Increment by 1
            }//End try
            catch(Exception e){//Catch
                System.out.println("Error!Enter an integer!\n");//Display error message
                input.next();//next Line
            }//End catch
        }//End while


        displayResults(numbers);


    }

    /**
     * Display Results
     * @param numbers
     */
    public static void displayResults(int...numbers){

        int gcd = gcd(numbers);//gcd = gcd(numbers)

        System.out.printf("\nThe GCD is: %d", gcd);//Display results to console
    }

    /**
     * get GCD
     * @param numbers
     * @return
     */
    public static int gcd(int...numbers){
        int k = 2;//k = 0
        int n = min(numbers);//n = min(numbers)
        int gcd = 1;//Gcd = 0;
        int count = 0;//Count = 0;

        while(k <= n){//While k <= n

            for(int i = 0; i < numbers.length; i++){//For

                if(numbers[i] % k == 0)//if numbers[i] is divisible by k
                    count++;//Increment by1
            }//End for

            if(count == numbers.length)//If count == numbers.length
                gcd = k;//GCD = k

            k++;//Increment by 1
            count = 0;
        }//End while

        return gcd;//Return GCD
    }

    /**
     * Get the smallest number from array
     * @param numbers
     * @return
     */
    public static int min(int...numbers){
        int minNum = numbers[0];//minNum = numbers[0]

        for(int i = 0; i < numbers.length; i++){//For
            if(numbers[i] < minNum){//if numbers[i] < minNum
                minNum = numbers[i];//minNum = i;
            }//End if
        }//End for

        return minNum;//Return minNum
    }

    /**
     * Determines if number is valid
     * @param num
     * @return
     */
    public static boolean isValid(int num){

        if(num > 0)//if Num > 0
            return true;//Return true

        return false;//Return false
    }
}
