
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;


public class Factors {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an interger: ");
        int userNum = input.nextInt();

        int factorNum = 2;
        int factorTotal = 0;

        ArrayList<Integer> num = new ArrayList();

        while(factorNum < userNum){

            if(userNum % factorNum == 0){
                num.add(factorNum);

            }
            factorNum++;

        }
        System.out.println();
        for(int i = 0; i < num.size(); i++){

            if(userNum % num.get(i) == 0){
                userNum = userNum / num.get(i);
                System.out.print(+ num.get(i) + " ");
                --i;
            }
        }

        

    }
}
