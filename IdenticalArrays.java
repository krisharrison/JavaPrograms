import java.util.Scanner;

public class IdenticalArrays {
    public static void main(String [] arg){

        Scanner input = new Scanner(System.in);

        //list 1
        int list1Size;
        int [] list1;
        int list1Num;

        System.out.print("Enter list1: ");

        //Gain input for list1 and list2 size
        while(true){
            try{

                list1Size = input.nextInt();

                if(isValid(list1Size)){
                    //list1
                    list1 = new int[list1Size];
                    //Gain input for list1
                    for(int i = 0;i < list1.length;i++) {
                        list1Num = input.nextInt();
                        list1[i] = list1Num;
                    }

                    break;
                }
                else{
                    System.out.println("Error! Enter a valid number!");
                }
            }
            catch(Exception e){
                System.out.println("Error!Invalid numbers:\n");
                input.next();
            }
        }


        //list2
        int list2Size;
        int [] list2;
        int list2Num;

        System.out.print("Enter list2: ");

        //Gain input values for list1
        while(true){
            try{

                list2Size = input.nextInt();

                if(isValid(list2Size)){
                    //list1
                    list2 = new int[list2Size];
                    //Gain input for list1
                    for(int i = 0;i < list2.length;i++) {
                        list2Num = input.nextInt();
                        list2[i] = list2Num;
                    }

                    break;
                }
                else{
                    System.out.println("Error! Enter a valid number!");
                }
            }
            catch(Exception e){
                System.out.println("Error!Invalid numbers:\n");
                input.next();
            }
        }


        System.out.print("\nWould you like to would you like to find out if these two arrays are Strictly Identical or Identical: ");
        String response;
        String strictlyIdentical = "Strictly Identical";
        String identical = "Identical";

        while(true){
            try{
                    response = input.nextLine();

                    if(response.toUpperCase().equals(strictlyIdentical.toUpperCase())){
                        displayStrictly(list1,list2);
                        break;
                    }
                    else if(response.toUpperCase().equals(identical.toUpperCase())){
                        displayIdentical(list1,list2);
                        break;
                    }
                    else{
                        System.out.println("Error! Invalid input!\nChoose:  Strictly Identical or Identical");

                    }
            }
            catch(Exception e){
                System.out.println("Error!Invalid numbers:\n");
                input.next();
            }
        }


    }

    /**
     * Display results for Strictly Identical
     * @param list1
     * @param list2
     */
    public static void displayStrictly(int[] list1, int[] list2){

        if(strictlyIdentical(list1,list2) == true){
            System.out.println("Your two lists are strictly identical!\n");
        }
        else{
            System.out.println("Your two lists are not strictly identical!\n");
        }
    }

    /**
     * Display results for identical
     * @param list1
     * @param list2
     */
    public static void displayIdentical(int[] list1, int[] list2){
        if(identical(list1,list2) == true){
            System.out.println("Your two lists are identical!\n");
        }
        else{
            System.out.println("Your two lists are not identical!\n");
        }
    }

    /**
     * returns true if two lists are strictly identical
     * @param list1
     * @param list2
     * @return
     */
    public static boolean strictlyIdentical(int[] list1,int[] list2){

        int front = 0;//Front = 0
        int back = list1.length - 1;//Set back to list1 length

        while(front <= back){

            //If any elements in list1 are not equal in list2
            //return false;
            if(list1[front] != list2[front] || list1[back] != list2[back]) {
                return false;
            }

            front++;//Increment front by 1
            back--;//Decrement back by 1
        }
        return true;//return true
    }

    /**
     * Returns true if two arrays are identical
     * @param list1
     * @param list2
     * @return
     */
    public static boolean identical(int[] list1,int[] list2){

        //If not strictly identical then sort
        //When sorted, if they are strictly identical then they are identical
        if(!strictlyIdentical(list1,list2)){
            sortAscending(list1);
            sortAscending(list2);
            if(strictlyIdentical(list1,list2)){
                return true;//return true
            }
            else{
                return false;//return false
            }
        }

        return false;//return true
    }

    /**
     * Sort in ascending order
     * @param list
     *
     */
    public static void sortAscending(int[] list){

        for(int i=0;i<list.length - 1;i++){
            int currentMin = list[i];//Set currentMin1
            int currentMinIndex = i;//Set currentMinIndex1

            for(int j=i+1;j<list.length;j++){
                //sort list1
                if(list[j] < currentMin){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if(i != currentMin){
                //Swap to get lowest element in list1
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    /**
     * Determine whether number is valid
     * Number is valid when greater than 0
     * @param num
     * @return
     */
    public static boolean isValid(int num){

        if(num > 0)
            return true;//Return true

        return false;//return false
    }

}
