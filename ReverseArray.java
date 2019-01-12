import java.util.Scanner;

public class ReverseArray{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        int i = 0;
        int numbers[] = new int[10];
        while(i<10){
            try{

                int userNum = input.nextInt();

                i++;
            }
            catch(Exception e){
                System.out.println("\nError! Enter a valid numbers!");
                input.next();
            }
        }

    }
    public static int[] reverseArray(int array[]){
        int copy[] = new int[10];

        for(int i = 0;)
    }
}
