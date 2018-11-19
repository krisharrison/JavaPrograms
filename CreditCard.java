import java.util.Scanner;

public class CreditCard {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        while(true){//While Loop
            try{//Try

                System.out.print("\nEnter a valid number: ");
                long creditCard = input.nextLong();//Input from user

                long doubledCreditCard = 0;//Store doubled digits of credit card
                int count = 0;
                long digit = 0;
                long doubledDigit = 0;


                while(creditCard != 0){//While

                    System.out.println("Count: " + count + " Credit Card: " + creditCard);


                    if(count % 2 != 0) {
                        doubledCreditCard *= 10; //Shift numbers to the left
                        digit = creditCard % 10; //Extract right most digit
                        doubledCreditCard += getDigit((int) digit);//Pass digit through getDigit
                    }

                    creditCard /= 10;//Eliminate right most digit


                    //4388576018402626
                    //3434087203517768

                    count++;
                }//End while

                System.out.println("\n" + doubledCreditCard);
                break;
            }//End try
            catch(Exception e){//Catch
                System.out.println("Invalid credit card number!");//Display error message
                input.next();
            }//End catch
        }//End while

    }

    /**
     * Return true is card number is valid
     * @param number
     * @return
     */
    /*public static boolean isValid(int number){

    }

    /**
     * Sum of even number placed numbers
     * @param number
     * @return
     */
   /* public static int sumOfDoubleEvenPlace(int number){

    }

    /**
     *Return single number digit. If number it's two digits add to get a single digit
     * @param number
     * @return
     */
    public static int getDigit(int number){
        int count = 0;
        int temp = 0;
        int secondDigit;
        number *= 2;

        while(number != 0){
            temp *= 10;
            temp += number % 10;
            number /= 10;

            count++;
        }

        if(count == 2){
            secondDigit = temp % 10;
            temp /= 10;

            temp += secondDigit;

            return temp;
        }

        return temp;
    }
    /**
     *Return the sum of odd place digits
     * @param number
     * @return
     */
  /*  public static int sumOfOddPlace(int number){

    }

    /**
     *Return true if digit d is a prefix for number
     * @param number
     * @param d
     * @return
     */
    /*public static boolean prefixMatched(int number, int d){

    }

    /**
     *Return the number of digits
     * @param d
     * @return
     */
   /* public static int getSize(int d){

    }

    /**
     *Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number.
     * @param number
     * @param k
     * @return
     */
    /*public static int getPrefix(int number, int k){

    }*/
}
