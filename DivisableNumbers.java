public class DivisableNumbers {
    public static void main(String [] args){

        final int NUMS_PER_LINE= 10;
        int lineCounter = 0;
        int num = 100;


        while (num <= 1000) {


            if((num % 5 == 0 && num % 6 != 0) || (num % 6 == 0 && num % 5 != 0)){
                if(lineCounter > 10){
                    System.out.print("\n");
                    lineCounter = 0;
                }
                else {
                    System.out.print(num + " ");
                    lineCounter++;
                }
            }

            num++;


        }

    }
}
