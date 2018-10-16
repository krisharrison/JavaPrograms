import java.util.Scanner;
import java.util.InputMismatchException;

public class Pattern{
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

                    displayPattern();


    }
        public static void displayPattern(){
        int num = 3;
        for(int i = 1; i <= 4; i++){
                for(int j = 3; j >= 1; j--){

                    if(j < i){
                        System.out.print(num);
                    }
                    else{
                        System.out.print(" ");
                    }

                    num--;
                }
                num = 3;
                System.out.println("");
            }
    }
}
