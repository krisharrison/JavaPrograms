

public class Patterns {
    public static void main(String[] args) {



        for(int i= 1; i <= 6; i++){//Pattern A
            for(int j= 0; j <= 6; j++){

                if(i > j){
                    System.out.print((j + 1) + " ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

        System.out.println();

        for(int i= 6; i >= 1; i--){// Pattern B
            for(int j= 0; j <= 6; j++){

                if(i > j){
                    System.out.print(j + 1 + " ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

        System.out.println();

        int num = 7;

        for(int i= 1; i <= 6; i++){// Pattern C
            for(int j= 6; j >= 0; j--){

                if(i > j){
                    System.out.print(num);
                }
                else{

                    System.out.print(" ");
                }
                num--;
            }
            num = 7;
            System.out.println();
        }


        System.out.println();

        int displayedNum = 1;
        for(int i= 6; i > 0; i--) {// Pattern C
            if(i == 5){
                System.out.print("  ");
            }
            else if(i == 4){
                System.out.print("    ");
            }
            else if(i == 3){
                System.out.print("      ");
            }
            else if(i == 2){
                System.out.print("        ");
            }
            else if(i == 1){
                System.out.print("          ");
            }
            for (int j = 0; j < 7; j++){

                if(i > j){
                    System.out.print(displayedNum + " ");
                }

                displayedNum++;
            }
            displayedNum = 1;
            System.out.println();

        }


    }

}
