public class PI {
    public static void main(String [] args){

        double PI = 1;
        double demoninator = 3;
        char plus = 43;
        char minus = 45;
        char sign = minus;


        for(int i = 10000; i <= 100000; i+= 10000) {
            for (int j = 0; j <= i; j++) {
                if (sign == plus) {
                    PI += (1 / demoninator);
                    sign = minus;

                } else if (sign == minus) {
                    PI -= (1 / demoninator);
                    sign = plus;
                }

                demoninator += 2;
            }
            PI *= 4;
            System.out.print("\n" + i + " iterations: " + PI);
            PI = 1;
            sign = minus;
            demoninator = 3;
        }


    }

}
