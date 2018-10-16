public class AsciiTable {
    public static void main(String [] args){

        char letter =  '\u0000';

        final int NUM_OF_LINES = 10;
        int count = 0;

        // top 0 - 1
        for(int i = 0; i < 10; i++) {
            if(i == 0){
                System.out.print("    ");
            }
            System.out.printf("   %d", i);
        }

        //top border
        System.out.println();
        for(int i = 0; i < 45; i++) {
            System.out.print("-");
        }


        System.out.println("");
        //side of numbers and border
        for(int i = 0; i < 13; i++){
            System.out.print(i + "\t|");
            for(int j = 0; j < 10; j++){
                //display the letter
                System.out.print(" " + " " + letter++ + " ");
            }
            //side border
            System.out.println("");
            System.out.println("\t|");
        }

    }
}
