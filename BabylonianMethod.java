import java.util.Random;
import java.util.Scanner;

public class BabylonianMethod {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

    }
    public static double sqrt(int n){
        double sqrt = 0.0;
        int guess = 1 + n;
        Random num = new Random();
        num.nextInt(guess);
        int lastGuess =  num.nextInt(guess);
        int nextGuess = 0;


        while (true){

            nextGuess = (lastGuess + n / lastGuess) / 2;
            lastGuess = nextGuess;
        }
        return sqrt;
    }
}
