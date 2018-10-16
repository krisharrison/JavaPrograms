<<<<<<< HEAD:PrimeNumber.java
public class PrimeNumber {
=======
public class PrimeNumber{
>>>>>>> da761114ee7b5eecc0435747cc38436eb932e7d7:PrimeNumber.java
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
