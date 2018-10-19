public class CancellationErrors {
    public static void main(String [] args){

        System.out.print("Left to right: " + addLefttoRight());
        System.out.print("\nRight to left: " + addRighttoLeft());

    }
    public static double addLefttoRight(){
        double total = 1;

        for(double n = 2; n <= 50000; n++){
            total += (1/n);
        }

        return total;
    }
    public static double addRighttoLeft(){
        double total = 0;

        for(double n = 5000; n > 2; n--){
            total += (1/n);
        }
            total += 1;
        return (total);
    }
}
