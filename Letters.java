import java.util.Scanner;


public class Letters {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        while(true) {
            try {
                System.out.print("\nEnter a word: ");//gain input from user
                String word = input.next();//Store input into word

                if (isValid(word) == false) {//if word is not valid
                    System.out.print("\nPlease enter a valid word");//Display error message
                }//End If
                else {//Else
                    System.out.printf("\nThe number of letters in %s: %d", word, numOfChars(word));//Display results
                    break;
                }//End Else
            } catch (Exception e) {//Catch
                System.out.print("\nPlease enter a valid String");//Display error message
                input.next();
            }
        }

    }

    /**
     * count the number of letters in a word
     * @param word
     * @return int
     */
    public static int numOfChars(String word){
        return word.length();//Return word length
    }

    /**
     * Check if word is valid
     * @param word
     * @return boolean
     */
    public static boolean isValid(String word){
        //Array of invalid characters for user input
        char [] invalidChars = {0,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,91,92,93,94,95,96,123,124,125,126,127};
        boolean isValid = true;//Init isValid to true

        for(int index = 0; index < word.length(); index++){//Cycle through each character of word
            for(int invalidIndex = 0; invalidIndex < invalidChars.length; invalidIndex++){//Cycle through each element of invalid characters

                if(word.charAt(index) == invalidChars[invalidIndex]){//If a character from user input is equal to any element of invalidChars
                    isValid = false;//init isValid to false
                }
            }
        }

        return isValid;//return isValid
    }

}
