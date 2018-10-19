public class DistanceConversionsTwo {
    public static void main(String [] args){

        System.out.println("Miles \t\t Kilometres | Kilometres \t\t Miles");

        int kiloRightSide = 20;

        for(int i = 1; i <= 10; i++){
            System.out.printf("%d %20.3f\t|", i, i * 1.609);
            for(int j = 0; j < 1; j ++){
                System.out.printf("%4d %20.3f", kiloRightSide, kiloRightSide / 1.609);
            }
            System.out.println();
            kiloRightSide = kiloRightSide + 5;

        }
    }
}
