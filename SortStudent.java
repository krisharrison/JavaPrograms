import java.util.Scanner;

public class SortStudent {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);//Scanner object called input
        int i = 0;//Count = 0;
        int numOfStudents;//Number of students


        System.out.print("Enter the number of students: ");//Display message

        //Get number of students
        while(true){
            try{//Try

                numOfStudents = input.nextInt();//Attain number of students

                if(isValid(numOfStudents)) {//If numOfStudents is valid
                    break;//Break;
                }
                else {
                    System.out.println("Error! Enter an integer for the number of students: ");//Display error message
                }
            }//End try
            catch(Exception e){//Catch
                System.out.println("Error! Enter a valid integer for the numbers of students: ");//Display error message
                input.next();//Next line
            }
        }//End catch

        String [] names = new String[numOfStudents];//Array of names
        int [] scores = new int[numOfStudents];//Array of scores
        String name;//student name
        int score;//Student score

        System.out.println();//Next Line

        //Get students names and scores
        while(i < numOfStudents){
            try{//Try

                name = input.next();//attain name input
                score = input.nextInt();//attain score input


                if(isNameValid(name) && isValid(score)){//If valid
                    names[i] = name;//names[i] = name
                    scores[i] = score;//scores[i] = score
                }//end if
                else{//Else
                    System.out.println("Error! Enter a valid name and score!");
                    i--;
                }//End else

                i++;
            }//End try
            catch(Exception e){//Catch
                System.out.println("Error! Enter a valid name or score!");//Display error message
                input.next();//Next line
            }//End catch
        }



    }

    /**
     * Displays results
     * @param names
     * @param scores
     */
    public static void displayResults(String [] names, int [] scores){

    }

    /**
     * Sort students in descending order
     * @param names
     * @param scores
     */
    public static void sortDecresing(String [] names, int [] scores){

        for(int i = 0; i < names.length - 1; i++){
            String currentMaxName = names[i];
            int currentMaxScore = scores[i];
            int currentMaxIndex = i;

            for(int j = i + 1; j < names.length; j++){
                if(names[i].toUpperCase().compareTo(currentMaxName.toUpperCase()) < 0){
                        
                }
            }
        }
    }

    /**
     * Validates number is greater than 0. Returns true. Else returns false.
     * @param num
     * @return
     */
    public static boolean isValid(int num){

        if(num > 0)
            return true;

        return false;
    }

    /**
     * Validates students name. Returns true if length of name is greater than 0 is valid. Else returns false.
     * @param name
     * @return
     */
    public static boolean isNameValid(String name){

        if(name.length() > 0)
            return true;

           return false;
    }

}
