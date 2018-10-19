import java.util.Scanner;

public class PhoneKeypad {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        while(true){//While loop begins
            try{

                System.out.print("\nEnter in a phone number: \n");
                String phoneNumber = input.next();

                char number;

                if(isValid(phoneNumber)){//If phone number is valid
                    if(phoneNumber.length() == 13) {//if phone number contains hyphens
                        for(int index = 0; index < phoneNumber.length() - 7; index++){//Cycle through the first 6 digits of the phone number including hyphens
                                System.out.print(phoneNumber.charAt(index));//display the first 6 digits including hyphens
                        }
                        for (int index = 6; index < phoneNumber.length(); index++) {//cycle through last 7 digits of phone numbers

                            number = (char)getNumber(phoneNumber.toUpperCase().charAt(index));//pass index of phone number string through getNumber as upper case. Cast as char
                            number += 48;//48 to get corresponding ascii code of number
                            System.out.print(number); //display number as a char


                        }

                    }
                    else if(phoneNumber.length() == 11){//Else-if phone number doesn't have hyphens
                        for(int index = 0; index < phoneNumber.length() - 7; index++){ //Cycle through the first 4 digits of the phone number including hyphens
                                System.out.print(phoneNumber.charAt(index)); //Display first 6 digits
                        }
                        for (int index = 4; index < phoneNumber.length(); index++) {//cycle through last 7 digits of phone numbers

                            number = (char)getNumber(phoneNumber.toUpperCase().charAt(index)); //pass index of phone number string through getNumber as upper case. Cast as char
                            number += 48; //48 to get corresponding ascii code of number
                            System.out.print(number); //display number as a char
                        }

                    }//End else-if

                    break;//Break loop after resolve
                }//End if
                else{//Else
                    System.out.print("\nInvalid Phone Number!\n");//Error message for invalid number
                }//End else
            }
            catch(Exception e){//Catch
                System.out.println("Please enter a valid phone number! \n");//Displayed during garbage input
                input.next();
            }//End Catch
        }//End While



    }

    /**
     * Finds the corresponding number to each letter using the international standard letter/number mapping
     * @param letter
     * @return int
     */
    public static int getNumber(char letter){

        int correspondingNumber = 0;

        if(letter == 'A' || letter == 'B' || letter == 'C')
            correspondingNumber = 2;
        else if(letter == 'D' || letter == 'E' || letter == 'F')
            correspondingNumber = 3;
        else if(letter == 'G' || letter == 'H' || letter == 'I')
            correspondingNumber = 4;
        else if(letter == 'J' || letter == 'K' || letter == 'L')
            correspondingNumber = 5;
        else if(letter == 'M' || letter == 'N' || letter == 'O')
            correspondingNumber = 6;
        else if(letter == 'P' || letter == 'Q' || letter == 'R' || letter == 'S')
            correspondingNumber = 7;
        else if(letter == 'T' || letter == 'U' || letter == 'V')
            correspondingNumber = 8;
        else if(letter == 'W' || letter == 'X' || letter == 'Y' || letter == 'Z')
            correspondingNumber = 9;

        return correspondingNumber;
    }

    /**
     * Check if word is valid
     * @param phoneNumber
     * @return boolean
     */
    public static boolean isValid(String phoneNumber){

        boolean isValid = false;



        if(phoneNumber.length() == 13 && Character.getNumericValue(phoneNumber.charAt(0)) == 1 && phoneNumber.charAt(1) == '-' && Character.getNumericValue(phoneNumber.charAt(2)) == 8
                && Character.getNumericValue(phoneNumber.charAt(3)) == 0 && Character.getNumericValue(phoneNumber.charAt(4)) == 0 && phoneNumber.charAt(5) == '-')
            isValid = true;

        else if(phoneNumber.length() == 11 && Character.getNumericValue(phoneNumber.charAt(0)) == 1 && Character.getNumericValue(phoneNumber.charAt(1)) == 8
                &&  Character.getNumericValue(phoneNumber.charAt(2)) == 0 && Character.getNumericValue(phoneNumber.charAt(3)) == 0)
            isValid = true;

        return isValid;
    }
}
