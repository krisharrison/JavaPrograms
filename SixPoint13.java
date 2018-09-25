public class SixPoint13 {
    public static void main(String [] args){

        displayM();
    }
    public static void displayM(){
        System.out.print("i\t\t\tm(i)");
        double numerator = 1;
        double denominator = 2;
        double result = 0;
        double quotient = 0;

        for(int i = 1; i <= 20; i++){

            result += calcM(numerator,denominator);
            System.out.printf("\n%d\t\t\t%.4f",i,result);
            numerator ++;
            denominator++;
        }
    }
    public static double calcM(double numerator, double denominator){

        return numerator / denominator;
    }
}
