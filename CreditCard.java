import java.util.Scanner;

public class CreditCard {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        long displayCreditCartNumber;
        int prefix;
        boolean isPrefixMatch;
        int size;
        long evenDoubledNumber = 0;//Doubled digits of credit card
        long oddDoubledNumber = 0;// Doubled digits of odd credit cards
        int count = 0; //Counter
        long evenDigit = 0; //Even digits number
        long oddDigit = 0; //Odd digit numbers
        int total = 0; //Total of odd and even placed numbers
        //4388576018402626
        //3734087203517768
        //4388576018410707


        while(true){//While Loop
            try{//Try

                System.out.print("\n\nEnter a valid number: ");
                long creditCard = input.nextLong();//Input from user

                displayCreditCartNumber = creditCard;
                size = getSize(creditCard);//Get credit card number size
                prefix = (int)getPrefix(creditCard);//prefix = getPrefix
                isPrefixMatch = prefixMatched(prefix);//pref = isPrefixMath


                while(creditCard != 0){//While

                    if(count % 2 != 0) {
                        evenDoubledNumber *= 10; //Shift numbers to the left
                        evenDigit = creditCard % 10; //Extract right most digit
                        evenDoubledNumber += getDigit((int) evenDigit);//Pass even digit through getDigit
                    }
                    else if(count % 2 == 0){
                        oddDoubledNumber *= 10; //Shift numbers to the left
                        oddDigit = creditCard % 10; //Extract right most digit
                        oddDoubledNumber += oddDigit;//Pass odd digit through getDigit
                    }

                    creditCard /= 10;//Eliminate right most digit


                    count++;//increment by 1
                }//End while

                total = sumOfDoubleEvenPlace((int)evenDoubledNumber) + (int)sumOfOddPlace((int)oddDoubledNumber); // Add the total of odd and even placed numbers

                if(isValid(total) == true && isPrefixMatch == true && (size >= 13 || size <= 16 )){//If
                    System.out.println(displayCreditCartNumber + " is Valid!");//Display positive results
                }//End if
                else{//Else
                    System.out.println(displayCreditCartNumber + " is Invalid!");//Display error message
                }//End else


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
    public static boolean isValid(int number){

        if(number % 10 == 0)
            return true;
        else
            return false;
    }

    /**
     * Sum of even number placed numbers
     * @param number
     * @return
     */
    public static int sumOfDoubleEvenPlace(int number){

        int total = 0;

        while(number != 0){

            total += number % 10;
            number /= 10;
        }

        return total;
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
  public static int sumOfOddPlace(int number){
      int total = 0;

      while(number != 0){

          total += number % 10;
          number /= 10;
      }

      return total;
    }

    /**
     *Return true if digit d is a prefix for number
     //* @param number
     //* @param d
     * @return
     */
    public static boolean prefixMatched(int prefix){
        int [] acceptedPrefix = {4,5,37,6};

        for(int i = 0; i < acceptedPrefix.length; i++){
            if( acceptedPrefix[i] == prefix){
                return true;
            }

        }

        return false;
    }

    /**
     *Return the number of digits
     * @param d
     * @return
     */
   public static int getSize(long d){
       int count = 0;
       long temp = 0;

       while(d != 0){
           temp *= 10;//Multiply temp by 10 to shift digits to the left
           temp += (d % 10);//add right most digit to temp
           d /= 10;//Divide d by 10

           count++;//count++
       }

       return count;//return count
    }

    /**
     *Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number.
     * @param number
     //* @param k
     * @return
     */
    public static long getPrefix(long number){
        long tempNumber = number; //TempNumber = number
        long temp = 0; // temp = 0
        int count = 0;// count = 0
        long firstDigit; //FirstDigit
        long secondDigit;//SecondDigit
        long divisor = 1;//Divisor

        while(tempNumber != 0){//while

            temp *= 10;//temp * 10
            temp += tempNumber % 10;//Temp + tempNumber
            tempNumber /= 10;//TempNumber / 10

            count++;//Increment by 1
        }//end while

        firstDigit = temp % 10;//firstDigit = temp % 10
        temp /= 10;
        secondDigit = temp % 10;//secondDigit = temp % 10*/
        temp /= 10;



        if(firstDigit == 3 && secondDigit == 7)//if
            count -= 2;//decrement by 2
        else//else
            count--;//decrement by 1

        for(int i = 0; i < count; i++){//for
            divisor *= 10;//divisor *= 10
        }//end for

        number /= divisor;//get prefix


        return number;//return number

    }
}
