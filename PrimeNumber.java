
public class PrimeNumber{

    public static void main(String [] args){
        displayPrimes();
    }
    public static void displayPrimes(){
            System.out.print("All prime numbers under 10000");
        for(int i = 1; i < 10000; i++){
            if( isPrime(i)){
                System.out.printf("\n %d", i);
            }
        }
    }
    public static boolean isPrime(int number){

        for(int divisor = 2; divisor < number; divisor++){
            if(number % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
