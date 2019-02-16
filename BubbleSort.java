import java.util.Scanner;

public class BubbleSort {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        int i = 0;
        double [] list = new double[10];

        System.out.print("\nEnter 10 digits: ");
        // 93.3 57.4 74.9 130.40 67.98 110.0 78.29 89.21 175.30 98.1

        while(i < list.length){
            try{

                double num = input.nextDouble();//Input double value

                if(isValid(num)){
                    list[i] = num;//Add num to array when valid
                }
                else{
                    System.out.println("Error! Enter a number greater than 0: ");//Display error message
                    i--;//Decrement by 1 if num is not valid
                }


               i++;//Increment by 1
            }
            catch(Exception e){
                System.out.println("Error! Enter a valid double value: ");//Error message
                input.next();//Next line
            }
        }

        displayResults(list);//Call displayResults

    }

    /**
     * Display results
     */
    public static void displayResults(double...list){
        sortAscending(list);//Call sortAscending

        for(double num:list)
            System.out.printf("%.2f\t",num);//Display list array

    }
    /**
     * Soft in ascending order using bubble sort
     * @param list
     */
    public static void sortAscending(double [] list){

        boolean needNextPass = true;//needNextPass = true
        double temp;//Temp

        for(int k = 1; k < list.length && needNextPass; k++){
            //Next pass not needed
            needNextPass = false;//
            for(int i = 0; i < list.length - k; i++){
                //If element to the left is less than element to the right
                if(list[i] > list[i + 1]){
                    //Swap elements
                    temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true;//If a any element is not in order needNextPass is true
                }
            }

        }
    }

    /**
     * Determine whether number is valid
     * @param num
     * @return
     */
    public static boolean isValid(double num){
        if(num > 0)
            return true;//return true if num is > 0

        return false;//else return false
    }
}
