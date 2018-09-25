import java.util.Scanner;

public class SixPoint12 {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of characters per line: ");
        int numbersPerLine = input.nextInt();


        System.out.println();
        printChars('1','Z', numbersPerLine);
    }
    public static void printChars(char ch1, char ch2, int numberPerLine){
        int count = 1;

        while(ch1 <= ch2){

            if(count % numberPerLine == 0){
                System.out.println(ch1 + " ");
            }
            else{
                System.out.print(ch1 + " ");
            }

            count++;
            ch1++;
        }
    }
}
