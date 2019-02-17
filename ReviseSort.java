import java.util.Scanner;

public class ReviseSort {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);//Scanner
        double [] list = new double[10];//list array of double
        int k = 0;//k = 0;
        int n = list.length;//n = 10
        double userNum;//userNum
        // 1092.9 2.3 -110 60.4 22.1 519.0 210.12  89.2 43.89 -420.39

        System.out.print("Enter 10 digits: ");

        while(k < n){//While k < n
            try{//Try

                userNum = input.nextDouble();//Store user input in userNum
                list[k] = userNum;//Insert userNum in array

                k++;//Increment by 1
            }//End try
            catch(Exception e){//Catch
                System.out.print("\nError!Number must be a double value: ");//Display error message
                input.next();//next line
            }//End catch
        }//End while

        displayResults(list);
        //sortAscending(list);


    }

    /**
     * Display results
     * @param list
     */
    public static void displayResults(double...list){
        sortAscending(list);

        System.out.println("\n\nSorted Array: ");
        for(double e:list)
            System.out.printf("%.2f\t", e);

    }
    /**
     * Sort array in ascending order using selection sort
     * @param list
     */
    public static void sortAscending(double...list){

        for(int i = list.length-1;i >= 0;i--){
            double currentMax = list[i];//Current max character
            int currentMaxIndex = i;//Current index

            for(int j = i-1;j>=0; j--){
                if(list[j] > currentMax) {//if list @ index j > currentMax
                    currentMax = list[j];//Store list[j] to currentMax
                    currentMaxIndex = j;//currentMaxIndex = j
                }

            }
            //Swap largest number with the last digit
            if(currentMaxIndex != i)
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            //System.out.print(list[i] + " ");
        }
    }
}
