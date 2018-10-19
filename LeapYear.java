
public class LeapYear {
    public static void main(String [] args){

        displayLeapYears();
    }
    public static void displayLeapYears(){
        final int NUMBER_PER_LINE = 10;
        int year = 101;
        int finalYear = 2100;
        int count = 0;

        while(year <= finalYear){

            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                count++;
                if(count % NUMBER_PER_LINE == 0){
                    System.out.println(year + " ");
                }
               else{
                    System.out.print(year + " ");
                }
            }

            year++;
        }
    }
}
