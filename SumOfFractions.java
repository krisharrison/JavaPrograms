public class SumOfFractions {
    public static void main(String [] args){

        System.out.print("The sum is: " + calcSum());
    }
    public static double calcSum(){
        double numerator = 1;
        double demoninator = 3;
        double sum = 0;

        while(demoninator <= 99.0){

            sum += (numerator / demoninator);

            numerator += 2;
            demoninator +=2;
        }

        return sum;
    }
}
