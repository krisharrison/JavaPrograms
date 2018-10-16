public class DistanceConversions {
    public static void main(String [] args){

        System.out.println("Miles            Kilometers");

        for(int i = 1; i <= 10; i++) {
            System.out.print(i);
            for (int j = 0; j < 1; j++) {
                System.out.printf("%25.3f", i * 1.609);
            }

            System.out.println();
        }

    }
}
