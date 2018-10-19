import java.util.Scanner;
import java.util.InputMismatchException;

public class HighestScore {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        String studentName="";
        String highestScoreName="";
        double studentScore;
        double highestScore= 0;
        int numOfStudents = -1;

        while(numOfStudents == -1) {
            try {
                System.out.print("Enter the num of Students: ");
                numOfStudents = input.nextInt();

                if(numOfStudents > 0){
                    break;
                }
                else{
                    System.out.println("Please enter a positive integer");
                }
            }catch(InputMismatchException e){
                System.out.println("Please enter a valid number of students");
                input.next();
            }
        }


        int studentNum = 1;

        while(studentNum <= numOfStudents) {
            try {
                for (studentNum = 1; studentNum <= numOfStudents; studentNum++) {

                    System.out.print("\nPlease enter a student name: ");
                    studentName = input.next();


                    System.out.print("Please enter the students score: ");
                    studentScore = input.nextDouble();

                    if (studentScore > highestScore) {
                        highestScore = studentScore;
                        highestScoreName = studentName;
                    }
                }
            } catch (InputMismatchException e) {

                System.out.println("Please enter a valid name and a valid age!\n");
                input.next();
            }

            System.out.println("\nThe Student With The Highest Grade Is: " + highestScoreName);
        }
    }
}
