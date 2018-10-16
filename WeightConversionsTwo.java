public class WeightConversionsTwo {
    public static void main(String [] args){

        System.out.println("Kilograms   Pounds  \t|      Pounds    Kilograms");
        int kilosRightSide = 20;

        for(int i = 1; i <= 199; i+=2){
            System.out.printf("%d %15.1f   \t|",i, i * 2.2);

            for(int j = 0; j < 1; j++){
                System.out.printf("%10d \t\t%4.2f", kilosRightSide, kilosRightSide / 2.2);
            }
            System.out.println();
            kilosRightSide = kilosRightSide + 5;
        }
    }
}
