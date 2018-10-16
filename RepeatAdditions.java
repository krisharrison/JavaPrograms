import java.util.Scanner;
import java.util.InputMismatchException;
public class RepeatAdditions {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        int correctCount = 0;
        int numOfQuestions = 10;
        int questionCount = 0;
        long startTime = System.currentTimeMillis();
        String output = "";

        while(questionCount < numOfQuestions){
            try {
                int num1 = (int) ((Math.random() * 15) + 1);
                int num2 = (int) ((Math.random() * 15) + 1);

                System.out.print("What is " + num1 + " + " + num2 + "? ");
                int answer = input.nextInt();

                if (num1 + num2 == answer) {
                    System.out.println("\nCorrect!");
                    correctCount++;
                } else {
                    System.out.println("\nWrong! \n" + "The correct answer should be: " + (num1 + num2) + "\n");
                }

                questionCount++;

                output += "\n" + num1 + " + " + num2 + " = " + answer + ((num1 + num2 == answer) ? " Correct!" : " Wrong!");
            }catch(InputMismatchException e){

                System.out.println("Please enter an integer as an answer");
                input.next();

            }

        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        int seconds = (int)(testTime / 1000) % 60;
        int minutes = (int)((testTime / 1000) * 60) % 60;

        System.out.println("Correct Count: " + correctCount + "\nTest Time: " + minutes + " : " +
        seconds + "\n" + output);



    }
}
