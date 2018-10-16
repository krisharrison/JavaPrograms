import java.math.BigDecimal;

public class ComputeE {
    public static void main(String [] args){

        computeE();

    }
    public static void computeE(){
        int denominator = 1;
        double e = 1;


        for(int i = 10000; i <= 100000; i+=10000){
            for(int j = 0; j < i; j++){

                e += (1/(getFactorial(denominator)));

                denominator++;
            }
            System.out.print("\n" + i + " iterations: " + e);
            denominator = 1;
            e = 1;
        }

    }
    public static double getFactorial(int factorialOf){
        int num = factorialOf;
        double factorial = 1;

       while(num > 0){

           factorial *= num;

            num--;
        }

        return factorial;
    }
}
