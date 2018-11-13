public class TwinPrimes {
    public static void main(String [] args){


        displayTwinPrimes();//Call displayTwinPrimes
    }

    /**
     * Display twin primes
     */
    public static void displayTwinPrimes(){
        int previousPrime = 0;//Init previousPrime = 0
        int nextPrime = 0;//Init nextPrime = 0
        int counter = 0;//Init counter = 0

        for(int num = 2; num < 1000; num++){//For loop
            if(isPrime(num)) {//If num is prime
                nextPrime = num;//Init nextPrime to num
                if (previousPrime > 0 && nextPrime - previousPrime == 2) {//Inner If - nextPrime minus previousPrime
                    System.out.printf("\t(%d,%d)\n",previousPrime,nextPrime);//Display previous and next prime
                }//End for looop
            }//End outer if

            previousPrime = nextPrime;//Init previousPrime to nextPrime

        }
    }
    /**
     * Is number prime
     * @param num
     * @return
     */
    public static boolean isPrime(int num){

        for(int divisor = 2; divisor < num; divisor++){ //For
            if(num % divisor == 0){//if num is divisable by divisor
                return false;//Return false
            }//End if
        }//End for loop
        return true; //Return true
    }
}
