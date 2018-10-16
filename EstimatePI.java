public class EstimatePI {
    public static void main(String [] args){

        displayM();

    }
    public static void displayM(){
        double m = 1;
        final double NUMERATOR = 1;
        double denominator = 3;
        char plus = '+';
        char minus = '-';
        char sign = minus;



        System.out.print("i\t\t\tm(i)" + "\n-------------------");
        for(int i = 1; i <= 901; i += 100){
            for(int j = 1; j < i; j++){

                if(sign == minus){

                    m -= calcM(NUMERATOR, denominator);
                    sign = plus;
                }
                else if(sign == plus){

                    m += calcM(NUMERATOR, denominator);
                    sign = minus;
                }

                denominator += 2;


            }
            m *= 4;
           System.out.printf("\n%d\t\t\t%.4f",i, m);
            m = 1;
            sign = minus;
            denominator = 3;

        }


    }
    public static double calcM(double numerator, double denominator){

        return numerator / denominator;
    }
}
