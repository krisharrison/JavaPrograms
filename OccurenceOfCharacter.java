import java.util.Scanner;

public class OccurenceOfCharacter {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        while(true) {//While begin
            try {//Try Begin
                System.out.print("\nPlease enter in a word: ");
                String word = input.next();//input from user for word

                System.out.print("\nPlease enter in a character: ");
                char letter = input.next().charAt(0);//input for wanted letter

                if((isValid(word) == true && isLetterValid(letter) == true)){//Begin If

                    System.out.printf("\nNumber of times %c appears in %s is %d",letter,word,charCount(word,letter));//Display results
                    break;

                }//End if
                else{//Begin else
                    System.out.print("\nInvalid Word or Letter!");
                }//End else


            } //End Try
            catch (Exception e) {//Catch Begin
                System.out.print("\nInvalid word!");//Display error message
                input.next();//Next
            }//End Catch
        }//End while

      
    }

    /**
     *Count the number of times a requested character appears in a given string
     * @param word
     * @param letter
     * @return Integer
     */
    public static int charCount(String word, char letter){
        int count = 0;//Declare count. Init 0

        if(letter >= 97 && letter <= 122){//If Letter is lower case

            letter -= 32;//Convert lower case to upper case

        }//End If

        for(int index=0;index<word.length();index++){//Begin For

            if(word.toUpperCase().charAt(index) == letter)//Begin If
                count++;

        }//End For

        return count;// Return count
    }

    /**
     * Find out if a word is valid. A word is valid if it consist of only letters
     * @param word
     * @return boolean
     */
    public static boolean isValid(String word){
        boolean isValid = true;//Declare isValid. Init true.
        char [] invalidChars = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,
                43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,91,92,93,94,95,96,123,124,125,126,127};
        //Declare and init Array invalidChars to a list of invalid chars not allowed to be used in a password

        for(int index=0; index < word.length();index++){//Outer For Begin
            for(int index2 = 0; index2 < invalidChars.length; index2++){//Inner For Begin
                    if(word.charAt(index) == invalidChars[index2]) {
                        isValid = false;
                        break;
                    }
            }//End Inner For
        }//End Outer For

        return isValid;//Return isValid
    }

    /**
     * Check if letter entered by user is valid
     * @param letter
     * @return boolean
     */
    public static boolean isLetterValid(char letter){

        boolean isValid = true;//Declare isValid. Init true.
        char [] invalidChars = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,
                43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,91,92,93,94,95,96,123,124,125,126,127};
        //Declare and init Array invalidChars to a list of invalid chars not allowed to be used in a password


            for(int index2 = 0; index2 < invalidChars.length; index2++){//Inner For Begin
                if(invalidChars[index2] == letter) {//If Begin
                    isValid = false;//isValid init false
                    break;//Break loop
                }
            }//End Inner For


        return isValid;//Return isValid
    }

}
