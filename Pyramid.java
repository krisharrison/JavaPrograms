import java.util.Scanner;

public class Pyramid {
    public static void main(String [] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int userNum = input.nextInt();




        for(int i= 1; i <= userNum; i++){
            for(int j= userNum; j >= 1; j--){

                if(i > j){
                    System.out.print(j + 1);
                }
                else{

                    System.out.print(" ");
                }
            }

            for(int j= 0; j <= userNum; j++){

                if(i > j){
                    System.out.print((j + 1));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



    }
}
