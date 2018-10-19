public class PrimeNumbers {
    public static void main(String[] args){




      displayPrimeNumbers();
      System.out.println();



    }
    public static void displayPrimeNumbers(){
        int numberOfPrimes = 1000;
        int numberOfPrimesPerLine = 9;
        int count = 0;
        int number = 0;

        while(number <= numberOfPrimes) {

        if(isPrime(number)){
            count++;
            if (count % numberOfPrimesPerLine == 0) {
                System.out.println();

            }
            else{
                System.out.print(number + " ");
            }

        }

            number++;


        }

    }
    public static boolean isPrime(int number){
        boolean isPrime;

        if(number % 2 == 0){
            isPrime = false;
        }
        else{

            isPrime = true;
        }

        return isPrime;

    }
}
