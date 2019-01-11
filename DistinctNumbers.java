import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        int num = 0;
        int count = 0;
        int userNum;
        int distinctNumbers[];//Distinct array of numbers
        int userArray [] = new int[10];

        System.out.print("\nEnter in 10 digits: ");

        while(true) {
            try {

                userNum = input.nextInt();

                if(isNumValid(userNum) == true){
                    for(int i=0;i<userArray.length;i++){
                        if(userNum == userArray[i]){
                            break;
                        }
                        else {
                            userArray[1] = userNum;
                            count++;
                        }

                        userArray[i] = userNum;
                    }
               }
                else{
                    System.out.print("\nPlease enter a number greater than 0: ");
                    num--;
                }

                //num++;

                break;


            } catch (Exception e) {
                System.out.println("\nError! Enter a valid number " +
                                  "\nError Message: " + e.toString());
            }
        }

       displayResults(userArray);




    }

    /**
     * Display Results
     * @param distinctNumbers
     */
    public static void displayResults(int distinctNumbers[]){

         sortAscending(distinctNumbers);
          System.out.println();
          System.out.println();
          int count = 0;
        for(int element:distinctNumbers){
            if(element != 0){
                count++;
            }
        }

        System.out.print("The number of distinct numbers are: " + count);

        for(int element:distinctNumbers){
            if(element != 0){
                System.out.print("The distinct numbers is: " + element + " ");
            }
        }

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
     * Return array sorted in ascended order using selection sort
     * @param array
     */
    public static void sortAscending(int array[]){

        //Sort array in ascending order
        for(int i = 0; i<array.length-1;i++){

            int currentMin = array[i];
            int currentMinIndex = i;
            for(int j=1;j<array.length;i++){
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
