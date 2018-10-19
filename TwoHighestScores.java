import java.util.Scanner;
import java.util.InputMismatchException;

public class TwoHighestScores {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        int numOfStudents= -1;
        int studentNum= 1;
        String bestStudent= "";
        String secondBestStudent="";
        double bestScore = 0;
        double secondBestScore= 0;

        while(numOfStudents == -1){
            try{
                System.out.print("Please enter the number of students: ");
                numOfStudents = input.nextInt();

                if(numOfStudents > 0){
                    break;
                }
                else{
                    System.out.println("\nPlease enter a positive number!");
                }
            }catch(InputMismatchException e){
                System.out.println("\nPlease enter a valid number for the number of students!");
                input.next();
            }
        }

        while(studentNum <= numOfStudents){

            try{

                System.out.print("\n Please enter a student name: ");
                String studentName = input.next();

                System.out.print(" Please enter a score: ");
                double score = input.nextDouble();

                if(score > bestScore){
                    bestScore = score;
                    bestStudent = studentName;
                }
                else if(score < bestScore && score > secondBestScore){
                    secondBestScore = score;
                    secondBestStudent = studentName;
                }

                studentNum++;
            }catch(InputMismatchException e){
                System.out.println("Please enter a valid student name or score: ");
                input.next();
            }

        }

        System.out.println("\nStudent with the highest score: " + bestStudent + "\n"  +
                "Second highest score: "  + secondBestStudent);

    }
}
