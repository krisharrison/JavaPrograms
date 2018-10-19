public class Tuition {
    public static void main(String [] args){

        System.out.println("Year      Tuition \t");

        double tuition = 10000;
        int year = 1;
        double total = 0;

        while(year <= 14){



            if(year <= 10) {
                tuition = (tuition * .05) + tuition;

                System.out.printf("%d     \t$%.2f\t%n", year, tuition);
            }
            if( year > 10 && year <= 14){
                tuition = (tuition * .05) + tuition;
                total = total + tuition;
            }

            year++;

        }

        System.out.printf("%nThe total tuition for year 11-14: $%2.2f%n", total);


    }
}
