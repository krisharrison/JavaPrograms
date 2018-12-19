import java.util.Scanner;

public class AnalyzeScores {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);



        while(true){
            try{
                System.out.print("\n Enter the number of scores you would like to enter: ");
                int numOfScores = input.nextInt();
                int scores[] = new int[numOfScores];

                System.out.println("\n Enter the scores: ");
                for(int i = 0; i < scores.length;i++){
                    scores[i] = input.nextInt();
                }

                displayNumbers(scores);
                break;
            }catch(Exception e){
                System.out.println("\nError! Please enter a valid number: ");
            }
        }
    }

    /**
     * Display the results
     * @param numbers
     */
    public static void displayNumbers(int[] numbers){
        double average = calcAverage(numbers);
        System.out.print("Numbers that are below the average of " + average + ": ");
        for(int num:numbers){//Process array
            if(num < average)
                System.out.print(num + ", ");//Display results
        }
    }

    /**
     * Calculate the average of an array
     * @param numbers
     * @return
     */
    public static double calcAverage(int[] numbers){
        double average;//Average
        double total = 0;//Total

        //Process array
        //Add to total
        for(int i = 0; i < numbers.length; i++){
            total += numbers[i];
        }

        average = total / numbers.length;//Calculate average of all elements

        return average;//return average
    }
}
