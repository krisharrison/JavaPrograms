import java.util.Scanner;

public class CheckPassword {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        while(true) {
            try {

                System.out.print("\n\nPlease enter the a valid password: ");
                String password = input.next();

                if(checkNumOfCharacters(password) == false){
                    System.out.print("\nInvalid! Enter a 8 or more characters!");
                }
                else if(isDigitsAndLetters(password) == false){
                    System.out.print("\nInvalid! Password must contain only digits and characters!");
                }
                else if(containsTwoDigits(password) == false){
                    System.out.print("\nInvalid! Password must contain at least two digits");
                }
                else{
                    System.out.print("\nPassword is valid!");
                    break;
                }


            } catch (Exception e) {
                System.out.print("\nPassword Invalid!");

                input.nextLine();
            }
        }





    }

    /**
     * Check if number of characters are valid
     * Characters are valid if there are 8 or more characters
     * @param password
     * @return true or false
     */
    public static boolean checkNumOfCharacters(String password){
        boolean validNumOfChars = false;//Init validNumOfChars to false

        if(password.length() >= 8){//If the length of password is 8 or greater
            validNumOfChars = true; //Init validNumOfChars to true
        }

        return validNumOfChars;//return value of validNumOfChars as a boolean
    }

    /**
     * Checks if password consist of only letters and digits
     * @param password
     * @return true or false
     */
    public static boolean isDigitsAndLetters(String password){
        boolean isDigitsAndLetters = true; //Init isDigitsAndLetters
        char [] invalidChars = {0,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,58,59,60,61,62,63,64,91,92,93,94,95,96,123,124,125,126,127};
        //Declare and init Array invalidChars to a list of invalid chars not allowed to be used in a password

        for(int index = 0; index < password.length(); index++) {//cycle through chars of password
            for (int invalidCharsIndex = 0; invalidCharsIndex < invalidChars.length; invalidCharsIndex++) {//cycle through invalid chars

                if (password.charAt(index) == invalidChars[invalidCharsIndex]) {//if a char from password is equal to any of the invalid characters in invalidChars array

                    isDigitsAndLetters = false; // set isDigitsAndLetters to false
                    break; //break loop
                }

            }
        }

        return isDigitsAndLetters;//return value of isDigitsAndLetters as a boolean
    }

    /**
     * Check if password consist of at least two digits
     * @param password
     * @return true or false
     */
    public static boolean containsTwoDigits(String password){
        boolean containsTwoDigits = false; //Init containsTwo digits to false
        char [] numbers = {'0','1','2','3','4','5','6','7','8','9'}; //Array of numbers as chars
        int counter = 0; // Init counter to 0; used to count the number of digits in password

        for(int index = 0; index < password.length(); index++){//cycle through each char of password
            for(int numsIndex = 0; numsIndex < numbers.length; numsIndex++){//cycle through numbers array of chars

                if(password.charAt(index) == numbers[numsIndex]){//if a char in the password is equal to any of the chars stored in array numbers increase counter by one
                    counter++;//increase counter by one
                }

            }
            if(counter >= 2){//if counter is 2 or more
                containsTwoDigits = true;//store true in containsTwoDigits to true
                break;//break out of loop
            }

        }


        return containsTwoDigits;//return containsTwoDigits
    }
}
