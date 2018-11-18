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


                while(creditCard != 0){//While

                    if(count % 2 == 0) {
                        doubledCreditCard *= 10;
                        doubledCreditCard += getDigit((creditCard % 10) * 2);
                        creditCard /= 10;
                    }

                    count++;
                }//End while

                System.out.println(doubledCreditCard);
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
    public static int getDigit(long number){
        int count = 0;
        int temp = 0;
        int secondDigit;

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
