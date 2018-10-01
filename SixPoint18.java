import java.util.Scanner;

public class SixPoint18 {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        while(true) {
            try {

                System.out.print("\nPlease enter the a valid password: ");
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
        boolean validNumOfChars = false;

        if(password.length() >= 8){
            validNumOfChars = true;
        }

        return validNumOfChars;
    }

    /**
     * Checks if password consist of only letters and digits
     * @param password
     * @return true or false
     */
    public static boolean isDigitsAndLetters(String password){
        boolean isDigitsAndLetters = false;

        for(int index = 0; index < password.length(); index++){

            if((password.charAt(index) >= '0' && password.charAt(index) <= '9') || (password.charAt(index) >= 'A' && password.charAt(index) <= 'Z') ||
                    (password.charAt(index) >= 'a' && password.charAt(index) <= 'z')){

                isDigitsAndLetters = true;
            }

        }
        return isDigitsAndLetters;

    }

    /**
     * Check if password consist of at least two digits
     * @param password
     * @return true or false
     */
    public static boolean containsTwoDigits(String password){
        boolean containsTwoDigits = false;
        int counter = 0;

        for(int index = 0; index < password.length(); index++){

            if(password.charAt(index) >= '0' || password.charAt(index) <= '9')
                counter++;
        }


        if(counter > 2)
            containsTwoDigits = true;
        else
            containsTwoDigits = false;

        return containsTwoDigits;
    }
}
