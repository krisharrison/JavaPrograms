import java.util.Scanner;

public class Sorted {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);//Scanner
        int numOfNums;//size of array

        System.out.print("Enter list: ");//Display message

        while (true) {//while true
            try {
                numOfNums = input.nextInt();//gain input from user

                //If number is valid
                if(isValid(numOfNums))
                    break;//Break
                else
                    System.out.println("\nError!Number entered must be greater than 0\nEnter List");//Error message


            } catch (Exception e) {
                System.out.println("\nError!Number must be an integer\nEnter list: ");//Error message
                input.next();//Next line
            }
        }//End while

        int list[] = new int[numOfNums];//array call list
        int i = 0;//Index
        int userNum;//userNum

        while (i < list.length){//While i < list.length
            try {

                userNum = input.nextInt();//User input
                list[i] = userNum;//Insert element in array

                i++;
            } catch (Exception e) {//Catch
                System.out.println("Error!\nEnter list: ");//Error message
                input.next();//Next Line
            }//End catch
        }//End while

        displayResults(list);
    }

    public static void displayResults(int...list){
        if(isSorted(list))
            System.out.println("\nThis list is sorted!");
        else
            System.out.println("\nThis list is not sorted!");
    }
    /**
     * Determines whether array is sorted
     * @param list
     * @return
     */
    public static boolean isSorted(int [] list){

        int front = 0;//Front = 0
        int back = list.length - 1;//Back = list.length - 1

        while(front <= back){//while front <=  back

            //Determine whether elements are sorts in ascending order
            if(list[front] <= list[front+1] || list[back-1] <= list[back]){
                return true;//Return false
            }


            front++;//increment from by 1
            back--;//decrement back by 1
        }
        return false;
    }

    /**
     * Number is valid when greater than 0
     * @param num
     * @return
     */
    public static boolean isValid(int num){
        if(num > 0)
            return true;

        return false;
    }
}
